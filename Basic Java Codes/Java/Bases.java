// Display code and document bases.
import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<applet code="Bases" width=300 height=50>
</applet>
*/
public class Bases extends Applet
{
	// Display code and document bases.

	public void paint(Graphics g)
	{
		String msg;
		URL url = getCodeBase(); // get code base+ give the path of the .class file
		msg = "Code base: " + url.toString();
		g.drawString(msg, 10, 20);

		url = getDocumentBase(); // get document base
		msg = "Document base: " + url.toString();//give the path of the .html file
		g.drawString(msg, 10, 40);

		showStatus("I love java");
	}
}
//Sample output from this program is show