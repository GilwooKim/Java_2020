//정수 - 실수 변환을 통환 섭씨를 화씨로 바꾸기

package kr.co.infopub.chapter/s042;

public class Temperature{
  public static void main(String[] args){
    for (int i = 0; i <101; i++){
       double fahrenheit = 9.0/5*i+32;
       System.out.println("섭씨%도 = 화씨%.2f도\n", i, fahrenheit);
    }
  }
}
