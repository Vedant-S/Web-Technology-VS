
import javax.swing.*;
import java.awt.*;

public class drawPicThread extends JApplet implements Runnable
{
	Thread t;

	public void init()
	{
		//setVisible(true);
		//setSize(500,400);
		t=new Thread();
		t.start();
	}
	public void run()
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		//DRAWING THE HOUSE
		g.setColor(Color.magenta);
		for(int i=100,j=220;j>119;j--)
		{
			checking();
			g.drawOval(i,j,2,2);
		}
		for(int i=100,j=120;i>59;i--,j--)
		{
			checking();
			g.drawOval(i,j,2,2);
		}
		for(int i=60,j=80;i<141;i++)
		{
			checking();
			g.drawOval(i,j,2,2);
		}
		for(int i=140,j=80;i<181;i++,j++)
		{
			checking();
			g.drawOval(i,j,2,2);
		}
		for(int i=180,j=120;j<221;j++)
		{
			checking();
			g.drawOval(i,j,2,2);
		}
		for(int i=180,j=220;i>19;i--)
		{
			checking();
			g.drawOval(i,j,2,2);
		}
		for(int i=20,j=220;j>119;j--)
		{
			checking();
			g.drawOval(i,j,2,2);
		}
		for(int i=20,j=120,k=20;i<61||k<181;i++,j--,k++)
		{
			checking();
			if(i<61)
			{
				g.drawOval(i,j,2,2);
			}
			g.drawOval(k,120,2,2);
			if(i==60 && k==180)
			{
				break;
			}
		}

}
	public void checking()
	{
					try
					{
						t.sleep(30);
						//g.drawOval(i,j,2,2);
					}
					catch(Exception e)
					{
					}
		}

}