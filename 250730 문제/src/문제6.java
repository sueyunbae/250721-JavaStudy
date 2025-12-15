import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int gop=1;
		if(a<b) {
			for(int i=a;i<=b;i++)
			{
				gop*=i;
			}
			
			System.out.println(gop);
		}
		else
		{
			for(int i=a;i>=b;i--)
			{
				gop*=i;
			}
			
			System.out.println(gop);
		}
	}

}
