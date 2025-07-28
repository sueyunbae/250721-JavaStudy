import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("학년, 점수를 입력하세요(0 90):");
		int grade=scan.nextInt();
		int score=scan.nextInt();

		if (score<0 || score>100)
			System.out.println("점수를 잘못입력했습니다");
		
		else 
		{
//			if (grade==4) 
//		
//			{
//				if(score>=70)
//					System.out.println("합격");
//				else
//					System.out.println("불합격");
//			}
//		
//			else 
//			{
//				if(score>=60)
//					System.out.println("합격");
//				else
//				System.out.println("불합격");
//			}
			
			System.out.println( 
			((grade==4)&&score>=70)||((grade!=4)&&score>=60)?"합격":"불합격");
			//삼항연산자로 코딩
		}
		
	}

}
