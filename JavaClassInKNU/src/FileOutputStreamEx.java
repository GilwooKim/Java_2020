import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx { // 이 부분만 정확하게 외워둘 것! 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C://pgtest/test.txt"); //파일이 경로를 만들 필요있음
		BufferedOutputStream bos = new BufferedOutputStream(fos); // Chaining 이라고 하는 것!
		
		String msg = "ABC경북대학교 정보전산원";
		byte[] b = msg.getBytes(); // 생략해도 괜찮음!
		bos.write(msg.getBytes("euc-kr")); // 문자열을 바이트 배열로 바꾼 것! 
		
		//character set을 어디에 배치하는가가 중요함. //입력할때는 문자열을 끌어오는 곳, 읽어올시에는 가져오고 저장하는 곳
		//적을때 어떤 기준으로 적을지 꼭 명시해야함!
		
		bos.flush(); // 출력의 경우 무조건 버퍼가 있던 없던 flush를 통해서 바로 적용을 시키는 것이 필요하다!! 습관처럼!
		
	}

}

/*	

*/