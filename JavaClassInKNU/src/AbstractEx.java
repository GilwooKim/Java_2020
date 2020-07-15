//추상화 클래스는 어디에 쓰는가? : 기능이 없는 곳에 사용

//추상화 메소드
//문법적으로 추상화 메소드는 구현부에 해당하는 "{ }" 부분이 없어야 함.
//맨 끝부분에 ";"가 만들어짐
//맨 앞쪽에 abstract 선언

//추상화 클래스
//하나이상의 추상화 메소드를 가지는 클래스
//문법적으로 클래스 앞부분에 "abstract" 선언
//추상화 클래스는 객체화가 불가능함.

abstract class Abs{
	abstract public void add();
}

abstract class Animal{
	abstract public void cry();
}

class Dog extends Animal{
	public void cry() {
		System.out.println("개 울음소리")
	}
}

class Cat extends Animal{
	public void cry() {
		System.out.println("고양이 울음소리")
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		
		
	}

}
