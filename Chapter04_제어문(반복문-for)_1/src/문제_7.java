
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=2;i<=30;i+=2)
		{
			a++;
			if(a==3)
				{
				System.out.println(i);
				a=0;
				}
						
			else
				System.out.print(i+" ");
			
		}
	}

}
