//선택정렬 => 맨 앞부터 고정 (!=버블정렬)

//33 31 73 36 4 정렬

//33 31 73 36 4  1round
//31 33 
//31    73 
//31       36 
//4          31   

//4 33 73 36 31
//  33 73
//  33    36  
//  31       33   2round          

//4 31 73 36 33   3round
//     36 73 
//     33    36

//4 31 33 73 36   4round
//        36 73

//4 31 33 36 73(정렬 완료)
     

import java.util.Arrays;

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[5];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*100)+1;
			
		}
		
		System.out.println("=====정렬전:");
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n=====정렬후:");
//		for(int i=0;i<com.length-1;i++)
//		{
//			for(int j=i;j<com.length;j++)
//			{
//				if(com[i]>com[j]) //내림차순 정렬 하려면 if(com[i]<com[j])
//				{
//				int temp=com[i];
//				com[i]=com[j];
//				com[j]=temp; //com[i]와 com[j] 값 바꾸기
//				}
//			}
//		}
		Arrays.sort(com); //이거 쓰면 더 쉬움(실무에서 씀)
		for(int i=com.length-1;i>=0;i--) //내림차순은 이렇게 하면 됨 
		{
			System.out.print(com[i]+" ");
		}
	}

}
