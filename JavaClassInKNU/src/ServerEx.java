import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) throws IOException {
		
		//�������� ������(Socket) �������
		ServerSocket s = new ServerSocket(8888); //������ ������ ���鶧 �����ִ� ģ���� ����. Ŭ���̾�Ʈ ������ ����ϱ� ���ؼ� 8888�Է��ص�
		
		while(true) { //���ѷ��� ����
			System.out.println("��������")
			Socket server = s.accept(); // Ŭ���̾�Ʈ ������ ��� -> Ŭ���̾�Ʈ�� ���ӽ� Ŭ���̾�Ʈ�� ��Ī�Ǵ� �������� �����ϰ� ��.
			InputStream is = server.getInputStream();
			byte[] b = new byte[256];
			is.read(b);
			String msg = new String(b);
			System.out.println( msg.trim() );
			System.out.println("������")
		} // ���ѷ��� ��
	}

}
