
public class ForEX {
	public static void main(String[] args) {
		
		double result = 0;
		//�ݺ���
		//      �ʱⰪ      / ����   / ������ cf) i++��  i�� 1�� ������ ��Ű�ڴ� / i-- i�� 1�� ���Ҹ� ��Ű�ڴ�. ++i / --i�� ����. 
		for ( int i = 0; i<10; i++) {//i ���� for �� �ȿ��� ����ϸ� �̸� ���� �� �� �ݺ��ߴ��� üũ�ϰڴ� ��� �ǹ�
			//�ݺ��� �ڵ�
			result = result + 0.1;
		}
		System.out.println(result);
	}
}
