import java.util.Scanner;
//import 생략이 가능한 경우 => java.lang.* => 자동인식됨
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		
		int sum=0;
		for(int i=0;i<=a;i++)
		{
			sum+=i;
		}
		
		System.out.println("1~"+a+"까지의 합:"+sum);
		
		// 메소드 종료 => return
		
	}

}

