// lotto번호 6개 중복 없이 출력하기 
public class 배열_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		int su=0;// 난수
		boolean bCheck=false;
		
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck)
				{
					su=(int)(Math.random()*45)+1;
					bCheck=false;
					for(int j=0;j<i;j++)
					{
						if(su==lotto[j])//중복이면 while문 처음으로 이동 => 난수 다시 발생시킴
						{
							bCheck=true;
							break;
						}
					}
				}
			lotto[i]=su;//난수를 su에 저장
		}
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
		
	}

}
