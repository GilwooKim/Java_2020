
public class ForEX {
	public static void main(String[] args) {
		
		double result = 0;
		//반복문
		//      초기값      / 조건   / 증감쇠 cf) i++는  i를 1씩 증가를 시키겠다 / i-- i를 1씩 감소를 시키겠다. ++i / --i도 있음. 
		for ( int i = 0; i<10; i++) {//i 값을 for 문 안에서 사용하며 이를 통해 몇 번 반복했는지 체크하겠다 라는 의미
			//반복할 코드
			result = result + 0.1;
		}
		System.out.println(result);
	}
}
