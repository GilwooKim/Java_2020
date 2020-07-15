import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx { // 이 부분만 정확하게 외워둘 것! 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C://pgtest/test.txt"); //파일이 경로를 만들 필요있음
		BufferedOutputStream bos = new BufferedOutputStream(fos); // Chaining 이라고 하는 것!
		
		String msg = "경북대학교 정보전산원";
		byte[] b = msg.getBytes(); // 생략해도 괜찮음!
		bos.write(msg.getBytes()); // 문자열을 바이트 배열로 바꾼 것!
		bos.flush(); // 출력의 경우 무조건 버퍼가 있던 없던 flush를 통해서 바로 적용을 시키는 것이 필요하다!! 습관처럼!
		
	}

}

/*	

*/