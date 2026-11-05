package EjerciciosPropuestosRepaso;


import java.io.File;
import java.io.RandomAccessFile;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        String[] nombre = {"Acceso a datos", "Desarrollo de interfaces", "PSP"};
        int[] horas = {200,160,250};
        String[] curso = {"2º","2º","2º"};
        RandomAccessFile accesoAleatorio = new RandomAccessFile(new File("modulos.dat"), "rw");
        accesoAleatorio.setLength(0);

        for(int i = 0; i<nombre.length;i++){
            StringBuilder sb = new StringBuilder(nombre[i]);
            sb.setLength(30);
            accesoAleatorio.writeChars(sb.toString());

            accesoAleatorio.writeInt(horas[i]);

            sb = new StringBuilder(curso[i]);
            sb.setLength(2);
            accesoAleatorio.writeChars(sb.toString());
        }

        accesoAleatorio.seek(0);
        while(accesoAleatorio.getFilePointer() < accesoAleatorio.length()){
            char[] arrayNombre = new char[30];
            for(int i = 0 ; i< 30;i++){
                char letra = accesoAleatorio.readChar();
                arrayNombre[i] = letra;
            }
            String resultadoNombre = new String(arrayNombre);

            int resultadoHoras = accesoAleatorio.readInt();

            char[] arrayCurso = new char[2];
            for(int i = 0 ; i< 2;i++){
                arrayCurso[i] = accesoAleatorio.readChar();
            }
            String resultadoCurso = new String(arrayCurso);

            System.out.println("Nombre: "+resultadoNombre+" horas: "+resultadoHoras+" curso: "+resultadoCurso);
        }
        accesoAleatorio.close();
    }
}
