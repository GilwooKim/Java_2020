package kr.co.infopub.chapter.s025;
import java.util.Scanner;
//입력, 출력
public class InOutMethod {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int choice=scann.nextInt();
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요");
		Double rchoice=scann.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열를 입력하세요");
		String schoice=scann.next();
		System.out.println(schoice);
		
	}
}
