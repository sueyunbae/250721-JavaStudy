// 변수의 사용범위 => 지역변수 : 메모리 자체에서 생성/소멸
// {} 안에서만 사용이 가능
public class 제어문_3 {
	// 다른 클래스에서 사용이 가능한 영역
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 단점 => 다른 클래스에서 사용이 불가능
		{
			int a=10;
			{
				int b=20;
				{
					int c=30;
					// a,b,c 사용 가능
				}
				//a,b 사용가능
			}//a사용가능
			
		}//변수 다 사라짐
		
		// i는 루프 => i는 사용금지 권장(j랑 헷갈리기도 함) => m,n이나 a,b를 쓰는게 좋다

		
		
		
		
		for(int i=0;i<26;i++) //26바퀴 돈다
		{
			char c='A'; //생성,소멸을 26번 반복
			System.out.println(c++); //A 26번 출력됨
		}
		
		
		
		char c='A';
		for(int i=0;i<26;i++)
		{
			System.out.println(c++); //A~Z까지 출력됨
		}
	}

}

// 변수의 범위에 따라 결과값이 달라진다