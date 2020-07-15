
public class StringEx {
	public static void main(String[] args){
		
		//자바에서 문자열을 저장하기 위해 사용하는 String Class
		//String Class의 두가지 특징
		// 1. 암묵적인 객체생성을 지원 / 기본형과 유사한 경우 즉 별도의 클래스를 만들지 않고 코드를 짜는 경우는 아예 주소값을 동일하게 만들어버림.
		// str1과 str4의 경우가 암묵적으로 동일한 주소값으로 만들어버리고 계산을 함. 


		String str1 = "ABC";
		String str2 = new String("ABC");
		String str3 = new String("ABC");
		String str4 = "ABC";
		
		if ( str1 == str2 ) {
			System.out.println( " 같다. ");
		}else {
			System.out.println( " 다르다. ");
		}
		
		if ( str3 == str2 ) {
			System.out.println( " 같다. ");
		}else {
			System.out.println( " 다르다. ");
		}
		
		if ( str1 == str4 ) {
			System.out.println( " 같다. ");
		}else {
			System.out.println( " 다르다. ");
		}
		
		// 문자값 비교를 위해서는 "==" 대신 .equals() 메소드를 사용할 것!
		if ( str1.equals(str2) ) {
			System.out.println( " 같다. ");
		}else {
			System.out.println( " 다르다. ");
		}
		
		if ( str3.equals(str2) ) {
			System.out.println( " 같다. ");
		}else {
			System.out.println( " 다르다. ");
		}
		
		if ( str1.equals(str4) ) {
			System.out.println( " 같다. ");
		}else {
			System.out.println( " 다르다. ");
		}
		
		// 2. 불변적인 특징
		String name = "ABC";
		//  name = name + "CDE" 문법적으로는 말이 되지만, 메모리 자체에 String 형식을 집어넣을때부터 초기 값 자체만 넣어서 공간을 할당하기 때문에, 실질적으로는 수정이 불가능
		//  보통은 수정을 하지 않고, 내용을 다시 String으로 만들어서 처리를 해버림.
		//  자바는 New로 만드는 것은 있지만(자원 할당은 있지만), 자원 해제는 문법적으로 없음. 자원이 모자라는 시기에 쓰레기수집(Garbage Collector)를 이용함.
		//  그런 기능이 있어도 사람만큼 빠르게 정리하는 것이 불가능. 즉, 이 또한 알고리즘으로 진행이 되기 때문에 성능Loss로 진행이 됨. 
		//  모바일, 웹 계열의 프로그래밍에서는 자원이 한계되어, String 자체를 잘 사용하지 않음. 
		
	}
}

