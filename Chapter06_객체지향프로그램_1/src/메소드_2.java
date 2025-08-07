/*
 * 	변수/데이터형/연산자/제어문 ==> 프로그램의 기본
 *  관련된 데이터를 묶는다 => 같은 데이터형 : 배열
 *  				 => 다른 데이터형 : 클래스
 *  관련된 명령문을 묶는다 => 메소드
 *  	=> 만들지 못하는 부분이 존재 
 *  	=> 이미 만들어진 것 제공 : API
 *  -------------------------------------- 묶어서 처리 => 객체
 * */

// 리턴형 받기 => 기본형/배열/클래스(상세보기)
// 사칙연산 
import java.util.Scanner;
public class 메소드_2 {
	// int a=(int)(Math.random()*100)
	// 반복제거
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(msg);
		return scan.nextInt();//staitc int이므로 return에도 int값보다 같거나 작은 데이터형이 들어와야함
	}
	static int plus(int a,int b)
	{
		return a+b;
	}
	static int minus(int a,int b)
	{
		return a-b;
	}
	static int gop(int a,int b)
	{
		return a*b;
	}
	static void div(int a,int b)
	{
		// 자체 처리 => void
		if(b==0)
			System.out.println("0으로 나눌 수 없습니다");
		else
			System.out.println(a/(double)b);
	}
	//계산기
	static void process()
	{
		int a=input("첫번째 정수 입력:");
		int b=input("두번째 정수 입력:");
		Scanner scan=new Scanner(System.in);
		System.out.print("연산자 입력(+,-,*,/):");
		switch(scan.next())
		{
		case "+" ->{
			int c=plus(a,b);
			System.out.printf("%d+%d=%d\n",a,b,c);
		}
		case "-" ->{
			int c=minus(a,b);

			System.out.printf("%d-%d=%d\n",a,b,c);
		}
		case "*" ->{
			int c=gop(a,b);
			System.out.printf("%dX%d=%d\n",a,b,c);
		}
		case "/" ->{
			div(a,b);//그냥 바로 호출
		}
		}
	}
	//정답은 없다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
