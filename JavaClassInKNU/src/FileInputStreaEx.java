import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	자바 IO class
	-자바 입출력 클랫 두 가지 분류
	1. byte stream 계열 : 1byte 단위로 입출력
	- 대표클래스 
		InputStream : 1byte 단위로 입력, 추상화클래스 - 객체화 불가능
		OutputStream : 1byte 단위로 출력, 추상화클래스 - 객체화 불가능
		: 어디에서 입력받고 어디로 추력을 하는가? 없음 - 둘다 추상화클래스
	- 파일 입출력
		FileInputStream : File이라고 어디로 가는지 정확하게 명시됨. 파일에서 1byte 단위로 입력
		FileOutputStream : 파일에 1byte 단위로 출력
		
	- 성능향상을 위한 클래스
	BufferedInputStream : 성능 향상을 위해 제공
	BufferedOutputStream : 성능향상을 위해 제공
	이후에 성능로스가 가장 큰 부분이 IO 파트이기 떄문에 성능향상을 위해서 제공되는 형식들을 중요시해야함!
*/
public class FileInputStreaEx {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("c://pgtest/test.txt"); //fileinputstream 객체화 완료

//		int result = fis.read(); // read는 한바이트를 읽어옴 , 주의! 다른 값 result에 저장하려고 할때는 char이나 byte로는 저장이 바로 안됨
		
//		System.out.println(result); // result에 대한 값을 이진수를 기준으로 ASCII 코드표의 숫자를 들고오게 됨.			결과값 : 65
//		System.out.println((char)result); // 문자열로 casting함. Type Casting ; 앞쪽에 괄호를 통해서 형변환 실시		결과값 : A
//		//Typecasting은 조심히 쓸 것! 남발할 시 문제가 발생할 가능성이 큼
//		//아무나 다 형변환이 가능한 것은 아님. Character이라는 것을 형변환을 하는 것인데, 실질적으로 자료형에 따른 용량 크기가 다르기 때문에 큰놈에서 작은놈으로 바꾸는 상황에서는 주의 필요
		
		byte[] b = new byte[256];
		fis.read(b); // byte 배열 b 크기만큼 읽어서 b 배열에 저장
		
		String result = new String(b, "euc-kr"); //character set을 어디에 배치하는가가 중요함. //입력할때는 문자열을 끌어오는 곳, 읽어올시에는 가져오고 저장하는 곳
		System.out.println(result.trim()); // trim을 톻해서 특정된 값이 없는, 즉 쓰레기 값이라고 판단되는 부분들을 모두 지워준다. 
		System.out.println("end");
		
	}

}
