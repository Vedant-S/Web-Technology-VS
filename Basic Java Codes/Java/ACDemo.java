/* Using an applet context, getCodeBase(),
and showDocument() to display an HTML file.
*/
import java.awt.*;
import java.applet.*;
import java.net.*;
/*
<applet code="ACDemo" width=300 height=50>
</applet>
*/
public class ACDemo extends Applet
{
	public void start()
	{
		AppletContext ac = getAppletContext();


		URL url = getCodeBase(); // get url of this applet
		String msg = "Code base: " + url.toString();
		//g.drawString(msg, 10, 20);
		System.out.println(msg);

		try
		{
			System.out.println("11111111");
			ac.showDocument(new URL(url+"Test.html"));
			System.out.println("2222222");
		}
		catch(MalformedURLException e)
		{
			showStatus("URL not found");
			System.out.println(e);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}

	}
}