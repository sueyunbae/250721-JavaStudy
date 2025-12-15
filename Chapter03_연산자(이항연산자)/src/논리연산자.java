/*
 * => &&, ||
 *   (조건)&&(조건) : 범위나 기간 포함
 *   (조건)||(조건) : 범위나 기간외 => 오류(잘못된 입력)
 *                  0> || >100
 * ---------------------------------------------
 *     (조건)  (조건)   &&(직렬)  ||(병렬)
 *      true  true     true     true
 *      true  false    false    false
 *      false true     false    true
 *      false false    false    false
 * ---------------------------------------------
 *   효율적인 조건 검색 => 속도를 최적화
 *   => 앞에 있는 조건이 true ==> ||은 뒤에 있는 조건을 수행하지 않는다
 *   => 앞에 있는 조건이 false ==> &&는 뒤에 있는 조건을 수행햐지 않는다   
 *   
 *   => 어디부터 ~ 어디까지 => &&
 *   => 오류처리 
 *   1. 프로그램은 반드시 시작과 동시에 오류처리 (||)
 *   	예) 문자열을 받아서 좌우 대칭여부를 확인하는 프로그램 => 먼저 문자열이 짝수인지부터 
 *         ABBA => 0, length-1
 *   2. 범위안에 설정...
 *   	
 *   		
 * */

import java.util.Scanner;
//알파벳 한개 입력 => 대문자/소문자
/*
 * c
 * 대문자 조건 => c>='A' && c<='Z'
 * 소문자 조건 => c>='a' && c<='z'
 * 
 * => && > || => &&연산자가 ||보다 우선순위가 높다
 * 
 * => 윤년여부
 *    : 4년마다, 100년마다 제외, 400년마다
 * */
public class 논리연산자 {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("알파벳 한개입력:");
//		String str=scan.next();
//		char c=str.charAt(0);
//		System.out.println("c="+c);
//		if(c>='A' && c<='Z')
//			System.out.println("대문자입니다");
//		else if(c>='a' && c<='z')
//			System.out.println("소문자입니다");
//		else
//			System.out.println("알파벳이 아닙니다");
		
		//효율적연산
		//&& => (조건)&&(조건)
		//  	false   수행X (앞이 false일 확률이 높은 조건을 넣으면 더 효율적이다)
		//|| => (조건)||(조건)
	    //      true    수행X (앞이 true이면 뒤에는 건너뛴다)  
//		int x=10;
//		int y=9;
//		boolean result=(x<y) && ++y==x;// y는 증가하지 않는다
//		System.out.println("result:"+result);
//		System.out.println("x="+x);
//		System.out.println("y="+y);
		
		//운년 검색
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		String result=(year%4==0 && year%100!=0) || (year%400==0)?"윤년입니다":"윤년이 아닙니다";//3항연산
		System.out.println(result);
		
		
	}

}
