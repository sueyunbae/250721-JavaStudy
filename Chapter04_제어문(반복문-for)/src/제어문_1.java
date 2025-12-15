//알파벳 모두 출력하기 => ABCD...Z 
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c);
		}
		
		//1~10 숫자 모두 출력
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);			
		}
		
		//1~10 숫자 중 홀수 모두 출력
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i);			
		}
		
		//1~10 숫자 중 짝수 모두 출력
		for(int i=2;i<=10;i+=2)
		{
			System.out.print(i);			
		}
		
		
		/*
		 * 		  1       2     |false면 종료
		 *	for(시작값 ; 어디까지(조건문) ; 증가식)
		 *	{				|true면      4
		 *		반복 수행문 3 -------------|
		 *	}
		 *  
		 *  예)
		 *  for(i=1;i<=5;i++)
		 *  {
		 *  	System.out.print(i)
		 *  }
		 *  i=1 => i<=5 i++
		 *  	System.out.print(i)
		 *  
		 *  i=1 => i<=5 System.out.print(1) => i++
		 *  i=2 => i<=5 System.out.print(2) => i++
		 *  i=3 => i<=5 System.out.print(3) => i++
		 *  i=4 => i<=5 System.out.print(4) => i++
		 *  i=5 => i<=5 System.out.print(5) => i++
		 *  i=5 => i<=5 false => for문 종료
		 * */
		
		/* for(;;) while(true) => 무한루프(게임, 서버에서 많이 사용)*/ 
		
		/*
		 * 반복문
		 * 	for : 반복 횟수가 지정된 경우
		 * 	while : 반복 횟수가 없는 경우 
		 *          -------
		 *  ----------------------------------- 한번도 수행이 안되는 경우
		 *  ==> 선조건
		 *  while(조건)
		 *  {
		 *     실행문
		 *  }
		 *  
		 *  ==> 후조건 : do ~ while => 처음은 무조건 한번 실행!
		 *  do
		 *  {
		 *     반복문장
		 *  }while(조건)
		 *  
		 * */
	}

}
