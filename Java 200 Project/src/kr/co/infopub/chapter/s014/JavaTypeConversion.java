package kr.co.infopub.chapter.s014;
//Ÿ�� ��ȯ�� �ʿ伺
public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat = "37.5212";
		double latitute = Double.parseDouble(slat.trim());
		System.out.println(latitute);
	}
}
