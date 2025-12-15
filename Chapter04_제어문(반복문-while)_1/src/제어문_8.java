/*
 * int i=1;
 * while(i<=5)
 * {
 * 		실행문장
 * 		i++;
 * }
 * i=1 => i<=5 => 실행문장 => i++
 * 		  true
 * i=2 => i<=5 => 실행문장 => i++
 * 		  true
 * i=3 => i<=5 => 실행문장 => i++
 * 		  true
 * i=4 => i<=5 => 실행문장 => i++
 * 		  true
 * i=5 => i<=5 => 실행문장 => i++
 * 		  true
 * i=6 => i<=5
 * 		  false => while 종료  
 * 
 * int i=1;
 * 
 * do
 * {
 * 		실행문장 (예:게임 title)
 * 		i++;
 * }while(i<=5);
 * i=1 실행문장 => i++ => i=2 i<=5
 * i=2 실행문장 => i++ => i=3 i<=5
 * i=3 실행문장 => i++ => i=4 i<=5
 * i=4 실행문장 => i++ => i=5 i<=5
 * i=5 실행문장 => i++ => i=6 i<=5 => 종료
 * 
 * */
public class 제어문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 숫자들의 합
		int sum=0;//누적변수
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		}
		System.out.println("for=>sum="+sum);
		
		int i=1;//변수i 생성(for문 안의 i는 지역변수) => 지역변수는 범위(scope) 주의하기
		sum=0;//기존 생성한 변수 초기화
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("while=>sum="+sum);
		
		i=1;//기존 생성한 변수초기화
		sum=0;//기존 생성한 변수초기화
		//do 
		

	}

}
