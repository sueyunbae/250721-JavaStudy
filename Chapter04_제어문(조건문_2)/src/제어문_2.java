/*
 * 	정수 2개 입력
 * 	연산자 입력
 * 	+ - * / ==> 사칙연산
 * 	------- 다중 조건문 
 * 
 * */
import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/):");
		String strOp=scan.next();
		char op=strOp.charAt(0);
		
		// Scanner/BuffereadReader => char입력이 없다
		// String => charAt(0)
		/*
		 * Hello Java
		 * 0123456789 (인덱스 번호. 0번부터 시작)
		 * */
		System.out.println("두번째 정수 입력:");
		
		int num2=scan.nextInt();
		
		System.out.println("===== 입력값 =====");
		System.out.println("1' 정수:"+num1);
		System.out.println("연산자:"+op);
		System.out.println("2' 정수:"+num2);
		
		System.out.println("===== 결과값 =====");
		if(op=='+')
		{
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2);
		}
		else if(op=='-')
		{
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1-num2);
		}
		else if(op=='*')
		{
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1*num2);
		}
		else if(op=='/')
		{
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.printf("%d %c %d = %d\n", num1, op, num2, num1/num2);
		}
		else
		{
			System.out.println("잘못 입력된 연산자입니다!!");
		}
		/*
		 * if => 조건문 
		 * 		1) 오류 처리
		 * 		2) 상세보기
		 * 		3) 검색
		 * 		4) 게임 => 키보드 입력에 따라 처리 변경(위/아래/왼/오)
		 * 		5) 네트워크 : 내부 프로토콜
		 * 		   클라이언트 => 100 서버=> 로그인
		 * */
		
	}

}
