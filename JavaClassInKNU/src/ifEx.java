
public class ifEx {

	public static void main(String[] args) {

//		int x = 30;
//		double y = 30.00000000000000001;
//
//		if (x > y) {
//			System.out.println("x�� y���� �� ũ��");
//		} else if (x < y) {
//			System.out.println("y�� x���� �� ũ��");
//		} else {
//			System.out.println("x�� y�� ����");
//		}
		
		int score = 90;
		
		if (score>=90) {
			System.out.println("A");
		} else if(score>=80 && score<90) {
			System.out.println("B");
		} else if(score>=70 && score<80) {
			System.out.println("C");
		} else if(score>=60 && score<70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// & &&���� : 1�� ¥���� �ϳ��� false�� �������� ���������� ������ �ϸ�, &&�� ���� ��� �߰��� false�� ������ �׸� ��
		// ����  if(score < 90 && (score=score+10) >=80)�� ���� ������� ������ ���� &&�� ����ϴ� ���� �� ����.  
	}
}

//cf) Ctrl + Shift + F �� ������ �ٰ��� �ڵ����� ��������
