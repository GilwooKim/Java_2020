import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
		
	public static void main(String[] args) throws IOException {
		
		//���� ���� ����� �������� FileWriter Ŭ���� ���
		FileWriter fw = new FileWriter("c://pgtest/test.txt");
		fw.write("ABCDEFGHI��ϴ��б�");
		fw.flush();
		
		
		//���� ���� �Է��� �����ϴ� FileReader Ŭ���� ���
		FileReader fr = new FileReader("c://pgtest/test.txt");
		BufferedReader br = new BufferedReader(fr);
		String result = br.readLine();
		System.out.println(result);
		
		
//		int result = fr.read();
//		System.out.println( (char)result );
//		result = fr.read();
//		System.out.println( (char)result );
//		result = fr.read();
//		System.out.println( (char)result );
//		result = fr.read();
//		System.out.println( (char)result );
//		result = fr.read();
//		System.out.println( (char)result );
	}

}
