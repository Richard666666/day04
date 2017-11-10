import java.awt.Graphics;
import java.awt.Color;

public class Robot1 
{
	//机器人的属性
	int x;//矩形的长
	int y;//矩形的宽

	int m1;//旋转点的x
	int n1;//旋转点的y

	int m2;
	int n2;

	int m3;
	int n3;

	int m4;
	int n4;

	int m5;
	int n5;

	Color color;

	int temp1;
	int temp2;
	int temp3;
	int temp4;
	int temp5;
	
	Robot1(int x,int y,int m1,int n1,int m2,int n2,int m3,int n3,int m4,int n4,int m5,int n5,Color color,int temp1,int temp2,int temp3,int temp4,int temp5)
	{
		this.x=x;
		this.y=y;
		this.m1=m1;
		this.n1=n1;
		this.m2=m2;
		this.n2=n2;
		this.m3=m3;
		this.n3=n3;
		this.m4=m4;
		this.n4=n4;
		this.m5=m5;
		this.n5=n5;
		this.color=color;
		this.temp1=temp1;
		this.temp2=temp2;
		this.temp3=temp3;
		this.temp4=temp4;
		this.temp5=temp5;
		
	}
	//机器人的行为
	/*void waveUp(Graphics g)
	{
		
		g.setColor(Color.GREEN);
		g.fillRect(275,165,100,30);//水平右手
		g.fillOval(365,165,30,30);//水平右手下
		

	}
	void waveDown(Graphics g)
	{
		
		g.setColor(Color.GREEN);
		g.fillRect(265,180,30,100);//垂直右手
		g.fillOval(265,265,30,30);//垂直右手下
		

	}*/
/************************************************************/
	void move2()
	{
		int temp1=x;
			x=y;
			y=temp1;

		int temp2=m1;
			m1=m2;
			m2=temp2;

		int temp3=n1;
			n1=n2;
			n2=temp3;

		int	temp4=m3;
			m3=m4;
			m4=temp4;

		int temp5=n3;
			n3=n4;
			n4=temp5;


		
		m5=m5+sx;
		n5=n5+sy;
	if(m5<110||n5>100)
		{
			sx=1;
			sy=-1;
		}
	if(m5>=110||n5<=100)
		{
			sx=-1;
			sy=1;
		}


	}

	
	public void draw(Graphics g)//机器人的行为，自己了解自己，自己画自己
	{
		
		g.setColor(Color.WHITE);
		g.fillRect(0,0,800,600);
		//画头部
		g.setColor(Color.GREEN);
		g.fillOval(100,100,160,160);
		//画眼睛
		g.setColor(Color.WHITE);
		g.fillOval(140,130,10,10);
		g.fillOval(200,130,10,10);
		//画脖子
		g.setColor(Color.WHITE);
		g.fillRect(100,160,160,100);
		//画身体
		g.setColor(Color.GREEN);
		g.fillRect(100,170,160,160);
		g.fillOval(210,130,10,10);
		//画腿腿
		g.setColor(Color.GREEN);
		g.fillRect(125,330,35,60);
		g.fillRect(205,330,35,60);
		//画手手
		g.fillRect(65,180,30,100);//左手

		g.fillRect(m1,n1,x,y);//垂直右手
		//g.fillRect(265,180,30,100);//垂直右手


		//g.fillRect(275,165,100,30);//水平右手

		//画头发
		g.drawLine(m5, n5, 140, 130);
		//g.drawLine(110, 100, 140, 130);
		g.drawLine(200, 150, 250, 100);
		
		//修正曲线
		g.fillOval(65,165,30,30);//左手上
		g.fillOval(65,265,30,30);//左手下

		g.fillOval(265,165,30,30);//右手上
		g.fillOval(m3,n3,30,30);//垂直右手下
		//g.fillOval(265,265,30,30);//垂直右手下
		//g.fillOval(365,165,30,30);//水平右手下

		g.setColor(Color.GREEN);
		g.fillOval(125,375,35,35);//左脚
		g.fillOval(205,375,35,35);//右脚

		g.setColor(Color.WHITE);
		g.fillRect(100,295,35,35);
		g.fillRect(225,295,35,35);

		g.setColor(Color.GREEN);
		g.fillOval(100,267,65,65);
		g.fillOval(195,267,65,65);
	}

}
