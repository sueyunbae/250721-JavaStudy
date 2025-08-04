// 0~9사이에서 100개의 난수 발생 => 빈도수 구하기 
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bin=new int[10];
		for(int i=0;i<100;i++)
		{
			int rand=(int)(Math.random()*10); //0~9까지의 난수 발생
			bin[rand]++;//예를 들어, rand가 3이면 bin[3]++ → bin[3] 값이 1 증가

		}
		System.out.println("=====결과값=====");
		for(int i=0;i<10;i++)
		{
			System.out.println(i+":"+bin[i]+"번 발생");//
		}

	}

}
