// 10개의 임의의 정수 저장 ==> 총합/평균 구하기 
// 전체 데이터 for => 요청값 추출 => if => 제어문
// 데이터저장 => 제어(제어문)
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열선언
		// 2. 배열 초기화
		// 3. 배열의 총합,평균
		int[] arr=new int[10];
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
		}
		
		int sum=0;
		for(int i:arr) //for-each : 실제 배열에 저장된 값을 순차적으로 읽는다
		{
			sum+=i; //arr배열의 각 값들을 누적해서 더한다
		}
		
		System.out.println("\n총합:"+sum);
		System.out.printf("평균:%.2f\n",sum/10.0);

	}

}
