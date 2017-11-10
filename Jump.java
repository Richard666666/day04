import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.border.LineBorder;
import javax.swing.Timer;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.lang.Thread;



/******************************************************/
public class  Jump extends JFrame
{
	BufferedImage buffer=new BufferedImage(800,600,1);
	
	Robot1 ro=new Robot1(30,100,265,180,275,165,265,265,365,165,105,105,Color.GREEN,0,0,0,0,0);

	void customize() 
	{
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Android robot  VS  Minions");
		setDefaultCloseOperation(EXIT_ON_CLOSE);//关窗口退出应用程序
		Timer timer=new Timer(300,(e)->{
			//ro.move1();
			ro.move2();
			//try{
			//Thread.sleep(2000);
			//}catch(Exception e1){
			//}

			

			repaint();
			
			});
						

			
	


		timer.start();



	}
 /*******************************************************/
public void paint(Graphics g)
	{
		Graphics g2=buffer.getGraphics();
		super.paint(g2);
		ro.draw(g2);
		
		
		g.drawImage(buffer,0,0,null);
	}

/*******************************************************/


	public static void main(String[] args)
	{
		Jump f=new Jump();
		
		f.customize();
		
		f.setVisible(true);

		
	}
}
