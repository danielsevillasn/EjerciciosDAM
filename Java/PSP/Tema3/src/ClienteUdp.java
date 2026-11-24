import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClienteUdp {
	static public void main(String[] args) {
// Envio de un datagrama UDP
		InetAddress eqServ = null;
		DatagramSocket socketUdp = null;
		int iPuerto = 20000;
		try {
			eqServ = InetAddress.getByName("127.0.0.1");
// eqServ = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		String sInfoEnv = "Mensaje desde el cliente";
		byte[] bArrEnv = sInfoEnv.getBytes();
		DatagramPacket dp = new DatagramPacket(bArrEnv, bArrEnv.length, eqServ, iPuerto);
		System.out.println("Msg Env: " + new String(bArrEnv));
		try {
			socketUdp = new DatagramSocket();
			socketUdp.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
// Lectura de un datagrama UDP
		byte[] bArrRec = new byte[200];
		DatagramPacket dpL = new DatagramPacket(bArrRec, bArrRec.length, eqServ, iPuerto);
		try {
			socketUdp.receive(dpL);
			System.out.println(new String(bArrRec));
		} catch (IOException e) {
			e.printStackTrace();
		}
		socketUdp.close();
	}
}