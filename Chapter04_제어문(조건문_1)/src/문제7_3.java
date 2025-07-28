import java.util.Scanner;

public class 문제7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 영어 수학입력(90 90 90):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		int avg = total/3;
		char score='A';
		switch(avg/10)
		{	
			case 10:
			case9:
				score='A';
			break;
			case 8:
				score='B';
			break;
			case 7:
				score='C';
			break;
			case 6:
				score='D';
			break;
			default:
				score='F';
			
		}
		
		System.out.println("학점:"+score);
	}

}