//�߻�ȭ Ŭ������ ��� ���°�? : ����� ���� ���� ���

//�߻�ȭ �޼ҵ�
//���������� �߻�ȭ �޼ҵ�� �����ο� �ش��ϴ� "{ }" �κ��� ����� ��.
//�� ���κп� ";"�� �������
//�� ���ʿ� abstract ����

//�߻�ȭ Ŭ����
//�ϳ��̻��� �߻�ȭ �޼ҵ带 ������ Ŭ����
//���������� Ŭ���� �պκп� "abstract" ����
//�߻�ȭ Ŭ������ ��üȭ�� �Ұ�����.

abstract class Abs{
	abstract public void add();
}

abstract class Animal{
	abstract public void cry();
}

class Dog extends Animal{
	public void cry() {
		System.out.println("�� �����Ҹ�")
	}
}

class Cat extends Animal{
	public void cry() {
		System.out.println("����� �����Ҹ�")
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		
		
	}

}
