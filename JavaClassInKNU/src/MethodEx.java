
class MyClass{
	// method �⺻ ����
	// ���� ������	������  �޼ҵ��̸�[�Ķ����]
	public void add(int x, int y) {//�ۺ� ���������ڴ� ������ ���� �� ����
		int resultadd = x + y;
		System.out.println(resultadd);
		}
	public void add(double x, double y) {
		double result = x + y;
		System.out.println(result);
	}
	public int getResult(){
		return 10;
	}
}

// ���������� ���� : public , protected, default, private : Ŭ�����Ӹ� �ƴ϶� ���� �� �޼ҵ忡�� ����� ����  
// ���� �߿��� ��
// public : ������ ���
// private : �ش� Ŭ���� �ȿ����� ��� ����

// ���������� : �⺻�ڷ���, Object, void(���ϰ��� ���°��)

public class MethodEx { //main method�� ������ �ִ� Ŭ������ �̸��� ���� �̸��� �ȴ�.

	public static void main(String[] args) {
		MyClass MyClass = new MyClass(); // n�� ��ü�� �ǰ� new MyClass�� ���� ��üȭ �� �ּ� ã�ư���  ; �ż��� ����� ���� Ŭ���� ��üȭ

		MyClass.add(1, 3); // n ��ü ���� add�� ����ϰ� �ǰ� ��ȣ �ȿ��� �ش� �Ķ���� ���� �־ ȣ��
		MyClass.add(0.1, 0.2);  //�Ķ���� ������ �޶� int double ���� �̿� ���ؼ� ���� �̸� add�� ��� ������ �� �ֵ��� ���ִ� ���� �����ε�(Over Loading)�̶�� �Ѵ�.
		//��, ���� ��� ������ ��� ����, �Ǽ��� ���� ����� �� �ֵ��� �ϴ� ���� �ʿ��ѵ�, �̸� ���ؼ� Ŭ���� ��ü������ �޼ҵ� �̸��� ���� �� ���ֵ��� ����.
		//�ٸ� �̸��� ���� ������ ������ ���ؼ� �޼ҵ��� �Ķ���� ������ �޶���
		//println�� ��쵵 ���� �����ε��� �Ǿ��ִ� ������. �⺻������ �����ε��� �Ǿ��ֱ� ������ ���� ���� ���� ����� ����.
		int r = MyClass.getResult();
		System.out.println(r);
	}

}
