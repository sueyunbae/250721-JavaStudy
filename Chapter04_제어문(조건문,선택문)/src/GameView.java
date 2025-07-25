import javax.swing.*;//경량컴포넌트
import java.awt.*; //Image 
public class GameView extends JPanel{
	Image back,air;
	int x=150;
	int y=100;
	public GameView() 
	{
		//생성자 => 변수에 대한 초기화
		back=Toolkit.getDefaultToolkit().getImage("c:\\jdk-17.0.2\\javaDev\\background.jpg");
		air=Toolkit.getDefaultToolkit().getImage("c:\\jdk-17.0.2\\javaDev\\air.png");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(air,650,100,150,100,this);
	}
}