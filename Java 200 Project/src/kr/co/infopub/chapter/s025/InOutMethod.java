package kr.co.infopub.chapter.s025;
import java.util.Scanner;
//�Է�, ���
public class InOutMethod {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int choice=scann.nextInt();
		System.out.println(choice);
		
		System.out.println("�Ǽ��� �Է��ϼ���");
		Double rchoice=scann.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("���ڿ��� �Է��ϼ���");
		String schoice=scann.next();
		System.out.println(schoice);
		
	}
}
