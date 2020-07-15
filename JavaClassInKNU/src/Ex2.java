/*
 	경북대학교 정보전산원 JAVA 강의
 	20200707
 */
public class Ex2 { //자바 프로그램은 Class를 꼭 하나를 가지고 있어야 함

	public static void main(String[] args) { //자바 프로그램에서는 무조건 실행 프로그램으로써 MAIN이 필요함
		//자바의 기본자료형
		//(1) 정수형 : 암묵적인 default 타입이 int형인 것을 인지할 것!
		// byte(1바이트) - short(2바이트) - int(4바이트) - long(8바이트)
		
		byte a = -128; // 1 byte = 256 = -128~127
		byte b = 10;
		b =+ 10;
		System.out.println(b);
		
		int f = b + 10; //자바에서는 산술연산을 하게 되면 모든 자료형이 int형으로 받아들이게 된다. 사칙연산은 int 형으로만 계산
	
		
		short c = 10;
		System.out.print(c);
		
		
		int d = 10;
		System.out.println(d);
		
		long e = 10;
		System.out.println(e);
		
		//(2) 실수형 : 실수형의 default 타입은 무조건 double 형식으로 인식이 됨.
		//float - double 두 가지 타입이 있음. 대부분 운영체제가 깔려있는 곳에 자바 프로그래밍이 들어가게된다. 운영체제 중 세부적인 조절이 필요한 곳에 사용
		
		float g = 0.1f; // float g = 0.1; 에러발생 - f를 뒤에 붙여서 에러 처리
		double h = 0.2;
		System.out.println(g);
		System.out.println(h);
		
		//(3) 문자형 :
		//char
		char i = 'A';  // char은 1개의 문자를 위해서 만들어진 것 따라서 2개 이상의 문자를 동시에 표현하기 위해서는 배열을 사용할 필요가 있음.
		System.out.println(i); 
		char i2 = 65;
		System.out.println(i2);
		System.out.println("Hi"); //주석 잘 달아주는 것이 필요하다!
		
		//(4) Boolean형
		//true - false
		boolean boo = true; //C언어에서 0과 1로 True False 를 판단하는 것은 Java에서는 불가능
		
		
	}
	
}
