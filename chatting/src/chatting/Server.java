package chatting;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/* 서버 구현 기능 목록 
 * (1) client 들의 접속을 지속적으로 대기
 * (2) client 접속 후 해당  client와 통신을 위한 종이컵(socket)생성
 * (3) client에서 보내오는 데이터를 지속적으로 수신
 * (4) 수신된 메시지를 모든 클라이언트에서 전송 
*/
class ServerThread extends Thread {
	Socket server;

	public ServerThread(Socket server) {
		this.server = server;
	}

	@Override
	public void run() {
			try {
				//(3) client에서 보내오는 데이터를 지속적으로 수신
				InputStream is = server.getInputStream();
				while(true) {
					byte[] b = new byte[256];
					is.read(b);
					//(4) 수신된 메시지를 모든 클라이언트에서 전송 
					for(int i=0 ; i<Server.total_socket.size();i++) {
						Socket tempSocket = (Socket)Server.total)_socket.get(i);
						tempSocket.getOutputStream().write(b);
					}
				}
 			}catch(Exception e) {
 				System.out.println("메시지 수신오류");
 			}
	}
}

public class Server {
	static ArrayList total_socket = new ArrayList();
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		while (true) {
//			(1) client 들의 접속을 지속적으로 대기
//			(2) client 접속 후 해당  client와 통신을 위한 종이컵(socket)생성
			Socket server = ss.accept();
			total_socket.add(server);
			// 접속된 client 메시지를 수신 - 다른 모든 client에 메시지 전송을
			// 수행하기 위한 ServerThread 구동
			new ServerThread(server).start();
		}
	}
}
