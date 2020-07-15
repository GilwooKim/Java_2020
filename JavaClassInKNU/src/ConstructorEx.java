/*
 * ������
 * ���������� �����ڴ� �޼ҵ�� �����ϳ� �������� �������� �ʰ� 
 * �̸��� Ŭ���� ��� ���ƾ� �Ѵ�.
 * Ŭ������ ��üȭ�ɋ� �� �ѹ� ȣ���
 * Class�� new �� �� ���
 * ���±����� �����ڸ� ���� ���� ����. �׷��� ����� ��������
 * �����ڴ� ����� �ȵȴ�! �����ڴ� �����ڰ� �ִ� Ŭ������ �̸��� ���� ������ ����
 * 
 * �������� ������ : ��������� �ʱ�ȭ!!
 * 
 * ��ü������ ����
 * 1. Private ����
 * 2. �ߺ��ڵ� ���� ��!
 */

// this�� ��Ÿ���� ���� ���� Ŭ������ ��Ÿ��
// this�� ���� �ڹٽ�ũ��Ʈ������ ���� ��Ÿ��. ���� class�� ��ü�� ��Ÿ��.
// this() �� ��� ����Ŭ���������ڸ� ȣ���ϰ�, ������ �� ù��° ���ο����� ��밡��

class Per{
	private int age;
	private String name;
	public Per() { // ���������� �̰��� ������
		age = 20;
		name = "��浿";
		//this("��浿", 20);
	}
	public Per(int age, String name) { //�ڵ尡 ������� �˾ƺ��� ����⶧���� �̸��� �׻� ��Ȯ�ϰ� ���ִ� ���� ����. 
		this(name, age);//this()�� ����Ͽ� �����ڸ� ȣ����
	}
	public Per(String name, int age) {
		this.name = name;
		this.age = age;
	}	
}

class Student extends Per{
	int id;
	public Student (int id, String name, int age) {
		super(name, age); // super�� ����ϸ� ����Ŭ������ ���ڵ��� �޾ƿ�
		this.id = id;
		
	}
	
}


public class ConstructorEx {

	public static void main(String[] args) {
		new Per(25, "�ڱ浿"); // ������ ȣ���ϱ�
	}

}
