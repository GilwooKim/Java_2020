package kr.co.infopub.chapter.s014;
//타입 변환의 필요성
public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat = "37.5212";
		double latitute = Double.parseDouble(slat.trim());
		System.out.println(latitute);
	}
}
