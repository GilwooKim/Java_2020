
class MyClass{
	// method 기본 문법
	// 접근 제한자	리턴형  메소드이르[파라미터]
	public void add(int x, int y) {//퍼블릭 접근제한자는 누구나 들어올 수 있음
		int resultadd = x + y;
		System.out.println(resultadd);
		}
	public void add(double x, double y) {
		double result = x + y;
		System.out.println(result);
	}
	public int getResult(){
		return 10;
	}
}

// 접근제한자 종류 : public , protected, default, private : 클래스뿐만 아니라 변수 및 메소드에도 사용이 가능  
// 가장 중요한 것
// public : 누구나 사용
// private : 해당 클래스 안에서만 사용 가능

// 리턴형종류 : 기본자료형, Object, void(리턴값이 없는경우)

public class MethodEx { //main method를 가지고 있는 클래스의 이름이 파일 이름이 된다.

	public static void main(String[] args) {
		MyClass MyClass = new MyClass(); // n은 객체가 되고 new MyClass를 통해 객체화 및 주소 찾아가기  ; 매서드 사용을 위한 클래스 객체화

		MyClass.add(1, 3); // n 객체 안의 add를 사용하게 되고 괄호 안에는 해당 파라매터 값을 넣어서 호출
		MyClass.add(0.1, 0.2);  //파라메터 형식이 달라도 int double 서로 이에 대해서 같은 이름 add로 사용 가능할 수 있도록 해주는 것이 오버로딩(Over Loading)이라고 한다.
		//즉, 예를 들어 계산기의 경우 정수, 실수를 같이 계산할 수 있도록 하는 것이 필요한데, 이를 위해서 클래스 자체에서는 메소드 이름을 같게 할 수있도록 해줌.
		//다만 이름이 같기 때문에 구분을 위해서 메소드의 파라미터 종류가 달라짐
		//println의 경우도 현재 오버로딩이 되어있는 상태임. 기본적으로 오버로딩이 되어있기 때문에 형식 제한 없이 사용이 가능.
		int r = MyClass.getResult();
		System.out.println(r);
	}

}
