package kr.co.infopub.chapter.s014;
//����� ���� Ŭ��
class JLocation{
	public double lat;
	public double lng;
}
public class JavaUserDefinedType {
	public static void main(String[] args) {
		//�� ���� �⺻Ÿ��
		double latitute = 37.52127220511242;
		double longitute = 127.0074462890625;
		//����� ���� ��ü�� ����
		JLocation jloc = new JLocation();
		jloc.lat = latitute;
		jloc.lng = longitute;
		
		JLocation newLoc = jloc;
		System.out.println(newLoc.lat);
	}
}
