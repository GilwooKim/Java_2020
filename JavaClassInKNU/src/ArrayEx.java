
public class ArrayEx {

	public static void main(String[] args) {
		//�ڹٿ��� �迭 ����� ���� ���� �� ����
		//1. ���� �̻����� ���̽�
		int[] x = new int[3];
		System.out.println(x[0]);
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println(x[0]);
		
		//2. �� ���� ���Ǵ� ���
		int[] y = {10,20,30};
		
		//3. �ͽ� 
		int[] z = new int[] {10,20,30};
		
		//2���� �迭
		int[][] xx = new int [2][2];
		xx[0][0] = 10;
		xx[0][1] = 20;
		xx[1][0] = 30;
		xx[1][1] = 40;
		
		// == int[][] xx = { {20, 20}, {30, 40} };
		
		//2���� �迭�� Column�� ���� �����Ҵ�
		int[][] yy = new int[2][];
		yy[0] = new int[3]; // 0��° �࿡�� 3ĭ ����
		yy[1] = new int[2]; // 1��° �࿡�� 2ĭ ����
		
			
	}

}
