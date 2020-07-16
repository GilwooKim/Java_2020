import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	�ڹ� IO class
	-�ڹ� ����� Ŭ�� �� ���� �з�
	1. byte stream �迭 : 1byte ������ �����
	- ��ǥŬ���� 
		InputStream : 1byte ������ �Է�, �߻�ȭŬ���� - ��üȭ �Ұ���
		OutputStream : 1byte ������ ���, �߻�ȭŬ���� - ��üȭ �Ұ���
		: ��𿡼� �Է¹ް� ���� �߷��� �ϴ°�? ���� - �Ѵ� �߻�ȭŬ����
	- ���� �����
		FileInputStream : File�̶�� ���� ������ ��Ȯ�ϰ� ��õ�. ���Ͽ��� 1byte ������ �Է�
		FileOutputStream : ���Ͽ� 1byte ������ ���
		
	- ��������� ���� Ŭ����
	BufferedInputStream : ���� ����� ���� ����
	BufferedOutputStream : ��������� ���� ����
	���Ŀ� ���ɷν��� ���� ū �κ��� IO ��Ʈ�̱� ������ ��������� ���ؼ� �����Ǵ� ���ĵ��� �߿���ؾ���!
*/
public class FileInputStreaEx {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("c://pgtest/test.txt"); //fileinputstream ��üȭ �Ϸ�

//		int result = fis.read(); // read�� �ѹ���Ʈ�� �о�� , ����! �ٸ� �� result�� �����Ϸ��� �Ҷ��� char�̳� byte�δ� ������ �ٷ� �ȵ�
		
//		System.out.println(result); // result�� ���� ���� �������� �������� ASCII �ڵ�ǥ�� ���ڸ� ������ ��.			����� : 65
//		System.out.println((char)result); // ���ڿ��� casting��. Type Casting ; ���ʿ� ��ȣ�� ���ؼ� ����ȯ �ǽ�		����� : A
//		//Typecasting�� ������ �� ��! ������ �� ������ �߻��� ���ɼ��� ŭ
//		//�ƹ��� �� ����ȯ�� ������ ���� �ƴ�. Character�̶�� ���� ����ȯ�� �ϴ� ���ε�, ���������� �ڷ����� ���� �뷮 ũ�Ⱑ �ٸ��� ������ ū�𿡼� ���������� �ٲٴ� ��Ȳ������ ���� �ʿ�
		
		byte[] b = new byte[256];
		fis.read(b); // byte �迭 b ũ�⸸ŭ �о b �迭�� ����
		
		String result = new String(b, "euc-kr"); //character set�� ��� ��ġ�ϴ°��� �߿���. //�Է��Ҷ��� ���ڿ��� ������� ��, �о�ýÿ��� �������� �����ϴ� ��
		System.out.println(result.trim()); // trim�� ���ؼ� Ư���� ���� ����, �� ������ ���̶�� �ǴܵǴ� �κе��� ��� �����ش�. 
		System.out.println("end");
		
	}

}
