// 제어문 정리 / String 정리
// 배열 메소드 => 다음주  클래스=>다다음주

/*
 * 	제어문
 * 	  = 조건문 / 선택문
 * 		조건문 = 단일 조건문 : 상세보기, 아이디중복체크, 유효성검사 
 * 						   ** 독립적 => 속도가 느려진다
 * 				if(영화변호==1)
 * 				{
 * 					영화정보출력 ==> true일 때만 처리
 * 				} ==> false면 종료 
 * 				목록 => 반드시 번호
 * 				게시판
 * 				----
 * 				목록/글쓰기 for문
 *              상세보기 if문(처리)
 *              수정/삭제
 *              
 * 			  = 선택 조건문 : 로그인, 검색, 장바구니 확인
 * 				있다/없다
 * 				if(조건문)
 * 				{
 * 					조건이 true일 때 처리(예:로그인 성공, 장바구니에 상품 존재)
 * 				}
 * 				else
 * 				{
 * 					조건이 false일 때 처리(예:로그인 실패, 장바구니에 상품 없음)
 * 				}
 * 			  = 다중 조건문 : 여러가지 경우의 수
 * 							=> 한번만 수행
 * 							=> 메뉴, 버튼
 * 			
 *    = 반복문
 *    = 반복제어문
 * 
 * */

import java.util.Scanner;
public class 정리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {
        		"사과:apple",
        		"배:pear",
        		"밤:chestnut",
        		"잣:pine nut",
        		"호두:walnut",
        		"도토리:acorn",
        		"귤:tangerine",
        		"딸기:strawberry",
        		"파인애플:pineapple",
        		"포도:grape",
        		"복숭아:peach",
        		"살구:apricot",
        		"매실:Japanese apricot",
        		"자두:plum",
        		"키위:kiwi",
        		"토마토:tomato",
        		"블루베리:blueberry",
        		"앵두:cherry",
        		"바나나:banana",
        		"오렌지:orange",
        		"수박:watermelon",
        		"멜론:melon",
        		"참외:oriental melon",
        		"망고:mango",
        		"레몬:lemon",
        		"석류:pomegranate",
        		"자몽:grapefruit",
        		"대추:jujub",
        		"감:persimmon",
        		"곶감:dried persimmon",
        		"리치:litchi",
        		"모과:quince",
        		"오디:mulberry",
        		"유자:citron",
        		"무화과:fig",
        		"호박:pumpkin",
        		"오이:cucumber",
        		"양파:onion",
        		"마늘:garlic",
        		"생강:ginger",
        		"무:radish",
        		"쑥:mugwort",
        		"당근:carrot",
        		"인삼:ginseng",
        		"산삼:wild ginseng",
        		"더덕:deodeok",
        		"죽순:bamboo shoot",
        		"파프리카:paprika",
        		"피망:pimiento",
        		"부추:chives",
        		"파:green onion",
        		"감자:potato",
        		"고구마:sweet-potato",
        		"가지:eggplant",
        		"옥수수:corn",
        		"후추:pepper",
        		"고추:chili, hot pepper",
        		"배추:Chinese cabbage",
        		"양배추:cabbage",
        		"상추:lettuce",
        		"양상추:lettuce",
        		"시금치:spinach",
        		"콩:bean",
        		"땅콩:peanut",
        		"깨:sesame",
        		"깻잎:sesame leaf",
        		"콩나물:bean sprouts",
        		"버섯:mushroom",
        		"미역:seaweed"
        };
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
		
		// 배열/Collection => 데이터모음 JDK1.5
		// 실무 => 목록 출력시에 자주 사용
		boolean bCheck=true;
		for(String f:arr)//향상된 for문(arr의 데이터를 하나씩 가져와라) => for-each
		{
			if(f.contains(fd)) // startsWith 써도 됨
				
				/*
				 * [가-힣] : 한글 전체
				 * [0~9] : 숫자전체
				 * [A-Za-z] : 알파벳 전체
				 * 
				 * [^가-힣] : !한글 전체
				 * [^0~9] : !숫자전체
				 * [^A-Za-z] : !알파벳 전체
				 * 
				 * ^[가-힣] : 한글로 시작
				 * ^[0~9] : 숫자로 시작
				 * ^[A-Za-z] : 알파벳 시작
				 * 
				 * ^[가-힣]{3} : 세글자 한글로 시작(가나다aaaa => 가나다, 가나aaaa => X)
				 * ^[0~9]{1,3} : 숫자가 1개,2개,3개인 것을 찾는다(1A 12A 123A..)
				 * 
				 * 
				 * */
			{
				//System.out.println(f.replaceAll("[^A-Za-z]","")); 
				                   //영어만 가져오게 자름(알파벳 제외 모두 공백으로 처리)
				
				String s=f.substring(f.indexOf(":")+1);//영어만 가져오게 자름(콜론 하나 뒤부터 가져옴)
				System.out.println(s);
				bCheck=true;
			}
			
			else
				
			{
				bCheck=false; //for문 밖에 boolean bCheck=true; 입력
			}
		}
		if(bCheck==false)
			System.out.println("검색 결과가 없습니다");

	}

}
