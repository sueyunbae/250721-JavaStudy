/*
 * 1
 * |쇼생크 탈출
 * |드라마
 * |https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
 * |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
 * |2016 .02.24 재개봉, 1995 .01.28 개봉
 * |15세 관람가
 * |프랭크 다라본트
 * */
//영화 한개의 정보를 모아서 관리 ==> new 메모리 공간을 설정(new를 이용하여 영화 여러개의 정보들을 저장할 수 있다)
import java.util.*;
import java.io.*;
class Movie{
	int mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String diretor;
	
}
public class 클래스__2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Movie[] movies=new Movie[1938]; // int[] arr=new int[10]
		// 데이터형으로 인식
		File file=new File("c:\\jdk-17.0.2\\javaDev\\movie.txt");
		StringBuffer sb=new StringBuffer();
		int i=0; //한글자 받는 변수
		FileReader fr=new FileReader(file);
		while((i=fr.read())!=-1)//-1이 다 읽었다는 뜻 EOF(End of File)
		{
			//System.out.print((char)i);//정수로 읽었기 때문에 문자로 변환해줘야 함
			sb.append((char)i);
		}
		
		fr.close();
		
		String movie=sb.toString();
		
		//분리
		String[] mo=movie.split("\n");
		i=0;//초기화 꼭 해줘야 함
		for(String m:mo)
		{
			String[] mm=m.split("\\|");
			movies[i]=new Movie();
			movies[i].title=mm[1];
			i++;
		}
		for(i=0;i<movies.length;i++)
		{
			System.out.println((i+1)+"."+movies[i].title);
		}
			
	}

}
