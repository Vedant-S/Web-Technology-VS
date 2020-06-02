import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class AppletMethods extends JApplet
{
	int initCounter=0;
	int startCounter=0;
	int stopCounter=0;
	int destroyCounter=0;

	public void init()
	{
		initCounter++;
		repaint();
	}

	public void start()
	{
		startCounter++;
		repaint();
	}

	public void stop()
	{
		stopCounter++;
		repaint();
	}

	public void destroy()
	{
		System.out.println("Destroy Fired");
		destroyCounter++;
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("init has invoked "+initCounter+" times",20,20);
		g.drawString("start has invoked "+startCounter+" times",20,35);
		g.drawString("stop has invoked "+stopCounter+" times",20,50);
		g.drawString("destroy has invoked "+destroyCounter+" times",20,65);
	}
}