import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx { // �� �κи� ��Ȯ�ϰ� �ܿ��� ��! 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C://pgtest/test.txt"); //������ ��θ� ���� �ʿ�����
		BufferedOutputStream bos = new BufferedOutputStream(fos); // Chaining �̶�� �ϴ� ��!
		
		String msg = "ABC��ϴ��б� ���������";
		byte[] b = msg.getBytes(); // �����ص� ������!
		bos.write(msg.getBytes("euc-kr")); // ���ڿ��� ����Ʈ �迭�� �ٲ� ��! 
		
		//character set�� ��� ��ġ�ϴ°��� �߿���. //�Է��Ҷ��� ���ڿ��� ������� ��, �о�ýÿ��� �������� �����ϴ� ��
		//������ � �������� ������ �� ����ؾ���!
		
		bos.flush(); // ����� ��� ������ ���۰� �ִ� ���� flush�� ���ؼ� �ٷ� ������ ��Ű�� ���� �ʿ��ϴ�!! ����ó��!
		
	}

}

/*	

*/