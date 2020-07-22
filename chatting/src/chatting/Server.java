package chatting;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/* ���� ���� ��� ��� 
 * (1) client ���� ������ ���������� ���
 * (2) client ���� �� �ش�  client�� ����� ���� ������(socket)����
 * (3) client���� �������� �����͸� ���������� ����
 * (4) ���ŵ� �޽����� ��� Ŭ���̾�Ʈ���� ���� 
*/
class ServerThread extends Thread {
	Socket server;

	public ServerThread(Socket server) {
		this.server = server;
	}

	@Override
	public void run() {
			try {
				//(3) client���� �������� �����͸� ���������� ����
				InputStream is = server.getInputStream();
				while(true) {
					byte[] b = new byte[256];
					is.read(b);
					//(4) ���ŵ� �޽����� ��� Ŭ���̾�Ʈ���� ���� 
					for(int i=0 ; i<Server.total_socket.size();i++) {
						Socket tempSocket = (Socket)Server.total)_socket.get(i);
						tempSocket.getOutputStream().write(b);
					}
				}
 			}catch(Exception e) {
 				System.out.println("�޽��� ���ſ���");
 			}
	}
}

public class Server {
	static ArrayList total_socket = new ArrayList();
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		while (true) {
//			(1) client ���� ������ ���������� ���
//			(2) client ���� �� �ش�  client�� ����� ���� ������(socket)����
			Socket server = ss.accept();
			total_socket.add(server);
			// ���ӵ� client �޽����� ���� - �ٸ� ��� client�� �޽��� ������
			// �����ϱ� ���� ServerThread ����
			new ServerThread(server).start();
		}
	}
}
