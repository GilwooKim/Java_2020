
public class Gugudan {
	public static void main(String[] args) {
		for(int i = 2 ; i <10 ; i++) {
			System.out.println(i+"단부터 시작합니다");
			for(int j = 1; j <10 ; j++) {
				System.out.print(i+" * "+j +" = "+ i*j + "\t");
			}
			System.out.println("\n");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		}
	}
}
