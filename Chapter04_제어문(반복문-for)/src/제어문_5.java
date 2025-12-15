//로또번호 6개를 출력해보세요(랜덤번호 6개 출력)

public class 제어문_5 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)//6바퀴 돌리기
		{
			int lotto=(int)(Math.random()*45)+1;
			Thread.sleep(1000);
			System.err.println(lotto+" ");//빨간색
		}

	}

}
