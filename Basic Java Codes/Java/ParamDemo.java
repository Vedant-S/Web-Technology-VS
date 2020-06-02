// Use Parameters
import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet
{
	String fontName;
	int fontSize;
	float leading;
	boolean active;


	// Initialize the string to be displayed.
	public void start()
	{
		String param;//for displaying all the data in String format

		fontName = getParameter("fontName");
		if(fontName == null)
			fontName = "Not Found";

			param = getParameter("fontSize");
			try
			{
				if(param != null) // if not found
					fontSize = Integer.parseInt(param);
				else
					fontSize = 0;
			}
			catch(NumberFormatException e)
			{
				fontSize = -1;
			}
			param = getParameter("leading");
			try
			{
				if(param != null) // if not found
					leading = Float.valueOf(param).floatValue();
				else
					leading = 0;
			}
			catch(NumberFormatException e)
			{
				leading = -1;
			}
			param = getParameter("accountEnabled");
			if(param != null)
				active = Boolean.valueOf(param).booleanValue();
		}
		// Display parameters.
		public void paint(Graphics g)
		{
			g.drawString("Font name: "	 		+ fontName, 0, 10);
			g.drawString("Font size: "	 		+ fontSize, 0, 26);
			g.drawString("Leading: " 				+ leading, 0, 42);
			g.drawString("Account Active: " + active, 0, 58);
		}
}
//Sample output from this program