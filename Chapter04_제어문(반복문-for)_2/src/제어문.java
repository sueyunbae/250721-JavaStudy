/*
 * 프로그램 용어 
 * 	1. 변수
 * 		하나의 값을 메모리에 저장해서 재사용
 * 		------- 변경해서 사용이 가능
 * 	2. 상수
 * 		하나의 값을 메모리에 저장해서 사용
 * 		------- 변경할 수 없다
 * 		final => 값을 고정
 * 		예) for ==> 10
 * 	3. 초기값
 * 		변수를 선언한 경우에 처음 저장하는 값
 * 		int a=10; 
 * 	4. 자료형(데이터형)
 * 		컴퓨터에 자체 처리 => 메모리 크기
 * 		=> 정수 / 실수 / 문자 / 논리
 * 		=> 자동처리가 안되는 경우(사용자 정의 데이터형:참조형)
 * 							 --------------- 
 * 							  class / interface / enum
 * 	5. 연산자 : 연산을 사용하기 위한 기호(+,-,...)
 * 	6. 피연산자 : 연산에 필요한 데이터	
 * 	7. 제어문 : 실행시에 흐름을 개발자가 원하는 방향으로 바꿀 수 있게 만드는 것
 * 			   상황에 따라 변경 => 조건문, 선택문
 * 			   프로그램 실행중에 계속 반복 : 반복문(for, while)
 * 			   => 프로그램 종료 : break, continue => 프로그램 제어
 * 		=> for : 반복 횟수가 지정
 * 				 => 화면 출력 / 목록
 * 		=> while : 무한 루프 => 반복 횟수가 없는 경우(한번도 수행 못할 수 있다-선조건)
 * 				   => 데이터베이스 / 네트워크
 * 				   => 무조건 => 종료 조건을 설정(아니면 에러남)
 * 		=> do~while : 무조건 한번 이상 수행-후조건
 * 		=> break, continue => 바로 밑에 소스 코딩이 불가능(맨 마지막 줄에 쓴다)
 * 
 * 	for : 반복횟수 
 * 		  => 2차 for문 : 알고리즘(정렬 / 등수구하기 / 구구단...)
 *  배열 : int a1~a10000;
 *  	  int[] arr=new int[10000]
 *  	  => 여러 값을 한개의 변수명에 저장			
 *  	  => 클래스 ==> 50개
 *  		 한개의 이름으로 제어 => 인터페이스	  	
 *  
 *  	     명령문의 묶음 => 메소드
 *           ------------------- 
 *       
 *       => 반복문(for)
 *       	for(초기값(시작);조건(끝);증감)
 *       	{
 *       		실행문장
 *       	}
 *       	=> 알파벳 => 연산처리 => 자동으로 정수 변수
 *       		char c='A' c<='Z'
 *       		=> 실수는 사용하지 않는다
 *       	=> 종료하지 않는 프로그램 : 무한루프 => for(;;)
 * */
public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 정수 출력
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();//줄 띄우기
		
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		
		String s="Hello Java";
		for(int i=0;i<s.length();i++) //length():문자의 갯수,length()-1값이 인덱스 번호(0번부터 시작해서)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		System.out.println();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		

	}

}
