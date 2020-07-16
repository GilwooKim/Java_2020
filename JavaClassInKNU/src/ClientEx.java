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
		jf.addActionListener(this); // �Է�â ���� * Enter �Է��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocation(100, 100);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Client ��Ʈ ������(Socket) �������
		try {
			Socket client = new Socket("155.230.57.60", 8888); // ����� PC�� IP�� ��Ʈ�ѹ�
			OutputStream os = client.getOutputStream();
			String msg = jf.getText();
			os.write(msg.getBytes());
			jf.setText("");
		} catch (Exception ignore) {
			System.out.println("�������ۿ���");
		}
	}
}

public class ClientEx {

	public static void main(String[] args) throws UnknownHostException, IOException {

		new ClientGUI();

	}

}
