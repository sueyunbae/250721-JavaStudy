/*
 * 		Math.random()
 * 		------------- 모든 메소드(기능)은 결과값을 넘겨준다
 * 			 |
 * 		0.0~0.99 => double 사용X => int 사용
 * 		(int)(Math.random())
 * 			  0.0~0.99
 *      ------------------------ int로 바꾸면 전부 0
 *      (int)(Math.random()*100)
 *      ------------------------ 0에서 99 사이의 정수
 *      (int)(Math.random()*10)+1 => 1~10
 *      Math.random()*26 => 0~25.!#$ 사이
 *      (char)(Math.random()*26) => 0~25 + 65 => 65~90
 *      (int)(Math.random()*45)+1 => 1~45 (+1을 해줘야 0부터가 아니라 1부터)
 * */

public class 제어문_4 {

	public static void main(String[] args)
	throws Exception
	{
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*5)+1; //1,2,3,4,5 중에 맞는 조건 하나만 찾으면 한번만 수행한다
		
		if(a==1)
			System.out.println("난수1 발생");
		else if(a==2)
			System.out.println("난수2 발생");
		else if(a==3)
			System.out.println("난수3 발생");
		else if(a==4)
			System.out.println("난수4 발생");
		else if(a==5)
			System.out.println("난수5 발생");
		
		/*
		int b=(int)(Math.random()*45)+1;
		int c=(int)(Math.random()*45)+1;
		int d=(int)(Math.random()*45)+1;
		int e=(int)(Math.random()*45)+1;
		int f=(int)(Math.random()*45)+1;
		
		//단점 : 중복된 수가 발생할 수 있다(나중에 for문을 배우면 그때는 중복수가 없을것)
		
		System.err.println("===== 로또 번호 ====="); //err은 빨간색으로 출력
		System.out.print(a+" ");
		Thread.sleep(500);//출력 후 잠깐 멈추는 효과
		System.out.print(b+" ");
		Thread.sleep(500);
		System.out.print(c+" ");
		Thread.sleep(500);
		System.out.print(d+" ");
		Thread.sleep(500);
		System.out.print(e+" ");
		Thread.sleep(500);
		System.out.print(f);
		//System.out.println(a+","+b+","+c+","+d+","+e+","+f);
		*/
	}

}
