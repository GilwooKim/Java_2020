//interface : ������Ұ� ���, �߻�ȭ�޼ҵ� �� ������ �� �� ����.
//�������̽��� ��üȭ�� �Ұ���. �ֳ�! ����� ���� �����θ� ������ �Ǿ��ֱ� ����
//�������̽��� ���� ū �뵵�� �ڹ��� ���ϻ���� �����ϴ� ��!


interface MyInter {
	final int AGE = 20; // ��Ŭ���� �󿡼� ����� ��쿡�� ���ڸ�ü�� �β��� �۾�ü�� ����, ����̱�⶧���� ����Ұ�
	//������ ���� ��Ģ������ �̷��� ����� �ȵǰ� 'final'�� ���� ��
	abstract public void cry(); // ������ �߻�ȭ �޼ҵ常 �����ϱ� ������ abstract ���� ����
}

class Pig implements MyInter{ //�ڹ��� Ŭ������ ��Ӱ� implements ��� ����� �����ϴ�. 
	//���� �������̽��� �������� ����� �����ϱ⶧���� ���ϻ���� ������ �� ����. 

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceEx {

	public static void main(String[] args) {
		
	}

}
