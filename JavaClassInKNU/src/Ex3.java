
public class Ex3 {

	int x = 10;
	
	public static void main(String[] args) { 
		Ex3 e = new Ex3(); // 특정된 class를 통째로 메모리에 올림(new를 사용하여)
		// e에 대한 변수의 자료형을 Ex3로 설정, 그리고 이 것을 특정된 class로 지정 
		System.out.println( e.x );
	} // Static : 프로그램이 시작될 때 제일 ㅓㅊ음 자기스스로 메모리에 단 한번만 올라가며, 프로그램이 끝날 때까지 버티고 존재
}
// class란 무엇인가
// 
// Object란 무엇인가
// 객체는 메모리에 올라간 클래스를 의미
// 이후 CPU가 이를 인지하게 됨.
// 객체화란? 메모리에 올려놓고 써라!!(class를 new하라!) 위에서 보이는 내용이라면 e에 대한 내용을 만들어라
// 객체를 지향한다는 것 = 유지 보수 업데이트가 편리한 프로그램 ex) 회원관리 등록 수정 프로그램