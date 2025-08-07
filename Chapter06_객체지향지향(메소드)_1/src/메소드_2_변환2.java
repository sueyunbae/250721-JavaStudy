import java.util.Scanner;
public class 메소드_2_변환2 {
	static int year,month,week;
	// 전역변수는 자동 초기화 => 0값
	static int[] lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
	
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg);
		int num=scan.nextInt();
		return num;
	}
	
	static void getWeek()
	{
		// 1. 전년도까지 총 일수(윤년 계산)
				int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
				//2. 전달까지의 합
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
				
				// 1일이 무슨 요일인지 구하기
				week=total%7;
	}
	
	// 달력 출력
		static void print()
		{ 
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
			year=input("년도 입력:");
			month=input("월 입력:");
			
			getWeek();
			print();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int year=2025;
//		System.out.println(year);//지역변수 우선순위(전역변수는 0값이지만 지역변수 2025값이므로 2025가 출력됨) => 지역변수가 없는 경우 전역변수를 찾는다
//		System.out.println(메소드_2_변환2.year);//클래스명.변수명 => 이렇게 하면 전역변수 0이 출력됨
//		// 메모리공간 => 전역변수 : MethodArea, 지역변수 : Stack
		process();
		
	}

}
