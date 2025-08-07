import java.util.Scanner; 
public class 메소드_2_변환 {
	// 1. 반복구간
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg);
		int num=scan.nextInt();
		return num;
	}
	// 요일 구하기 => 재사용할 수 있는 기능
	static int getWeek(int year,int month)
	{
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
			return week;
	}
	
	// 달력 출력
	static void print(int year,int month,int week)
	{
		// 달력 출력하기 
				int[] lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
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
	static void process()
	{
		int year=input("년도 입력:");
		int month=input("월 입력:");
		
		int week=getWeek(year,month);
		print(year,month,week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
