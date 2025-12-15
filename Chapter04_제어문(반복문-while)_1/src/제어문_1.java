/*
 * 	1. while문의 형식, 사용처
 * 		=> 파일 읽기(출력) => 한글자씩 읽는다
 * 		=> 데이터베이스 => 갯수를 확인할 수 없는 곳에서 주로 사용 (for문은 알아야함)
 * 		=> for문 => Front-End(화면출력 등에 주로 사용)-javascript(변수,연산자,제어문,배열,예외처리,객체지향프로그램)
 * 		   while문 => Back-End(요청에 따른 갯수가 확인이 안될 경우 사용)
 *  2. for => 지정반복, while => true일 동안 반복, 종료시점을 꼭 설정해야 함(break)
 *  3. 형식 => 반복 횟수를 지정 => for문과 동일하게 사용이 가능
 *     초기값----------- 1
 *     while(조건식)---- 2 ==> false가 될 때 종료
 *     {
 *     		반복실행문장 - 3
 *     		증감식------ 4 ==> 증갑된 값으로 2번에 다시 조건 검색
 *     }
 *   4. 실행이 안될 수 있다 => 선 조건 검색
 *   -------------------------------
 *   	=> for문에서 사용한 예제
 *   	=> while은 고유 기능을 가짐(웹, 파일)		   	
 * 		
 * */

// 1~10출력 
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		i=1;
		while(true)//무한루프이므로 break꼭 필요
		{
			if(i>10) break;
			System.out.print(i+" ");
			i++;
		}

	}
	
}
