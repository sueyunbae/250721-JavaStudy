/* 
 * 	자바 => 기본문법
 * 			=> 변수/데이터형(기본형)
 * 			=> 가공(사용자 요청)
 * 			   -------------연산자/제어문
 * 	=> 관리
 * 		=> 데이터 시작
 * 			=> 배열 : 한개의 이름으로 관리(같은 데이터형)
 * 			=> 클래스 : 한개의 이름으로 관리(다른 데이터형)
 * 		=> 소스코딩을 분리 => 문장을 단락으로 나눠서 처리
 * 			| 메소드 : 객체지향의 핵심 => 재사용
 * 			  ---- 변수/연산자/제어문
 * 		=> 회원가입/로그인/게시판/페이징
 *    	   --------------------- 메소드처리 => 수정필요 => 오버라이딩
 *    							 한개로 묶어서 저장(저장된 공간 이름은 객체라고 함)
 *      변수 -> 배열,클래스 -> 메소드 -> 객체
 *      
 *      변수
 *      int a=10;      
 *      주소 -----
 *       10  ==> 다음 사용을 위해 기억
 *      --------- 주소의 별칭을 만들어 줌 : 변수(주소값 대신 변수를 쓰겠다)
 *      
 *      int[] arr=new int[5]; => 기본값으로 채워서 배열 생성
 *      						 ----
 *      						  int=0
 *      						  double=0.0
 *      						  char='\0'
 *      						  boolean=false
 *      						  String=null
 *       -----------------------------
 *        0      0     0     0     0
 *       -----------------------------
 *       arr[0]arr[1]arr[2]arr[3]arr[4] => 일반 변수와 동일하게 읽기/쓰기
 *		 변수명은 자동 부여
 *		 배열명[인덱스번호]
 *
 * 		1. 읽기
 * 			int[] arr={10,20,30,40,50}
 * 			-----------------------------------
 * 			  10     20     30     40     50
 * 			-----------------------------------
 *   		 arr[0] arr[1] arr[2] arr[3] arr[4] 
 *   		 for => 숫자의 규칙이 있을 때 실행 => 배열은 for문을 사용하기에 좋다
 *   		
 *   		일반for 이용해서 배열 출력 => 수정, 저장 가능 => 변경/초기값 줄 때 사용 (Back-End)
 *   		for(int i=0;i<arr.length;i++)
 *   		{
 *   			System.out.println(arr[i])
 *   		}
 *   		
 *   		for-each 이용해서 배열 출력 : 실제 저장된 값을 가지고 온다 => 수정 어려움 => 출력만할때 사용 (웹에서 많이 씀)
 *   		for(int i:arr)
 *   		{
 *   			System.out.println(arr[i])  => i=10,i=20...
 *   		}
 *   
 *   	 => 배열 : 모든 데이테형이 가능
 *   		1) 정수
 *   			int[] arr={1,2,3,4,5}
 *   			int[] arr=new int[5] => 임시저장 {0,0,0,0,0}
 * 			2) String[] arr={"홍길동","박문수",...};
 * 			   String[] arr=new String[5] => 임시저장 {null,null,null,null,null}
 * 													메모리 주소가 없는 경우
 * 													NullPointerException(null값을 참조하려할때 발생)
 * 			3) boolean[] arr={true,false,true,false...}
 * 			   boolean[] arr=new boolean[5] => {false,false,false,false...} => checkbox
 * 
 * */
public class 배열_1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {10,20,30,40,50};
//		
//		//출력(for-each사용)
//		//for(받는변수:배열명)
//		for(int i:arr)
//		{
//			System.out.println(i);
//		}
//	
//		//for사용
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		String[] names={"홍길동","심청이","춘향이","박문수","이순신"};
		
		//for-each 출력
		for(String s:names)
		{
			System.out.print(s+" ");
		}

		//for 출력
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
		
	}

}
