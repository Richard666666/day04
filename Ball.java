import java.awt.Color;
import java.awt.Graphics;


class Ball 
{
	//С�������
	int x;//Բ�ĺ�����
	int y;//Բ��������
	int sx;//�������ƶ��ľ���
	int sy;//�������ƶ��ľ���
	int r;
	Color color;
	boolean alive=true;

	//С�����Ϊ
	Ball(int _x,int _y, int _sx, int _sy,Color _color,int _r)//���캯�����ǲ��֣�
	{
		x=_x;
		y=_y;
		sx=_sx;
		sy=_sy;
		color=_color;
		r=_r;
	}
/***********************************************************************/
	void move()
	{
		x=x+sx;
		y=y+sy;
		if(x-r<=0||x+r>800)
		{
			sx=-sx;
		}
		if(y-r<=25||y+r>=600)
		{
			sy=-sy;
		}
	}
/***********************************************************************/
	void eat(Ball other)
	{
		if(this!=other&&alive&&other.alive)
		{
			int dx=x-other.x;
			int dy=y-other.y;
			double distance=Math.sqrt(dx*dx+dy*dy);
			if(distance<r+other.r)
			{
				if(r>other.r)
				{
					double area1=Math.PI*r*r;
					double area2=Math.PI*other.r*other.r;
					r=(int)(Math.sqrt((area1+area2)/Math.PI));
					other.alive=false;
				}
			}
		}
		
	}
/***********************************************************************/	
	void draw(Graphics g)//���������⣡��int x�Ƚ�
	{
		g.setColor(color);
		g.fillOval(x-r,y-r,2*r,2*r);

	





	
	
	}
}
