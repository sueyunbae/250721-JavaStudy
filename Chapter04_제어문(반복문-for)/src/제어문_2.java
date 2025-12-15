/*
 *       어디서부터 어디까지 반복횟수
 * 		for(초기값;조건식;증감식)
 * 		{
 * 			반복수행문장
 * 		}
 * 		=> 반복 횟수가 있다
 * 		=> Front-End : for => Back-End : while
 * 		--------------------------------------- |이차 for문(ex:구구단) 
 * 
 */

// 1~100 => 합을 구해라 / 짝수의 합 / 홀수의 합

public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,even=0,odd=0; // 합=> 초기값은 0부터 시작, 곱 => 초기값은 1부터
		for(int i=1;i<=100;i++) // i변수는 for문에서만 사용 => for()이 끝나면 i는 메모리에서 사라진다(지역변수)
		{
			sum+=i; //누적합	
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~100까지의 5총합:"+sum);
		System.out.println("1~100까지의 짝수합:"+even);
		System.out.println("1~100까지의 홀수합:"+odd);
		System.out.println("==========================");
		
		int t3=0,t5=0,t7=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				t3+=i;
			if(i%5==0)
				t5+=i;
			if(i%7==0)
				t7+=i;
		} // i=101 ,i는 메모리에서 사라진다
		System.out.println("1~100까지의 3의 배수 총합:"+t3);
		System.out.println("1~100까지의 5의 배수 총합:"+t5);
		System.out.println("1~100까지의 7의 배수 총합:"+t7);
	}

}
