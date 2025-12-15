
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum2=0;
		int sum3=0;
		
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
				sum2 += i; //sum2++; => 2의 배수의 갯수를 구할 수 있음(0주의하기 : 갯수셀떄는 i!=0 조건을 넣어줘야함)
			
			if(i%3==0)
				sum3+=i; //sum3++; => 3의 배수의 갯수를 구할 수 있음(0주의하기 : 갯수셀떄는 i!=0 조건을 넣어줘야함)
		}
		
		System.out.println("2의 배수의 합:"+sum2);
		System.out.println("3의 배수의 합:"+sum3);
	}

}
