
public class 제어문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_1=0;
		int count_2=0;

		int change=(int)(Math.random()*2); // 0,1
		char c=' ';
		
		// 변수 change와 c 는 main 안에서 계속 사용
		
		if (change==0)
		{
			c=(char)((Math.random()*26)+65); // 65~90
		}
		else
		{
			c=(char)((Math.random()*26)+97); // 97~122
		}
		
		if(c>='A' && c<='Z')
			count_1++;
		else
			count_2++;
		
		
		if (change==1)
		{
			c=(char)((Math.random()*26)+65); // 65~90
		}
		else
		{
			c=(char)((Math.random()*26)+97); // 97~122
		}
		
		if(c>='A' && c<='Z')
			count_1++;
		else
			count_2++;
		

		if (change==2)
		{
			c=(char)((Math.random()*26)+65); // 65~90
		}
		else
		{
			c=(char)((Math.random()*26)+97); // 97~122
		}
		if(c>='A' && c<='Z')
			count_1++;
		else
			count_2++;
		

		if (change==3)
		{
			c=(char)((Math.random()*26)+65); // 65~90
		}
		else
		{
			c=(char)((Math.random()*26)+97); // 97~122
		}
		if(c>='A' && c<='Z')
			count_1++;
		else
			count_2++;
		

		if (change==4)
		{
			c=(char)((Math.random()*26)+65); // 65~90
		}
		else
		{
			c=(char)((Math.random()*26)+97); // 97~122
		}
		if(c>='A' && c<='Z')
			count_1++;
		else
			count_2++;
		
		
		System.out.println("대문자 빈도:"+count_1);
		System.out.println("소문자 빈도:"+count_2);
		
	}

}
