import javax.swing.*;
import java.awt.*;

public class scene extends JApplet
{
	Color obj;
	public void init()
	{
		obj=new Color(150,150,150);
		setVisible(true);
		setSize(500,400);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.drawLine(20,120,81,50);
		g.drawArc(78,44,28,28,10,161);
		g.drawLine(103,50,164,120);

		g.drawLine(164,120,225,50);
		g.drawArc(222,44,28,28,10,161);
		g.drawLine(247,50,308,120);
		g.drawLine(308,120,369,50);
		g.drawArc(366,44,28,28,10,161);
		g.drawLine(391,50,452,120);

		g.setColor(Color.red);
		g.fillArc(140,25,35,35,0,360);

		//DRAWING THE HOUSE
		g.setColor(Color.magenta);
		g.drawLine(20,220,60,160);
		g.drawLine(60,160,180,160);
		g.drawLine(60,160,80,220);
		g.drawLine(180,160,200,220);
		g.drawLine(20,220,200,220);
		g.drawLine(20,220,20,320);
		g.drawLine(80,220,80,320);
		g.drawLine(200,220,200,320);
		g.drawLine(20,320,200,320);

		//DRAWING THE WINDOW
		g.setColor(Color.blue);
		g.drawLine(40,260,60,260);
		g.drawLine(60,260,60,280);
		g.drawLine(60,280,40,280);
		g.drawLine(40,280,40,260);
		g.drawLine(50,260,50,280);
		g.drawLine(40,270,60,270);

		//DRAWING THE DOORS
		g.drawLine(125,320,125,250);
		g.drawLine(125,250,155,250);
		g.drawLine(155,250,155,320);
		g.drawLine(125,250,110,240);
		g.drawLine(110,240,110,320);
		g.drawLine(155,250,170,240);
		g.drawLine(170,240,170,320);
		g.drawLine(110,260,125,270);
		g.drawLine(110,263,125,273);
		g.drawLine(110,290,125,300);
		g.drawLine(110,293,125,303);
		g.drawLine(155,270,170,260);
		g.drawLine(155,273,170,263);
		g.drawLine(155,300,170,290);
		g.drawLine(155,303,170,293);

		g.setColor(Color.black);
		g.drawOval(400,200,20,20);
		g.drawLine(410,220,410,250);
		g.drawLine(410,250,390,270);
		g.drawLine(390,270,405,290);
		g.drawLine(410,250,405,270);
		g.drawLine(405,270,420,290);
		g.drawLine(410,220,385,235);
		g.drawLine(410,220,425,245);

		g.setColor(obj);
		Font f1=new Font("Monotype Corosiva",Font.BOLD|Font.ITALIC,26);
		g.setFont(f1);
		g.drawString("my home",280,250);



	}
}