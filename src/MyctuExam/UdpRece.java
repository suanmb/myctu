/**
 * 
 */
package MyctuExam;

import java.net.*;
import java.io.IOException;
import java.net.SocketException;
/**
 * @author 人
 *
 */
class UdpRece {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{DatagramSocket da = new DatagramSocket(10000);
		byte[] buf = new byte[1024];
		DatagramPacket de = new DatagramPacket(buf, buf.length);
		da.receive(de);
		System.out.println(de.getAddress().getHostAddress());
		System.out.println(new String(de.getData(), 0, de.getLength()));
		da.close();
		}catch(Exception e){ e.printStackTrace();}
	}

}
