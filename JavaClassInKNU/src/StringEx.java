
public class StringEx {
	public static void main(String[] args){
		
		//�ڹٿ��� ���ڿ��� �����ϱ� ���� ����ϴ� String Class
		//String Class�� �ΰ��� Ư¡
		// 1. �Ϲ����� ��ü������ ���� / �⺻���� ������ ��� �� ������ Ŭ������ ������ �ʰ� �ڵ带 ¥�� ���� �ƿ� �ּҰ��� �����ϰ� ��������.
		// str1�� str4�� ��찡 �Ϲ������� ������ �ּҰ����� ���������� ����� ��. 


		String str1 = "ABC";
		String str2 = new String("ABC");
		String str3 = new String("ABC");
		String str4 = "ABC";
		
		if ( str1 == str2 ) {
			System.out.println( " ����. ");
		}else {
			System.out.println( " �ٸ���. ");
		}
		
		if ( str3 == str2 ) {
			System.out.println( " ����. ");
		}else {
			System.out.println( " �ٸ���. ");
		}
		
		if ( str1 == str4 ) {
			System.out.println( " ����. ");
		}else {
			System.out.println( " �ٸ���. ");
		}
		
		// ���ڰ� �񱳸� ���ؼ��� "==" ��� .equals() �޼ҵ带 ����� ��!
		if ( str1.equals(str2) ) {
			System.out.println( " ����. ");
		}else {
			System.out.println( " �ٸ���. ");
		}
		
		if ( str3.equals(str2) ) {
			System.out.println( " ����. ");
		}else {
			System.out.println( " �ٸ���. ");
		}
		
		if ( str1.equals(str4) ) {
			System.out.println( " ����. ");
		}else {
			System.out.println( " �ٸ���. ");
		}
		
		// 2. �Һ����� Ư¡
		String name = "ABC";
		//  name = name + "CDE" ���������δ� ���� ������, �޸� ��ü�� String ������ ������������� �ʱ� �� ��ü�� �־ ������ �Ҵ��ϱ� ������, ���������δ� ������ �Ұ���
		//  ������ ������ ���� �ʰ�, ������ �ٽ� String���� ���� ó���� �ع���.
		//  �ڹٴ� New�� ����� ���� ������(�ڿ� �Ҵ��� ������), �ڿ� ������ ���������� ����. �ڿ��� ���ڶ�� �ñ⿡ ���������(Garbage Collector)�� �̿���.
		//  �׷� ����� �־ �����ŭ ������ �����ϴ� ���� �Ұ���. ��, �� ���� �˰������� ������ �Ǳ� ������ ����Loss�� ������ ��. 
		//  �����, �� �迭�� ���α׷��ֿ����� �ڿ��� �Ѱ�Ǿ�, String ��ü�� �� ������� ����. 
		
	}
}

