/*
 * 자바 문법 생략가능한 3대 요소
 * (1) extends Object
 * (2) default Constructor(default 생성자) - default 생성자란 파라메터 값을 받지않는 생성자
 * 단 다른 생성자를 만들어주지 않았을 경우에만 생략이 가능 
 * 메소드와 형태가 비슷하기 때문에 오버로딩이 가능함. 
 * (3) super(); -> 상위클라스 생성자, 모든 생성자의 첫번째 라인에서 생략이 되어있음.
 */ 


/* 상속(extends)
 * - 상속대상은 클래스
 * - 상속을 위해서는 'extends'문법을 사용
 * - 자바는 단일 상속만을 지원
 * - 클래스의 구성요소 중 멤버변수, 메소드는 상속되나 생성자는 상속되지 않는다.
 */

/*
 * Class의 3가지 구성욧
 * 1. 멤버변수(member variable)
 * 2. 메소드(method)
 * 3. 생성자(constructor)
 */

/*
 * 생성자란 무엇인가
 * 문법적으로 생성자는 메소드와 유사하나 리턴형이 존재하지 않고 이름이 클래스 명과 같아야한다.
 * 클래스가 객체화될때 단 한번 호출됨
 * 생성자 사용의 가장 큰 목적은 멤버변수 초기화
 * 파라미터를 받지 않는 디폴트 생성자는 생략이 간으. 단 다른 생성자를 만들어주지 않았을 경우에만
 * 생성자는 상속이 되지 않음
 */
class A{
	public A() {
		System.out.println("A 생성자 호출");
	}
	public void printA() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		super(); //생성자는 상속이 되지 않음. 
		System.out.println("B 생성자 호출");
	}
	public void printA() {
		System.out.println("printA()  : 오버라이딩"); //메소드 오버라이딩 , 상위 클라스의 변수를 다시 재 정의하는 것, 덮어씌우기
		
	}
	public void printB() {
		System.out.println("B");
	}
}

public class OOPEx2{

	public static void main(String[] args) {
		A a = new A();
		a.printA();
		
		System.out.println("-------------------------------------------------");
		A aa = new B(); //
		aa.printA();
//		aa.printB(); 안되는 케이스
		
		System.out.println("-------------------------------------------------");
//		b.printB();
//		B b = new A(); //불가능한 코드
		
		System.out.println("-------------------------------------------------");		
		B b = new B();
		b.printB();
		

		
	} // A 생성자 호출이 먼저 찍힘. 이는 B 생성자를 호출했지만 이는 상속을 받았기 때문에 A를 먼저 호출이 되고나서 그 이후에 B가 만들어지는 것과 동일하다고 볼 수 있다.
		// 코드 상에서는 왜 그렇게 되는가? - 생략이 되어있는 것이 하나 있다! 생략요소 3번째 요소 참조!

}
