
public class Ex1 {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		System.out.println("Print 사용");
		System.out.println("Print");
		
		byte x = 10;
		byte y = x;
		y = 100;
		System.out.println(x);
		
		byte[] xx = {10, 20, 30};
		byte[] yy = xx;
		yy[0] = 100;
		System.out.println( xx[0]); // 왜 10이 안나오고 100이 나올까? 
		// 10이 x에 들어가는게 맞다! 하지만 이것이 배열이 되어버리면 {10, 20, 30} 자체가 x로 대입되는 것이 아니라 10 20 30의 위치가 저장됨
		// 이에 따라 배열 yy에다가 xx를 저장하면 xx가 가진 주소가 들어가지게 된다. 이후 yy 0번째 값에다가 100의 주소를 넣어버리면 100이 나오게 된다.
		
		// 그러면 이걸 어떻게 구분하는가?
		// 값이 들어가는지 위치가 들어가는지 어떻게 구분할 수 있겠는가? 
		// '=' 했을때 값이 들어가는지, 위치를 알려주는지 구분할 필요성이 있음
		// 자바에서 '='의 의미
		//    - 기본자료형만 값이 넘어가고 나머지는 모조리(!) 값이 넘어감
		// 유의! 기본자료형을 여러개로 뭉쳐서 쓰는 배열(array)의 경우 절대 기본자료형으로 취급하지 않음. 배열형으로 취급
		
		//cf) String name = "ABC"; String은 Class단위로, 기본자료형은 아님. ABC 각각의 값들에 대한 주소를 저장
		//프로그램의 시작은 아이디와 비밀번호를 비교해야함
		
	}
}
