/*
 *  국어 영어 수학 점수 입력
 *  ----------- 
 *  평균 출력, 총점 출력, 학점 출력
 *
 *	100~90 A
 *  80~89 B
 *  70~79 C
 *  60~69 D 
 *  이하 F
 *  
 * */

import java.util.Scanner;
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력(90 90 90): ");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();		
		
		int total=kor+eng+math;
		System.out.println("총점:"+total);
		
		double avg=total/3.0;
		System.out.println("평균:"+avg);
		
		int temp=(total/3)/10; // 10으로 나누면 더 편함
		if (temp==10||temp==9)
			System.out.println("학점:"+'A');
		if (temp==8)
			System.out.println("학점:"+'B');
		if (temp==7)
			System.out.println("학점:"+'C');
		if (temp==6)
			System.out.println("학점:"+'D');
		if (temp<6)
			System.out.println("학점:"+'F');
		
	}

}
