/*
 * 영화 정보
 * 1938
	니드 포 스피드
	액션, 범죄, 드라마, 스릴러
	https://movie-phinf.pstatic.net/20140409_1/1397026396049vDmBo_JPEG/movie_image.jpg?type=m77_110_2
	아론 폴(토비 마샬), 도미닉 쿠퍼(디노 브루스터), 이모겐 푸츠(줄리아 보넷)
	2014 .04.16 개봉
	15세 관람가
	스캇 워프
 * 
 * */import java.io.*; //파일 입출력
import java.util.*; //검색 => 검색어
public class 배열응용_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String movie="";
		File file=new File("c:\\jdk-17.0.2\\javaDev\\movie.txt");
		int i=0; //파일 읽어서 저장하는 변수
		// 한글자씩 읽기 => 정수로 읽는다('A' => 65)
		FileReader fr=new FileReader(file);
		StringBuffer sb=new StringBuffer();
		while((i=fr.read())!=-1) //-1:EOF
		{
			sb.append((char)i);
		}
		fr.close();
		movie=sb.toString();
		//System.out.println(movie);
		
		String[] mnos=new String[1938];
		String[] titles=new String[1938];
		String[] genres=new String[1938];
		String[] posters=new String[1938];
		String[] actors=new String[1938];
		String[] regdates=new String[1938];
		String[] grades=new String[1938];
		String[] directors=new String[1938];
		
		/*
		 * 	class Movie
		 * 	{
		 * 		String mno.title.genre.poster.actor.regdate.grade.directors
		 *	 }
		 *
		 *	Movie m=new Movie()
		 *
		 * */
		i=0;
		String[] movies=movie.split("\n");
		for(String m:movies)
		{
			String[] info=m.split("\\|");
			//정규식 => | ==> |출력을 하려면 \\|
			mnos[i]=info[0];
			titles[i]=info[1];
			genres[i]=info[2];
			actors[i]=info[4];
			grades[i]=info[6];
			i++;			
		}
//		// 1. 영화명만 출력
//		for(String s:titles)
//		{
//			System.out.println(s);
//		}
//		// 2. 장르만 출력
//				for(String s:genres)
//				{
//					System.out.println(s);
//				}
		
		/*
		 * 출연진을 입력 받아서 출연한 영화 출력 ==> contains이용하기
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("출연진 이름을 입력하세요 >>");
		String name=scan.next();
		
		System.out.println("====="+name+"님의 출연작 =====");
		int count=0;
		for(int k=0;k<actors.length;k++) //인덱스 번호를 이용하기 때문에 for-each 사용X
		{
			if(actors[k].contains(name))
			{
				System.out.println(titles[k]);
				count++;
			}
			
		}
		
		//총 몇편 출연 했는지 출력
		System.out.println("총 출연 작품은 "+count+"편 입니다");
		
		//12세 관람 영화 출력
		for(i=0;i<grades.length;i++)
		{
			if(grades[i].contains("12"))
			{
				System.out.println(titles[i]);
			}
			
		}
		
	}

}
