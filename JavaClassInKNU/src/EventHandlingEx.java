import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	1. 현재 클래스에 리스너를 구현하는 방식
	class MyFrame implements ActionListener{
	2. 외부에다가 만드는 방식
*/

class MyFrame implements ActionListener{

	JFrame jf;
	JButton b;
	
	
	//(3) 세번쨰 방식 : 외부클래스에 있는 UI 자원 사용이 가능해짐.
	class MyListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("(3)번 방식으로 이벤트 처리");
		}
	}
	
//	//(4) 네번째 방식 : 익명 내부 클래스로 Listener 구현해서 사용함. : 이름이 없는 클래스 - 클래스 이름과 해당 선언부가 없는 것을 익명 내부 클래스라고 한다. 
//	ActionListener m = new ActionListener{ //클래스 이름이 없어지면 나중에 객체화가 불가능하기 떄문에 바로 New 할 필요 있음.
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("(4)번 방식으로 이벤트 처리");
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
		System.out.println("(1)번 방식으로 이벤트 처리")
	}
}

class MyListener2 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("(2)번 방식으로 이벤트 처리");
	}
}

public class EventHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
