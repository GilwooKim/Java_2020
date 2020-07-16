import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
		
	public static void main(String[] args) throws IOException {
		
		//문자 단위 출력을 제공ㅎ는 FileWriter 클래스 사용
		FileWriter fw = new FileWriter("c://pgtest/test.txt");
		fw.write("ABCDEFGHI경북대학교");
		fw.flush();
		
		
		//문자 단위 입력을 제공하는 FileReader 클래스 사용
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
