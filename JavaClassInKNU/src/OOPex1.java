//��ü ������ ���α׷����� �����
//��� Ŭ������ ��������� Private ������ ��!
//private ����� ��������� ������ ���� public getXXX(), setXXX() �޼ҵ� ����
//�ᱹ �޼ҵ带 ����ϴ� ������ ��Ȱ���� �ϱ� ���ؼ� �����. �ߺ��Ǵ� �ڵ带 �����ϱ� ����.

class Person{

	private int Age;
	
	public void setAge(int a) {
		Age = a;
	}
	public int getAge() {
		return Age;
	}
}


public class OOPex1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		
		Person p2 = new Person();
		p2.setAge(21);		
		
		Person p3 = new Person();
		p3.setAge(24);
	}

}
