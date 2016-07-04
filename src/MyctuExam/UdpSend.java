/**
 * 
 */
package MyctuExam;

import java.net.*;

/**
 * @author 人
 *
 */
class UdpSend {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//1、建立updsocket
		DatagramSocket da = new DatagramSocket();
		//2、提供数据  DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		byte[] buf = "yutao".getBytes();
		DatagramPacket de = new DatagramPacket(buf,buf.length,InetAddress.getByName("localhost"),10000);
		//3、通过socket服务的发送功能，将数据包发送出去
		da.send(de);
		//4、关闭资源
		da.close();
	}

}
