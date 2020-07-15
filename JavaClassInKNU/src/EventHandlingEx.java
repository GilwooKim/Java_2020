import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	1. ���� Ŭ������ �����ʸ� �����ϴ� ���
	class MyFrame implements ActionListener{
	2. �ܺο��ٰ� ����� ���
*/

class MyFrame implements ActionListener{

	JFrame jf;
	JButton b;
	
	
	//(3) ������ ��� : �ܺ�Ŭ������ �ִ� UI �ڿ� ����� ��������.
	class MyListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("(3)�� ������� �̺�Ʈ ó��");
		}
	}
	
//	//(4) �׹�° ��� : �͸� ���� Ŭ������ Listener �����ؼ� �����. : �̸��� ���� Ŭ���� - Ŭ���� �̸��� �ش� ����ΰ� ���� ���� �͸� ���� Ŭ������� �Ѵ�. 
//	ActionListener m = new ActionListener{ //Ŭ���� �̸��� �������� ���߿� ��üȭ�� �Ұ����ϱ� ������ �ٷ� New �� �ʿ� ����.
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("(4)�� ������� �̺�Ʈ ó��");
//		}
//	}; 
		
	
	
	public MyFrame() {
		jf = new JFrame();
		b = new JButton();
		
//		b.addActionListener(this);			//(1)
//		MyListener2 n  = new MyListener2(); //(2)
//		b.addActionListener(n);				//(2)
		
//		MyListener3 n2 = new MyListener3(); //(3)
//		b.addActionListener(n2);			//(3)
		
		b.addActionListener();			//(3)
		
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(b);
		jf.setSize(250,250);
		jf.setLocation(200,200);
		jf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("(1)�� ������� �̺�Ʈ ó��")
	}
}

class MyListener2 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("(2)�� ������� �̺�Ʈ ó��");
	}
}

public class EventHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
