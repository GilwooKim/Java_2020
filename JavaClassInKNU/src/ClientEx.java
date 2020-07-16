import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextField;

class ClientGUI extends JFrame implements ActionListener {
	JTextField jf;

	public ClientGUI() {
		jf = new JTextField(20);
		add(jf);
		jf.addActionListener(this); // 입력창 감시 * Enter 입력을 감시
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocation(100, 100);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Client 파트 종이컵(Socket) 생성방법
		try {
			Socket client = new Socket("155.230.57.60", 8888); // 통신할 PC의 IP와 포트넘버
			OutputStream os = client.getOutputStream();
			String msg = jf.getText();
			os.write(msg.getBytes());
			jf.setText("");
		} catch (Exception ignore) {
			System.out.println("서버전송오류");
		}
	}
}

public class ClientEx {

	public static void main(String[] args) throws UnknownHostException, IOException {

		new ClientGUI();

	}

}
