/*
 * 생성자
 * 문법적으로 생성자는 메소드와 유사하나 리턴형이 존재하지 않고 
 * 이름이 클래스 명과 같아야 한다.
 * 클래스가 객체화될떄 단 한번 호출됨
 * Class가 new 될 때 사용
 * 여태까지는 생성자를 만든 적이 없음. 그러나 사용이 가능했음
 * 생성자는 상속이 안된다! 생성자는 생성자가 있는 클래스와 이름이 같기 떄문에 ㅇㅇ
 * 
 * 생성자의 사용목적 : 멤버변수의 초기화!!
 * 
 * 객체지향의 조건
 * 1. Private 선언
 * 2. 중복코드 없을 것!
 */

// this가 나타내는 것은 현재 클래스를 나타냄
// this의 경우는 자바스크립트에서도 자주 나타남. 현재 class의 객체를 나타냄.
// this() 의 경우 현재클래스생성자를 호출하고, 생성자 안 첫번째 라인에서만 사용가능

class Per{
	private int age;
	private String name;
	public Per() { // 문법적으로 이것이 생성자
		age = 20;
		name = "김길동";
		//this("김길동", 20);
	}
	public Per(int age, String name) { //코드가 길어지면 알아보기 힘들기때문에 이름은 항상 명확하게 해주는 것이 좋음. 
		this(name, age);//this()를 사용하여 생성자를 호출함
	}
	public Per(String name, int age) {
		this.name = name;
		this.age = age;
	}	
}

class Student extends Per{
	int id;
	public Student (int id, String name, int age) {
		super(name, age); // super를 사용하면 상위클래스의 인자들을 받아옴
		this.id = id;
		
	}
	
}


public class ConstructorEx {

	public static void main(String[] args) {
		new Per(25, "박길동"); // 생성자 호출하기
	}

}
