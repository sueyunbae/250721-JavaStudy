package com.sist.lang;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 라이브러리_4 extends JFrame implements ItemListener{
	JComboBox box=new JComboBox();
	// Object는 모든 데이터형을 받을 수 있다
	public 라이브러리_4()
	{
		box.addItem("맛집");
		box.addItem("레시피");
		box.addItem("여행");
		
		add("North",box);
		setSize(350,300);
		setVisible(true);
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_4();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==box)
		{
			String s=box.getSelectedItem().toString();
			System.out.println(s);
		}
			
	}

}
