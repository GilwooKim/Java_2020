
public class ifEx {

	public static void main(String[] args) {

//		int x = 30;
//		double y = 30.00000000000000001;
//
//		if (x > y) {
//			System.out.println("x가 y보다 더 크다");
//		} else if (x < y) {
//			System.out.println("y가 x보다 더 크다");
//		} else {
//			System.out.println("x와 y는 같다");
//		}
		
		int score = 90;
		
		if (score>=90) {
			System.out.println("A");
		} else if(score>=80 && score<90) {
			System.out.println("B");
		} else if(score>=70 && score<80) {
			System.out.println("C");
		} else if(score>=60 && score<70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// & &&차이 : 1개 짜리는 하나가 false가 나오더라도 마지막까지 연산을 하며, &&를 쓰는 경우 중간에 false가 나ㅇ면 그만 둠
		// 만약  if(score < 90 && (score=score+10) >=80)와 같이 산술형이 나오는 경우는 &&를 사용하는 것이 더 좋음.  
	}
}

//cf) Ctrl + Shift + F 를 누르면 줄간격 자동으로 조정해줌
