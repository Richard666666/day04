import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.image.BufferedImage;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

/******************************************************/
public class  Fighting extends JFrame
{


	BufferedImage buffer=new BufferedImage(800,600,1);
	



	Ball ballone=new Ball(190,90,5,5,Color.RED,10);
	Ball balltwo=new Ball(390,390,5,5,Color.GREEN,14);
	Ball ballthree=new Ball(690,390,5,5,Color.BLUE,9);
	Ball ballfour=new Ball(40,95,5,5,Color.PINK,7);
	Ball ballfive=new Ball(630,250,5,5,Color.YELLOW,6);
	Ball ballsix=new Ball(159,250,5,5,Color.PINK,9);
	Ball ballseven=new Ball(130,50,5,5,Color.BLACK,5);
	Ball balleight=new Ball(170,350,5,5,Color.ORANGE,8);
	Ball ballnine=new Ball(70,550,5,5,Color.BLUE,9);

	//Ball[] balls=new Ball[9];//����
	Ball[] balls={ballone,balltwo,ballthree,ballfour,ballfive,ballsix,ballseven,balleight,ballnine};



	void customize()//���ƴ���
	{
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("�����С��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);//�ش����˳�Ӧ�ó���

		addWindowListener(new WindowAdapter(){

			
			public void windowActivate(WindowEvent e)
			{
				repaint();
			}
		
		
		
		});

		Timer timer=new Timer(3,(e)->{
		for(int i=0;i<balls.length;++i)
		{
			if(balls[i].alive)
			{
				balls[i].move();
			}

		}





		/*	if(ballone.alive)
			{
				ballone.move();
			}
			if(balltwo.alive)
			{
				balltwo.move();
			}
			if(ballthree.alive)
			{
				ballthree.move();
			}

			ballone.eat(balltwo);
			ballone.eat(ballthree);

			balltwo.eat(balltwo);
			balltwo.eat(ballthree);

			ballthree.eat(ballone);
			ballthree.eat(balltwo);
		*/
			for(int i=0;i<balls.length;i++)
			{
				for(int j=0;j<balls.length;j++)
				{
					balls[i].eat(balls[j]);
				}
			
			
			}
			
			
			repaint();});
			timer.start();
	


	}
 /*******************************************************/
public void paint(Graphics g)//��ͼ�ķ���,�ڴ��ڵĻ��ʣ��ڴ����ϻ�ͼ
	{
		Graphics g2=buffer.getGraphics();//�����ڴ�Ļ��ʣ�(���������⣡)�������customize�����setSize�Ƚ�
		super.paint(g2);
		for(int i=0;i<balls.length;++i)
		{
			if(balls[i].alive)
			{
				balls[i].draw(g2);
			}

		}



/*		if(ballone.alive)
		{
		ballone.draw(g2);
		}
		if(balltwo.alive)
		{
		balltwo.draw(g2);
		}
		if(ballthree.alive)
		{
		ballthree.draw(g2);
		}
		*/
		g.drawImage(buffer,0,0,null);//���ڴ滭��ͼ���ڴ�����

		
	}




	public static void main(String[] args) 
	{
		Fighting f=new Fighting();
		f.customize();
		f.setVisible(true);

		
	}
}
