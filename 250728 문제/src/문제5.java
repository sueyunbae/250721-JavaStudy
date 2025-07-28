import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num=scan.nextInt();
		
		if (num>=0) // (num>-1)
		{
			System.out.println("양수입니다");
			System.out.println("절댓값:"+num); 
		}
			
		else 
		{
			System.out.println("음수입니다");
			System.out.println("절댓값:"+(-num));
		}
		
		System.out.println("라이브러리이용 절댓값:"+Math.abs(num));
		
	}

}
