import java.lang.annotation.ElementType;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
public class 정리_7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	while(true)
	{
		System.out.println("===== Menu =====");
		System.out.println("1. Top50");
		System.out.println("2. 가요");
		System.out.println("3. POP");
		System.out.println("4. OST");
		System.out.println("5. 트롯");
		System.out.println("6. JAZZ");
		System.out.println("7. CLASSIC");
		System.out.println("8. Exist");
		System.out.println("===================");
		System.out.println("메뉴 선택:");
		int menu=scan.nextInt();
		if(menu==8)
			break;
		String url="";
		if(menu==1)
			url="https://www.genie.co.kr/chart/top200";
		else if(menu==2)
			url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0100";
		else if(menu==3)
			url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0200";
		else if(menu==4)
			url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0300";
		else if(menu==5)
			url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0107";
		else if(menu==6)
			url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0500";
		else if(menu==7)
			url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20250731&genrecode=M0600";
		
		System.out.print("검색어 입력:");
		String fd=scan.next();
		
		// 웹에서 데이터 읽기 => Jsoup
		Document doc=Jsoup.connect(url).get();
		// HTML을 읽어온다(변환을 시켜서) => HTML Parser
		// => Spring, MyBatis, => 라이브러리 XML
		// => 설정 파일
		// 태그 읽기 => ML(마크업랭귀지) : 태그+속성 <>값</>
		// HTML + 언어 => jsp, asp, php ... 
		// <% %><tr>
		// HTML은 지정, XML은 사용자 정의
		Elements title=doc.select("table.list-wrap a.title");
		Elements singer=doc.select("table.list-wrap a.artist");
		
		for(int i=0;i<title.size();i++)
		{
			String temp=title.get(i).text();
			if(temp.toUpperCase().contains(fd.toUpperCase()))//uppercase를 쓰면 다 대문자로 입력됨				
			System.out.println((i+1)+"."+temp);
			//Thread.sleep(1000);			
		}
	}						
	}

}
