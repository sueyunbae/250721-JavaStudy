/*
 *  배열 특징
 *  1) 같은 데이터형만 모아서 관리
 *     --------- 관련된 데이터만(같은 종류)
 *     뮤직: 노래명 / 가수 / 앨범 / 등폭 / 동영상 키
 *     	    String Str   Str    int    Str
 *     		--------------------------------- 
 *     		사과 배 수박 귤 => 종합 과일 세트
 *  2) 한번 생성하면 배열의 크기를 줄이거나 늘릴 수 없다
 *     --------------------------------------
 *     	고정적 => 삭제, 추가 불가능
 *      가변적 => 컬렉션(클래스화) 
 *  3) 반드시 초기화
 *  	= 배열 선언
 *  	  어떤 데이터(정수,실수,문자열,논리형)를 모아서 관리할지
 *  	  예) int[] 배열명;
 *  	      int 배열명[];  	  
 *  	= 초기값  
 *  		= 선언과 동시에 초기화
 *  			int[] arr={1,2,3,4,5}
 *			= 임시로 기본값 저장
 *				int[] arr=new int[5];
 *			= 배열마다 데이터를 추가
 *				int[] arr;
 *				arr=new int[4];
 *				---------
 *				arr[0]=1
 *				arr[0]=2
 *				arr[0]=3
 *				arr[0]=4
 *				---------일반 for문 쓰기에 좋음
 *	4) 출력방법
 *		for(int i=0;i<5;i++)
 *		{
 *			arr[i] => 배열의 인덱스를 이용한 출력
 *		}
 *	
 *		for(받는 변수:배열명)
 *		{
 *			배열에 저장된 실제 데이터 읽기
 *		}
 *
 *		System.out.println(Arrays.toString(배열명))
 *
 * */
//배열 출력 3가지 방법 
import java.util.Arrays;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int[] arr= {1,2,3,4,5};
		System.out.println("===== 일반 for문 =====");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("===== for-each =====");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===== toString =====");
		System.out.print(Arrays.toString(arr));
	}
	// 같은 종류의 데이터가 3이상이면 => 배열
	// 다른 종류의 데이터가 여러개 있다 => 클래스 : 상세보기
}
