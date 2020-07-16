import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) throws IOException {
		
		//서버에서 종이컵(Socket) 생성방법
		ServerSocket s = new ServerSocket(8888); //서버의 소켓을 만들때 도와주는 친구를 말함. 클라이언트 접속을 대기하기 위해서 8888입력해둠
		
		while(true) { //무한루프 시작
			System.out.println("서버시작")
			Socket server = s.accept(); // 클라이언트 접속을 대기 -> 클라이언트가 접속시 클라이언트와 매칭되는 종이컵을 생성하게 됨.
			InputStream is = server.getInputStream();
			byte[] b = new byte[256];
			is.read(b);
			String msg = new String(b);
			System.out.println( msg.trim() );
			System.out.println("서버끝")
		} // 무한루프 끝
	}

}
