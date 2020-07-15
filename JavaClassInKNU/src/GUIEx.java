import java.awt.Color;
import java.awt.FlowLayout; // �����쿡 �ִ� awt�� �������� ����ϰڴ�
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton; // ��! �츮(�㸶��ũ�νý���)�� ���� ����������! �ü���� �޶� �������� ��������!
import javax.swing.JFrame;
import javax.swing.JTextField;

//JVM ; Java Virtual Machine;
//�ڹپ��� �ۼ��� ���α׷� �ڵ�� �ᱹ �ü���� ���ӵǴ� ���� �Ϲ����̳� �ڹٴ� �ü���� ������� ���� �ڵ带 �ٸ� �ü������ ��� ����

//import��� ������ �ڹٶ�� ������ ������ ��ɵ��� Ŭ������ ���·� �����ϱ� ������ �̿� ���ؼ� ���������� ���ؼ� ������ �з��� ������������.
//Ctrl + Shift + O �� ������ �ڵ����� �ҷ�����.

public class GUIEx {

	public static void main(String[] args) {

		JFrame f=new JFrame();  // JFrame  ; Frame���� �ξ� ������ ����( ������ Ctrl + Shift + O ������)
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���α׷� ���Ḧ ���� �� EXIT_ON_CLOSE�� ���� ������ Ȱ��ȭ
		
		//�ؽ�Ʈ �ʵ� , �ؽ�Ʈ �����,
		
		JTextField jf = new JTextField(10); // ����¥�� �Է�â
		
		
		//f.setLayout(null);//�Ƕ��⿡ ����Ǿ� �ִ� ȭ�� ��ġ ������ ����
		
		// ȭ���ġ ������ : FlowLayout - ������ ������� ȭ�鿡 ��ġ���ִ� ��å
		FlowLayout layout = new FlowLayout();  //cf.Ctrl + Space �� �ڵ��ϼ�
		f.setLayout(layout); // FlowLayout�� ���� ȭ�� ��ġ �����ڷ� ����
		
		
		
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
		clear.setBackground(Color.RED); // ��ư ��׶��� ����
		
		f.add(jf);
		
		f.add(b7);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("7");
				//System.out.println( "��ưŬ��" );
			}
		});
		
		f.add(b8);
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("8");
				//System.out.println( "��ưŬ��" );
			}
		});
		
		f.add(b9);
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("9");
				//System.out.println( "��ưŬ��" );
				
			}
		});
		
		f.add(b4);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("4");
				//System.out.println( "��ưŬ��" );
			}
		});
		
		f.add(b5);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("5");
				//System.out.println( "��ưŬ��");
			}
		});
		
		f.add(b6);
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("6");
				//System.out.println( "��ưŬ��");
			}
		});
		f.add(b1);
		b1.addActionListener(new ActionListener() {//�̺�Ʈ �ڵ鸵 ; �̺�Ʈ�� �߻��ߴ� ��� ǥ���ϴ� ������, Ư���� ��ư�� Ŭ���Ǵ����� �����ϴ� �޼ҵ�
			// ����Ŭ���� ; Ŭ���� ���� Ŭ����!
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("1");
				//System.out.println( "��ưŬ��" );
			}
		}); 
		
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("2");
				//System.out.println( "��ưŬ��");
			}
		});
		
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("3");
				//System.out.println( "��ưŬ��");
			}
		});
		
		f.add(b0);
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText("0");
				//System.out.println( "��ưŬ��");
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
		f.setVisible(true); //�̷��� �ؾ� ȭ���� ������. Console �ǿ� �����ʿ� �ִ� ������ư�� ������ ���ᰡ �� .
	}


}

// ������ǥ������ ���� ȭ�� ����
//
//Frame f=new Frame();
//f.setSize(850,500);
//f.setLocation(500,500);
//f.setVisible(true); //�̷��� �ؾ� ȭ���� ������. Console �ǿ� �����ʿ� �ִ� ������ư�� ������ ���ᰡ �� .
//f.setLayout(null);//�Ƕ��⿡ ����Ǿ� �ִ� ȭ�� ��ġ ������ ����
//
//Button b1 = new Button("��ư1");
//b1.setSize(150,50);
//b1.setLocation(50,150);
//
//Button b2 = new Button("��ư2");		
//b2.setSize(150,50);
//b2.setLocation(200,150);
//
//Button b3 = new Button("��ư3");	
//b3.setSize(150,50);
//b3.setLocation(350,150);
//
//Button b4 = new Button("��ư4");	
//b4.setSize(150,50);
//b4.setLocation(500,150);
//
//Button b5 = new Button("��ư5");
//b5.setSize(150,50);
//b5.setLocation(650,150);
//
//
//f.add(b1);
//f.add(b2);
//f.add(b3);
//f.add(b4);
//f.add(b5);

