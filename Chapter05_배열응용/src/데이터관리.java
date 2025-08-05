import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;

import javax.swing.table.*;
public class 데이터관리 extends JFrame implements ActionListener{
	JTextField tf;
	JButton btn;
	JTable table; //모양
	DefaultTableModel model; //데이터 입출력
	JComboBox box=new JComboBox();
	//데이터 읽기
	String[] mnos=new String[1938];
	String[] titles=new String[1938];
	String[] posters=new String[1938];
	String[] actors=new String[1938];
	String[] genres=new String[1938];
	String[] grades=new String[1938];
	TableColumn column;
	
	public 데이터관리()
	{
		//값을 채운다
		try//배열응용_1예제에서 복붙해옴
		{
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
			
			i=0;
			String[] movies=movie.split("\n");
			for(String m:movies)
			{
				String[] info=m.split("\\|");
				//정규식 => | ==> |출력을 하려면 \\|
				mnos[i]=info[0];
				titles[i]=info[1];
				genres[i]=info[2];
				posters[i]=info[3];
				actors[i]=info[4];
				grades[i]=info[6];
				i++;			
			}
		}catch(Exception ex){}
		
		box.addItem("제목");
		box.addItem("출연");
		box.addItem("장르");
		box.setBounds(10, 15, 130, 35);
		add(box);		
		tf=new JTextField();
		btn=new JButton("검색");
		setLayout(null);
		tf.setBounds(145, 15, 250, 45);
		btn.setBounds(400, 15, 100, 45);
		//윈도우에 추가
		add(tf);add(btn);
		
		//테이블 만들기
		String[] col={"번호","영화명","출연진","장르","등급"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col)
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 60, 760, 500);
		add(js);
		
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			if(i==0)
				column.setPreferredWidth(10);
			else if(i==1)
				column.setPreferredWidth(130);
			else if(i==2)
				column.setPreferredWidth(200);
			else if(i==3)
				column.setPreferredWidth(100);
			else if(i==4)
				column.setPreferredWidth(40);
			
		}
		
		
		for(int i=0;i<titles.length;i++)
		{
			String[] datas= {					
				mnos[i],
				titles[i],
				actors[i],
				genres[i],
				grades[i]
			};
			model.addRow(datas);
		}
		setSize(800,600);
		setVisible(true);
		btn.addActionListener(this);
		tf.addActionListener(this);
		
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		try 
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex) {}
		new 데이터관리();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn||e.getSource()==tf)//검색 클릭 or 엔터 쳤을 때 검색 출력
		{
			String cate=(String)box.getSelectedItem();
			//System.out.println(cate);
			//입력값 읽기
			String fd=tf.getText();
			if(fd.length()<1)//검색 입력이 없을때
			{
				JOptionPane.showMessageDialog(this,"검색어 입력");
				tf.requestFocus();//확인 버튼에 포커스
				return;//확인을 누르면 종료
			}
			
			//검색어를 입력했을 떄
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);//일단 화면모든 내용을 다 지움
			}
			
			if(cate.equals("제목"))
			{
				for(int i=0;i<titles.length;i++)
				{
					if(titles[i].contains(fd))
					{					
						String[] datas= {					
							mnos[i],
							titles[i],
							actors[i],
							genres[i],
							grades[i]
						};
						model.addRow(datas);
					}
				}
			}
			else if(cate.equals("출연"))
			{
				for(int i=0;i<actors.length;i++)
				{
					if(actors[i].contains(fd))
					{					
						String[] datas= {					
							mnos[i],
							titles[i],
							actors[i],
							genres[i],
							grades[i]
						};
						model.addRow(datas);
					}
				}
				
			}
			else if(cate.equals("장르"))
			{
				for(int i=0;i<genres.length;i++)
				{
					if(genres[i].contains(fd))
					{					
						String[] datas= {					
							mnos[i],
							titles[i],
							actors[i],
							genres[i],
							grades[i]
						};
						model.addRow(datas);
					}
				}
			}
		}
	}

}
