import java.awt.Color;
import java.awt.FlowLayout; // 윈도우에 있는 awt의 디자인을 사용하겠다
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton; // 아! 우리(썬마이크로시스템)가 직접 만들어버리자! 운영체제가 달라도 디자인은 같게하자!
import javax.swing.JFrame;
import javax.swing.JTextField;

//JVM ; Java Virtual Machine;
//자바언어로 작성된 프로그램 코드는 결국 운영체제에 종속되는 것이 일반적이나 자바는 운영체제에 상관없이 동일 코드를 다른 운영체제에서 사용 가능

//import라는 개념은 자바라는 언어에서는 수많은 기능들을 클래스의 형태로 제공하기 때문에 이에 대해서 유지보수를 위해서 각각의 분류로 나뉘어져있음.
//Ctrl + Shift + O 를 누르면 자동으로 불러와줌.

public class GUIEx {

	public static void main(String[] args) {

		JFrame f=new JFrame();  // JFrame  ; Frame보다 훨씬 개량된 형식( 적용후 Ctrl + Shift + O 누르기)
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 종료를 위한 것 EXIT_ON_CLOSE의 경우는 종료기능 활성화
		
		//텍스트 필드 , 텍스트 에어리어,
		
		JTextField jf = new JTextField(10); // 한줄짜리 입력창
		
		
		//f.setLayout(null);//판떼기에 적용되어 있는 화면 배치 관리자 제거
		
		// 화면배치 관리자 : FlowLayout - 들어오는 순서대로 화면에 배치해주는 정책
		FlowLayout layout = new FlowLayout();  //cf.Ctrl + Space ㅣ 자동완성
		f.setLayout(layout); // FlowLayout을 현재 화면 배치 관리자로 설정
		
		
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");		
		JButton b3 = new JButton("3");	
		JButton b4 = new JButton("4");	
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton multiple = new JButton("x");
		JButton wari = new JButton("/");
		JButton enter = new JButton("Enter");
		JButton clear = new JButton("C");
		clear.setBackground(Color.RED); // 버튼 백그라운드 색깔
		
		f.add(jf);
		
		f.add(b7);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("7");
				//System.out.println( "버튼클릭" );
			}
		});
		
		f.add(b8);
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("8");
				//System.out.println( "버튼클릭" );
			}
		});
		
		f.add(b9);
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("9");
				//System.out.println( "버튼클릭" );
				
			}
		});
		
		f.add(b4);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("4");
				//System.out.println( "버튼클릭" );
			}
		});
		
		f.add(b5);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("5");
				//System.out.println( "버튼클릭");
			}
		});
		
		f.add(b6);
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("6");
				//System.out.println( "버튼클릭");
			}
		});
		f.add(b1);
		b1.addActionListener(new ActionListener() {//이벤트 핸들링 ; 이벤트가 발생했다 라고 표현하는 것으로, 특정된 버튼이 클릭되는지를 감시하는 메소드
			// 내부클래스 ; 클래스 안의 클래스!
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("1");
				//System.out.println( "버튼클릭" );
			}
		}); 
		
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("2");
				//System.out.println( "버튼클릭");
			}
		});
		
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("3");
				//System.out.println( "버튼클릭");
			}
		});
		
		f.add(b0);
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("0");
				//System.out.println( "버튼클릭");
			}
		});
		
		f.add(plus);
		f.add(minus);
		f.add(multiple);
		f.add(wari);
		f.add(enter);
		
		f.add(clear);

		f.setSize(850,500);
		f.setLocation(500,500);
		f.setVisible(true); //이렇게 해야 화면이 보여짐. Console 탭에 오른쪽에 있는 빨간버튼을 누르면 종료가 됨 .
	}


}

// 절대좌표값으로 만든 화면 구성
//
//Frame f=new Frame();
//f.setSize(850,500);
//f.setLocation(500,500);
//f.setVisible(true); //이렇게 해야 화면이 보여짐. Console 탭에 오른쪽에 있는 빨간버튼을 누르면 종료가 됨 .
//f.setLayout(null);//판떼기에 적용되어 있는 화면 배치 관리자 제거
//
//Button b1 = new Button("버튼1");
//b1.setSize(150,50);
//b1.setLocation(50,150);
//
//Button b2 = new Button("버튼2");		
//b2.setSize(150,50);
//b2.setLocation(200,150);
//
//Button b3 = new Button("버튼3");	
//b3.setSize(150,50);
//b3.setLocation(350,150);
//
//Button b4 = new Button("버튼4");	
//b4.setSize(150,50);
//b4.setLocation(500,150);
//
//Button b5 = new Button("버튼5");
//b5.setSize(150,50);
//b5.setLocation(650,150);
//
//
//f.add(b1);
//f.add(b2);
//f.add(b3);
//f.add(b4);
//f.add(b5);

