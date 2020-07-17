
//자바에서 예외처리를 위한 문법(런타임 시점에서 발생하는 문제를 어떻게 처리할 것인가?)

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("시작");
		int x = 10;
		int y = 1;
		int[] xx = {10, 20, 30};
		try {
			int z = x / y; 												// 오류발생 가능지점
			System.out.println(z);
			System.out.println( xx[3]);									// 오류발생 가능지점
		}catch (ArithmeticException e) {								// 예외가 발생할 경우 대처방안으로 실행해줄 코드를 기입
			e.printStackTrace(); 										// 오류가 넘어왔다면 어디서부터 왔는지까지 트래킹을 해줌
			System.out.println("산술연산오류발생");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); 										// 오류가 넘어왔다면 어디서부터 왔는지까지 트래킹을 해줌		
			System.out.println("배열 범위 초과 오류 발생");
		}catch(Exception e) {
			System.out.println("오류발생");
		}finally {														//이 친구는 예외 발생여부와는 상관없이 무조건 실행을 시켜줌
			System.out.println("예외 발생 여부와 상관없이 finally 구문 무조건 실행");
		}
		System.out.println("끝");
	}
}
/*
 * 이러한 예외처리의 장점 try catch 예외처리를 사용하면 코드가 멈추지 않고 예외처리를 해준대로 진행이 된다. 프로그램의 비정상적인
 * 종료를 방지함. 다만 잘못된 예외처리를 하게 되면 문제가 발생되도 프로그램이 계속 진행이 된다는 점에서 신중할 필요성이 있음. 개발자는
 * 디버깅용으로 로그파일을 만들어서 어디에서 오류가 발생을 했었는지에 대해서 명확하게 알 필요성은 있음.
 * 
 * 전체프로그램 내에서 Try Catch 문안에서 문제가 발생한 바로 아랫라인들은 실행이 안됨.
 * 즉 산술연산오류발생시에 배열범위초과오류에 대해서 체크를 하지 않게 된다. 
 * 
 */