import java.awt.*;
import javax.swing.*;

public class bdmo extends JApplet
{
	JButton b1,b2,b3,b4,b5;
	JPanel p1;

	public void init()
	{
		p1=new JPanel();
		getContentPane().add(p1);

		p1.setLayout(null);

		b1=new JButton("Button 1");
		b2=new JButton("Button 2");
		b3=new JButton("Button 3");
		b4=new JButton("Button 4");
		b5=new JButton("Button 5");

		b1.setBounds(100,100,150,30);
		b2.setBounds(350,100,150,30);
		b3.setBounds(225,150,150,30);
		b4.setBounds(100,200,150,30);
		b5.setBounds(350,200,150,30);

		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
	}
}