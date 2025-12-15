/*
 * 	1. 조건문
 * 		형식)
 * 			if(조건문)
 * 			{ -------> true/false가 결과값인 연산자만 사용
 * 					   ----------
 * 						부정연산자(!)
 * 						비교연산자(==,!=,<,>,<=,>=)
 * 						논리연산자(&&, ||)
 * 				조건이 true일때만 실행 => false면 건너뛴다
 * 			}
 * 			=> 사용 : 상세보기, 버튼클릭, 메뉴 클릭
 * 					 로그인처리, 아이디찾기, 비밀번호찾기, 아이디중복체크, 검색, 유효성검사
 * 				선택 조건문 : true / false를 나눠서 작업
 * 				if(조건문)
 * 				{
 * 					조건이 true => 수행
 * 					아이디가 입력된 경우
 * 				}
 * 				else
 * 				{
 * 					조건이 false => 수행
 * 					아이디가 입력이 안된 경우
 * 				}
 * 				--------------------------
 * 				=> 로그인 처리 : 로그아웃 창
 * 				=> 로그인 처리가 안된다 : 로그인 창
 * 				=> 파일 2개(로그인,로그아웃)
 * 				---------------------------
 * 				=> 검색
 * 				   --- 데이터가 있는 경우 : if
 * 				   --- 검색이 안된 경우 : else
 * 				=> 다중조건문 
 * 				    => 선택문 
 * 					=> 웹개발에서 사용빈도가 낮다 => DECODE / CASE 를 쓰기 떄문에
 * 											   ------   ----
 * 			     형식)
 * 					 if(조건문)
 * 					 {
 * 						조건 true => 실행문장 => 종료
 * 						조건 false => 다음 조건
 * 					 } 
 * 					 else if(조건문)
 * 					 {
 * 						조건 true => 실행문장 => 종료
 * 						조건 false => 다음 조건
 * 					 }
 * 					 else if(조건문)
 * 					 {
 * 						조건 true => 실행문장 => 종료
 * 						조건 false => 다음 조건
 * 					 }
 * 					 else
 * 					 {
 * 						해당 조건이 없는 경우 => 수행문장
 * 						=> 생략이 가능
 * 					 }
 * 					 ------------------------------
 * 					  +,-,*,/ => 아니면 => 처리
 *                    --------					
 *                    
 *                    => 다중조건문 vs switch
 *                    	 -----------------
 *                    	 범위지정	     모든 경우
 *                    	--------
 *                    	값1개만 지정
 *                    	  키보드
 *                    => switch(문자,문자열,정수)
 *                       case 'A'
 *                       case 1
 *                       case "LOGIN"
 *                       
 *                       switch(문자)
 *                       {
 *                       	case 'A':
 *                       	 처리문장
 *                            break
 *                       	case 'B':
 *                       	 처리문장
 *                            break
 *                       	case 'C':
 *                       	case 'D':
 *                       	 처리문장
 *                            break
 *                          default:
 *                            case에 없는 값
 *                       }
 *                       => break가 없는 처리
 *                       	switch(문자)
 *                       	{
 *                            case 'A' -> {
 *                            	처리문장
 *                            }
 *                            case 'B' -> {
 *                            	처리문장
 *                            }
 *                            case 'C' -> {
 *                            	처리문장
 *                            }
 *                       	}
 *                          break를 사용하면 오류(break가 내장되어 있다)
 *                          윈도우/네트워크 = 자주 사용
 *                          외부 : 화면출력 => 목록출력
 *                          	  반복문 => for/while
 *                          ***for : 일차, 이차 => 알고리즘
 *                          ***while : 데이터베이스
 *                          do~while : 사용빈도가 거의 없다(사용 빈도가 거의 없다)
 *               ----------------------------------------------------------
 *               2차 for
 *               
 *               for(int i=1;i<=3;i++)
 *               {
 *               	for(int j=1;j<=3;j++)
 *               	{
 *               		실행문장
 *               	}
 *               }
 *               
 *               i=1 => i<=3 => true
 *               		j=1 실행문장 j++
 *               		j=2 실행문장 j++
 *               		j=3 실행문장 j++
 *               		j=4 j<=3 => false => i++
 *               i=2 => i<3 => true
 *                     j=1 실행문장 j++
 *               	   j=2 실행문장 j++
 *               	   j=3 실행문장 j++
 *               	   j=4 j<=3 => false => i++
 *               i=3 => i<3 => true
 *                     j=1 실행문장 j++
 *               	   j=2 실행문장 j++
 *               	   j=3 실행문장 j++
 *               	   j=4 j<=3 => false => i++
 *               i=3 => i<3 => false => 프로그램 종료
 *               
 *               => for문 응용
 *               
 * */
import java.util.*;
public class 제어문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		System.out.printf("❤️❤️❤️❤️❤️ %d년 %02d월 %02일 ❤️❤️❤️❤️❤️\n\n",year,month,day);
		
		System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.print("토\t");
		System.out.println();
		
		Calendar cal=Calendar.getInstance();
		//메모리 저장
		//날짜 지정
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);//month => 0번부터
		cal.set(Calendar.DATE,1);
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		//요일(1번 시작)
		week=week-1;
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=1;j<week;j++)
				{
					System.out.println("\t");
				}
			}			
			System.out.printf("%02d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}

	}

}
