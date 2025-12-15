/*
 * do while : 자바에서는 사용 빈도가 없다
 *  - while문의 단점 보완 => while문은 실행하지 않는 경우가 있다(먼저 조건 처리)
 *    do while문은 반드시 한번 이상 수행한다(나중에 조건처리)
 *    
 *    while문 형식)
 *    		초기값1
 *    		while(조건식)2
 *    		{
 *    			반복 실행문장3
 *    			증감식4
 *    		}
 *    	예) int a=10;
 *    		while(a<5)
 *    		{
 *    			실행X
 *    		}
 *    do while문 형식)	 
 *    	초기값1
 *    	do
 *    	{
 *    		반복 실행문장2
 *    		증감식3
 *    	}while(조건식);4
 * 
 * */

// for/while/do~while 비교 
public class 제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======= for =======");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n====== while ======");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println("\n===== do~while =====");
		i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);

	}

}
