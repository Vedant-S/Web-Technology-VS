// Display code and document bases.
import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<applet code="Bases" width=300 height=50>
</applet>
*/
public class Bases2 extends Applet
{
	// Display code and document bases.
	String msg1,msg2;
	public void init()
	{
		URL url = getCodeBase(); // get code base+ give the path of the .class file
		msg1 = "Code base: " + url.toString();

		url = getDocumentBase(); // get document base
		msg2 = "Document base: " + url.toString();//give the path of the .html file
	}

	public void paint(Graphics g)
	{
		g.drawString(msg1, 10, 20);
		g.drawString(msg2, 10, 40);

		showStatus("I love java");
	}
}
//Sample output from this program is show