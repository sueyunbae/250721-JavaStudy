import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num=scan.nextInt();
		if (num>=50)
		{
			System.out.println("50이상입니다");
		}
		else
		{
			System.out.println("50미만입니다");
		}
			
	}

}
