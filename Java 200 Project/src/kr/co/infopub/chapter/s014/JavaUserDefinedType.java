package kr.co.infopub.chapter.s014;
//사용자 정의 클라스
class JLocation{
	public double lat;
	public double lng;
}
public class JavaUserDefinedType {
	public static void main(String[] args) {
		//두 개의 기본타입
		double latitute = 37.52127220511242;
		double longitute = 127.0074462890625;
		//사용자 정의 객체를 생성
		JLocation jloc = new JLocation();
		jloc.lat = latitute;
		jloc.lng = longitute;
		
		JLocation newLoc = jloc;
		System.out.println(newLoc.lat);
	}
}
