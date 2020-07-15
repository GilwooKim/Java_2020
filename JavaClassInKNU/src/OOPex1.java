//객체 지향형 프로그래밍의 출발점
//모든 클래스의 멤버변수는 Private 선언할 것!
//private 선언된 멤버변수에 접근을 위한 public getXXX(), setXXX() 메소드 선언
//결국 메소드를 사용하는 이유는 재활용을 하기 위해서 사용함. 중복되는 코드를 제거하기 위함.

class Person{

	private int Age;
	
	public void setAge(int a) {
		Age = a;
	}
	public int getAge() {
		return Age;
	}
}


public class OOPex1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		
		Person p2 = new Person();
		p2.setAge(21);		
		
		Person p3 = new Person();
		p3.setAge(24);
	}

}
