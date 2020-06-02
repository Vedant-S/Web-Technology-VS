import javax.swing.*;
import java.awt.*;

public class face extends JApplet
{
	public void init()
	{
		setVisible(true);
		setSize(400,400);
	}

	public void paint(Graphics g)
	{
		g.drawOval(93,49,215,250);//OUTER CIRCLE
		g.drawOval(145,130,40,50);//LEFT EYE
		g.drawOval(230,130,40,50);//RIGHT EYE

		g.drawArc(135,120,60,60,0,180);//LEFT EYEBROW
		g.drawArc(220,120,60,60,0,180);
		g.drawArc(175,200,70,50,180,180);

		g.setColor(Color.red);
		g.fillOval(260,150,25,30);
		g.setColor(Color.blue);
		g.fillOval(245,150,25,30);

		Font f1=new Font("vardana",Font.BOLD|Font.ITALIC,50);
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("KIIT SMILE",150,350);
	}
}

