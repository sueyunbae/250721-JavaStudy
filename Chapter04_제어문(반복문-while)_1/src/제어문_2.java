// => 1~100 => 3,5,7 배수 중 가장 많은 배수, 가장 적은 배수
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;
		int i=1;
		while(i<=100)
		{
			if(i%3==0);
				a3+=i;
				
			if(i%5==0);
				a5+=i;
				
			if(i%7==0);
				a7+=i;
				
			i++;
		}
		System.out.println("1~100까지 3의 배수들의 합:"+a3);
		System.out.println("1~100까지 5의 배수들의 합:"+a5);
		System.out.println("1~100까지 7의 배수들의 합:"+a7);
		
		
		// 최대값/최소값 찾기
		
//		int max=a3;
//		int min=a3;
//		
//		if(max<a5)
//			max=a5;
//		if(max<a7)
//			max=a7;
//		
//		if(min>a5)
//			max=a5;
//		if(min>a7)
//			max=a7;
//		
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
		
	}

}
