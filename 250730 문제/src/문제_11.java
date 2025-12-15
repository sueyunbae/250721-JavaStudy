public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		int count3=0;
		int count5=0;
		for(int i=1;i<=10;i++)
		{
			int val=(int)(Math.random()*100)+1;
			System.out.print(val+" ");
			if(val%2==0)
				count1++;
			if(val%3==0)
				count3++;
			if(val%5==0)
				count5++;
		}
		System.out.println();
		System.out.println("짝수의 갯수:"+count1);
		System.out.println("3의 배수의 갯수:"+count3);
		System.out.println("5의 배수의 갯수:"+count5);
	}

}
