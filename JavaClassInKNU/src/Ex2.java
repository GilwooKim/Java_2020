/*
 	��ϴ��б� ��������� JAVA ����
 	20200707
 */
public class Ex2 { //�ڹ� ���α׷��� Class�� �� �ϳ��� ������ �־�� ��

	public static void main(String[] args) { //�ڹ� ���α׷������� ������ ���� ���α׷����ν� MAIN�� �ʿ���
		//�ڹ��� �⺻�ڷ���
		//(1) ������ : �Ϲ����� default Ÿ���� int���� ���� ������ ��!
		// byte(1����Ʈ) - short(2����Ʈ) - int(4����Ʈ) - long(8����Ʈ)
		
		byte a = -128; // 1 byte = 256 = -128~127
		byte b = 10;
		b =+ 10;
		System.out.println(b);
		
		int f = b + 10; //�ڹٿ����� ��������� �ϰ� �Ǹ� ��� �ڷ����� int������ �޾Ƶ��̰� �ȴ�. ��Ģ������ int �����θ� ���
	
		
		short c = 10;
		System.out.print(c);
		
		
		int d = 10;
		System.out.println(d);
		
		long e = 10;
		System.out.println(e);
		
		//(2) �Ǽ��� : �Ǽ����� default Ÿ���� ������ double �������� �ν��� ��.
		//float - double �� ���� Ÿ���� ����. ��κ� �ü���� ����ִ� ���� �ڹ� ���α׷����� ���Եȴ�. �ü�� �� �������� ������ �ʿ��� ���� ���
		
		float g = 0.1f; // float g = 0.1; �����߻� - f�� �ڿ� �ٿ��� ���� ó��
		double h = 0.2;
		System.out.println(g);
		System.out.println(h);
		
		//(3) ������ :
		//char
		char i = 'A';  // char�� 1���� ���ڸ� ���ؼ� ������� �� ���� 2�� �̻��� ���ڸ� ���ÿ� ǥ���ϱ� ���ؼ��� �迭�� ����� �ʿ䰡 ����.
		System.out.println(i); 
		char i2 = 65;
		System.out.println(i2);
		System.out.println("Hi"); //�ּ� �� �޾��ִ� ���� �ʿ��ϴ�!
		
		//(4) Boolean��
		//true - false
		boolean boo = true; //C���� 0�� 1�� True False �� �Ǵ��ϴ� ���� Java������ �Ұ���
		
		
	}
	
}
