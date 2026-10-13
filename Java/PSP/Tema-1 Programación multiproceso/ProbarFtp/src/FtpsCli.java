import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.ftp.FTPSClient;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.net.ftp.FTP;

public class FtpsCli {
	   static public void main(String[] args) {
		  // Datos para la conexion
		  String server = "127.0.0.1";
	      String username = "anonymous";	// Home en servidor /srv/ftp
	     //  String username = "debian";	// Home en servidor /home/debian
	      String password = "debian";		// Da igual si anonymous o contrasena del usuario debian

	      // Cliente de conexion a FTP
	      FTPSClient ftp = new FTPSClient();

	      int respuesta, i;
	      String[] lista;

	      try{
	            // Conectando e identificandose con el servidor
	            System.out.println("CONECTANDO AL SERVIDOR FTP");
	            ftp.connect(server);
	            ftp.login(username, password);

	            // Entrando a modo pasivo
	            ftp.enterLocalPassiveMode();
	            ftp.setFileType(FTP.BINARY_FILE_TYPE);

	            // Obteniendo respuesta del servidos
	            respuesta = ftp.getReplyCode();
	            System.out.println("RESPUESTA " + respuesta);
	            ftp.execPROT("P");		// Informacion encriptada por tls
	            
	            // Si la respuesta del servidor indica podemos pasar. Procedemos
	            if(FTPReply.isPositiveCompletion(respuesta) == true ) {
	                  System.out.println("LISTANDO ARCHIVOS");
	                 
	                  lista = ftp.listNames();

	                  for(i=0; i<lista.length; i++) {

	                        System.out.println(lista[i]);
	                  }
		        } 	// Si no avisamos	
		        else { 
		              System.out.println("ERROR DE CONEXION");
		        }

		        // Sacando por terminal el fichero descargado
		        // boolean bRec = ftp.retrieveFile("desftp/bajar.txt", System.out);	
		            
		        // Descargar un fichero
		        OutputStream os = new BufferedOutputStream(new FileOutputStream("//home//debian//Desktop//bajado.txt"));
		        boolean bRec = ftp.retrieveFile("desftp/bajar.txt", os);
		        os.close();
		            
		        if(bRec) {
		          	System.out.println("Fichero descargado");
		        }
		        else {
		          	System.out.println("Fichero no descargado");
		        }
		            
		        // Subir un fichero
		        File ficheroLocal = new File("//home//debian//Desktop//bajado.txt");
		        InputStream is = new FileInputStream(ficheroLocal);
		        boolean env = ftp.storeFile("desftp/" + ficheroLocal.getName(), is);
		        is.close();

		        if(env) {
		           	System.out.println("Fichero subido");
		        }
		        else {
		           	System.out.println("Fichero no subido");
		        }
		            
		        // En ambos casos terminaos sesion
		        ftp.logout();
		        // Y nos desconectamos
		        ftp.disconnect();

		        // Esta excepcion se lanza en caso de algun error durante el proceso
		  }
	      catch(IOException e) {
		        System.out.println("Error de conexion");
		  }
	   }
}
