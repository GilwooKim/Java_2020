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
		//기본적으로 Write 기능은 버퍼에 쌓기만 하기 때문에 이를 가지고 출력을 제대로 하기 위해서는 버퍼에 계속 쌓아둘 뿐만 아니라 이를 파일에 적용시키기 위해서는
		//객체.flush();를 무조건 써줘야함.
		
		
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
