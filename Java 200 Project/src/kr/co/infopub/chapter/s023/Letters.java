package kr.co.infopub.chapter.s023;

public class Letters {
	public static void main(String[] args) {
		char a='��';
		String letter="���� ���� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		int letterNuber=letter.length();
		int loc=letter.indexOf(a);
		System.out.printf("\"%s\"=>%d���̸�, '%c'�� %d��°�� �ִ�.\n",letter,letterNuber,a,loc);
	}
}
