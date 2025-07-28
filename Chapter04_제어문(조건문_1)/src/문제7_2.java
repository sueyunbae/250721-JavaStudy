import java.util.Scanner;
public class 문제7_2 {

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
		{	//break를 사용하면 오류 발생
			case 10,9 -> {
				score='A';
			}
			case 8 -> {
				score='B';
			}
			case 7 -> {
				score='C';
			}
			case 6 -> {
				score='D';
			}
			default -> {
				score='F';
			}
		}
		
		System.out.println("학점:"+score);
	}

}
