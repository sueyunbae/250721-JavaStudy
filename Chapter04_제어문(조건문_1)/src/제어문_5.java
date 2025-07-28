//조건문
/*
 * 선택 조건문 : ture/false 나눠서 작업
 * 변수/연산자/제어문/메소드
 * -------------------- 웹에서 사용
 * 
 * */
import java.util.Scanner;
public class 제어문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("두자리 정수 입력:");
		int num=scan.nextInt();
		if(num>=10 && num<=99)
		{
			//int a=num/10;
			//int b=num%10;
			if(num%11==0)
			{
				System.out.println(num+"은(는) 같은 수입니다");
			}
			else
			{
				System.out.println(num+"은(는) 다른 수입니다");
			}
		}
		
		else
		{
			System.out.println(num+"은(는) 같은 수입니다");				
		}	
			
		}
		
		

	}

