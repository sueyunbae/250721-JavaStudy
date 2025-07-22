import java.util.Scanner; //라이브러리 읽기(import를 쓰면 됨)

public class 변수데이터형연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값을 받아서 저장 후 처리 => 이 때 저장공간이 변수
		Scanner scan=new Scanner(System.in);
		//new => 메모리에 저장 / System.in 키보드 입력값
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		
		int total=kor+math+eng;
		System.out.println("총점:"+total);
		
		double avg=total/3.0;//실수로 나눠야 함!(정수로 나누면 정수값만 계산됨)
		System.out.printf("평균:%.2f\n",avg);//.2f가 소수점 두번째 자리까지 출력한다는 뜻

	}

}
