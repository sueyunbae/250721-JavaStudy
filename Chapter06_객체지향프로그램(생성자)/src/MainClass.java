// 사원 => Emp 
//        empno,ename,job,mgr,hiredate,sal,comm,deptno
//14명
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@211.238.142.124:1521:XE";
		Connection conn=DriverManager.getConnection(url,"hr","happy");
		String sql="SELECT empno,ename,job,sal,deptno FROM emp";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		int empno=0,sal=0,deptno=0;
		String ename="",job="";
		while(rs.next())
			
		{
			empno=rs.getUnt(1);
			ename=rs.getUnt(2);
			job=rs.getUnt(3);
			sal=rs.getUnt(4);
			deptno=rs.getUnt(5);
		}
		System.out.println("사번:");
		System.out.println("이름:"+ename);
		System.out.println("직위:"+job);
		System.out.println("급여:"+sal);
		System.out.println("부서번호:"+deptno);
	}

}
