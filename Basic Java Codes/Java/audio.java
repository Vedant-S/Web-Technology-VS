// Using an applet context, getCodeBase(),
//and showDocument() to display an HTML file.

import java.awt.*;
import java.applet.*;
//import java.net.*;

public class audio extends Applet
{
	AudioClip a1;
	public void init()
	{
		a1=getAudioClip(getCodeBase(),"spacemusic.au");
	}
	public void start()
	{
		a1.play();
	}
	public void paint(Graphics g)
	{
		g.drawString("Playing Music",50,30);
	}
}
//The getAudioClip() method returns the URL of the music
//file specified as its parameter value.

//Returns an AudioClip object that encapsulates the audio
//clip found at the location specified by url.

//Then play method is called to play the musci file.