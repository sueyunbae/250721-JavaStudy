/*
 * 	선택문
 * 	 형식)
 * 		switch(정수,문자,문자열)
 * 		{
 *			정수
 *			case 1:
 *			  처리문장
 *			break;
 *			case 2;
 *			  처리문장
 *			break;
 *			..
 *			..	
 *			..
 *			default:
 *			  처리문장
 * 		}
 *      => break없이 사용
 *      	switch(문자,문자열,정수)
 *      	{
 *				case 1 -> {
 *
 *				}
 *				case 2 -> {
 *
 *				}
 *				case 3 -> {
 *
 *				}         
 *      	}
 *      	switch(문자, 문자열, 정수)
 *      	{
 *      	   case 1,2 -> {
 *      	   }
 *             case 3,4 -> {
 *      	   }
 *      	}
 *      	=> 값 한개 선택 => 다중 조건문을 간결하게
 *      	=> 메뉴, 게임 키를 누르는 경우
 *      	=> 게임/네트워크
 *      	=> 1개만 사용이 가능
 *      	=> 웹에서는 많이 사용하지 않는다
 *      
 *      	=> 데이터형 : short, float, 
 *      				byte => 파일 업로드 / 파일다운로드
 *      				=> int long double String
 *      	=> 연산자 : !, ++, --, ()
 *                    산술,비교,논리,대입
 *          => 제어문 : if, if ~ else
 *          		   for, while
 *          		   break
 *          ---------------------------------------------------
 *          정수 => 1
 *          int a=1;
 *          switch(a)
 *          {
 *          	case 1:
 *          		System.out.println(1)
 *              case 2:
 *              	System.out.println(2)
 *              case 3:
 *              	System.out.println(3)
 *              case 4:
 *              	System.out.println(4)
 *              case 5:
 *              	System.out.println(5)
 *              default:
 *              	System.out.println("없는 번호")              
 *          }
 *          
 *          switch(avg)
 *          {
 *           case 10:
 *           case 9: 
 *           System.out.println("없는 번호")
 *          }
  */

import java.util.Scanner;

public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		System.out.println("첫번째 정수 입력:");
		int num2=scan.nextInt();
		
//		switch(op)
//		{
//		case "+":
//			System.out.printf("%d %s %d = %d\n",
//				num1,op,num2,num1+num2);
//			break;
//		case "-":
//			System.out.printf("%d %s %d = %d\n",
//				num1,op,num2,num1-num2);
//			break;
//		case "*":
//			System.out.printf("%d %s %d = %d\n",
//				num1,op,num2,num1*num2);
//			break;
//		case "/":
//			if(num2==0)
//				 System.out.println("0으로 나눌 수 없다");
//			else
//				System.out.printf("%d %s %d = %d\n",
//						num1,op,num2,num1/num2);
//			break;
//		default: 
//		System.out.println("잘못된 연산자입니다");
//			
//		}
		
		
		// break가 내장 되어 있음 -> {}
		switch(op)
		{
		case "+" -> {
			System.out.printf("%d %s %d = %d\n",
				num1,op,num2,num1+num2);
			}
		case "-" -> {
			System.out.printf("%d %s %d = %d\n",
				num1,op,num2,num1-num2);
			}
		case "*" -> {
			System.out.printf("%d %s %d = %d\n",
				num1,op,num2,num1*num2);
			}
		case "/" -> {
			if(num2==0)
				 System.out.println("0으로 나눌 수 없다");
			else
				System.out.printf("%d %s %d = %d\n",
						num1,op,num2,num1/num2);
			}
		default -> { 
			System.out.println("잘못된 연산자입니다");
			}	
		}
		
	}

}
