//interface : 구성요소가 상수, 추상화메소드 두 가지만 들어갈 수 있음.
//인터페이스는 객체화가 불가능. 왜냐! 기능이 없는 것으로만 구성이 되어있기 때문
//인터페이스의 가장 큰 용도는 자바의 단일상속을 보완하는 것!


interface MyInter {
	final int AGE = 20; // 이클립스 상에서 상수의 경우에는 이텔릭체의 두꺼운 글씨체로 변경, 상수이기기때문에 변경불가
	//상수라는 것은 원칙적으로 이렇게 만들면 안되고 'final'이 들어가야 함
	abstract public void cry(); // 무조건 추상화 메소드만 가능하기 때문에 abstract 생략 가능
}

class Pig implements MyInter{ //자바의 클래스는 상속과 implements 모두 사용이 가능하다. 
	//또한 인터페이스는 다중으로 사용이 가능하기때문에 단일상속을 보완할 수 있음. 

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceEx {

	public static void main(String[] args) {
		
	}

}
