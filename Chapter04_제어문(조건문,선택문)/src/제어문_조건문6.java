/* 1. 알파벳을 입력 받아서(단일 조건문) => 연산자
 *   = 대문자 
 *   = 소문자
 *   = 알파벳이 아님  
 *    
 */
import java.util.Scanner;

/*
 * 변수 => 응용(연산자) => 응용(제어문) => 응용 => 메소드(여러개 묶음,클래스)
 * */
public class 제어문_조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력: ");
		String temp=scan.next();
		char c=temp.charAt(0);
		
		if (c>='A' && c<='Z')
			System.out.println("대문자");
		
		if (c>='a' && c<='z')
			System.out.println("소문자");
		
		if (!(c>='A' && c<='Z')||(c>='a' && c<='z'))
			System.out.println(c+"는(은) 알파벳이 아니다"); //중요!!! 
	}

}
