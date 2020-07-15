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
	public static void main(String[] args) {

		
	}

}
