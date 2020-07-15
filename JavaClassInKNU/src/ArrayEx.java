
public class ArrayEx {

	public static void main(String[] args) {
		//자바에서 배열 사용을 위한 문법 세 가지
		//1. 가장 이상적인 케이스
		int[] x = new int[3];
		System.out.println(x[0]);
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println(x[0]);
		
		//2. 더 많이 사용되는 방법
		int[] y = {10,20,30};
		
		//3. 믹스 
		int[] z = new int[] {10,20,30};
		
		//2차원 배열
		int[][] xx = new int [2][2];
		xx[0][0] = 10;
		xx[0][1] = 20;
		xx[1][0] = 30;
		xx[1][1] = 40;
		
		// == int[][] xx = { {20, 20}, {30, 40} };
		
		//2차원 배열의 Column에 대한 동적할당
		int[][] yy = new int[2][];
		yy[0] = new int[3]; // 0번째 행에는 3칸 배정
		yy[1] = new int[2]; // 1번째 행에는 2칸 배정
		
			
	}

}
