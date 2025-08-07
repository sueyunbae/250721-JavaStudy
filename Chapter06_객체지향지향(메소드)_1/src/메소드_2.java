// 달력 => 메소드 => 전역변수사용
//  | 1일자 요일을 찾는것이 관건
import java.util.Scanner;
/*
 * 		1. 입력 받기
 * 		2. 1년 1월 1일 ~ 입력달의 1일 => 총 일수 ====> 세분화
 * 		3. 총 일수%7 => 요일
 * 		4. 요일 => 해당 마지막날까지 출력
 * 
 * 		=> 메소드 : 기능 분리 / 나중에 재사용
 * 			: 윤년 여부
 * 
 * 	====================================
 * 	1. 반복구간 => 메소드화하기 : 공통 모듈
 * 	2. 기능별 분리
 * 	3. 순차적으로 메소드 호출
 * 	====================================
 * 
 * */
public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 년 월 	
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		// 1. 전년도까지 총 일수(윤년 계산)
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		//2. 전달까지의 합
		int[] lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
		                //--
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		//여기까지 전달까지의 총일수 구함
		//이제 그 다음날인 각 달의 1일자 확인
		total++;
		
		// 요일 구하기
		int week=total%7;
		
		// 달력 출력하기 
		System.out.printf("%d년도 %d월\n\n",year,month);
		String[] strWeek={
				"일","월","화","수","목","금","토"
		};
		
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		
		System.out.println(); //줄바꿈
		for(int i=1;i<=lastDay[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) //일주일씩 한줄에 출력하기
			{
				week=0;
				System.out.println();
			}
		}
	}

}
