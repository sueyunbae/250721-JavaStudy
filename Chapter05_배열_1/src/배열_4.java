//임의의 대소문자 저장 => 대문자, 소문자의 갯수 구하기 
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[15];
		int count1=0, count2=0; //누적 갯수를 세는 변수는 for문 밖에서 설정
		for(int i=0;i<alpha.length;i++)
		{
			int a=(int)(Math.random()*2);//0,1랜덤 발생
			if(a==0)
				alpha[i]=(char)((Math.random()*26)+65);//0이 나오면 대문자
			else
				alpha[i]=(char)((Math.random()*26)+97);//1이 나오면 소문자
			
			System.out.print(alpha[i]+" ");
			
			if(alpha[i]>='A'&& alpha[i]<='Z')
				count1++;
			else
				count2++;
			
	
		}
		System.out.println();
		System.out.println("대문자:"+count1);
		System.out.println("소문자:"+count2);

	}

}
