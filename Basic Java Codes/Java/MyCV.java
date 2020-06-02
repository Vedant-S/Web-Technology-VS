import java.awt.*;
import javax.swing.*;

public class MyCV
{
	JFrame f1;
	JPanel p1;
	JButton b1;

	JLabel l1,l2,l3,l4;

	JLabel lName,lAdd,lCell,lPhoto,lDob,lEmail,lMar,lSex,lPost,lDeg,lColl,lCent,lSch,lSkill,lSpl,lDecl,lInst,lYear,lYear1,lPerc,lC1,lC2,lC3;

	JTextField tName,tEmail,tCell,tDIn,tDYr,tDPr,tDSpl,tHIn,tHYr,tHPr,tHSpl,tSIn,tSYr,tSPr,tSSpl;

	JCheckBox cSK2,cSK3,cSK4,cSK5,cSK6,cSK7,cSK8;

	JComboBox cbDob1,cbDob2,cbDob3,cbCenter1,cbCenter2,cbCenter3;

	JRadioButton rdS1,rdS2,rdM1,rdM2;

	JTextArea taddr;

	JList post;

	ButtonGroup bg1,bg2;


	String x[],y[];
	String z[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	String p[]={"Software Trainee","Project Leader","Project Manager","Manager","CEO","Other"};
	String c[]={"Banglore","Calcutta","Mumbai","Delhi","Hyderabad","Bhubaneswar","Other.."};

	public MyCV()
	{
		bg1=new ButtonGroup();
		bg2=new ButtonGroup();

		Font mf1=new Font("Monotype Corosiva",Font.BOLD,34);
		p1=new JPanel();
		l1=new JLabel();
		f1=new JFrame("RESUME");
		f1.setVisible(true);
		f1.setSize(500,500);

		x=new String[31];
		y=new String[40];
		p1.setBackground(Color.lightGray);
		p1.setLayout(null);

		f1.getContentPane().add(p1);


		p1.add(l1);
		l1.setBounds(350,0,150,50);
		l1.setForeground(Color.blue);
		l1.setFont(mf1);
		//l1.setunderlined(true);
		l1.setText("D.D.S.");

		lName=new JLabel("NAME   : ");
		lName.setForeground(Color.yellow);
		tName=new JTextField(20);
		lName.setBounds(70,50,150,20);
		tName.setBounds(120,50,200,20);
		p1.add(lName);
		p1.add(tName);

		lAdd=new JLabel("Address :");
		lAdd.setForeground(Color.yellow);
		taddr=new JTextArea();
		lAdd.setBounds(65,100,150,20);
		taddr.setBounds(120,100,200,100);
		p1.add(lAdd);
		p1.add(taddr);

		lCell=new JLabel("Phone NO:");
		lCell.setForeground(Color.yellow);
		tCell=new JTextField(20);
		l3=new JLabel("(Use ' / ' if more than one number)");
		l3.setForeground(Color.blue);
		lCell.setBounds(350,100,80,30);
		tCell.setBounds(420,100,200,20);
		l3.setBounds(430,115,250,30);
		p1.add(lCell);
		p1.add(tCell);
		p1.add(l3);

		lPhoto=new JLabel("PHOTOGRAPH");
		lPhoto.setForeground(Color.yellow);
		lPhoto.setBounds(645,50,250,20);
		p1.add(lPhoto);



		lEmail=new JLabel("   EMAIL ID:");
		lEmail.setForeground(Color.yellow);
		lEmail.setBounds(350,50,120,30);
		p1.add(lEmail);
		tEmail=new JTextField(20);
		tEmail.setBounds(420,50,200,20);
		p1.add(tEmail);

		for(int i=0;i<=30;i++)
		 x[i]=String.valueOf(i+1);
		int i=1975;
		for(int j=0;j<40;j++,i++)
		 y[j]=String.valueOf(i);
		lDob=new JLabel("  Date Of Birth :");
		lDob.setForeground(Color.yellow);
		cbDob1=new JComboBox(x);
		cbDob2=new JComboBox(z);
		cbDob3=new JComboBox(y);
		lDob.setBounds(30,220,150,20);
		cbDob1.setBounds(120,220,40,20);
		cbDob2.setBounds(163,220,90,20);
		cbDob3.setBounds(255,220,60,20);
		p1.add(lDob);
		p1.add(cbDob1);
		p1.add(cbDob2);
		p1.add(cbDob3);

		lSex=new JLabel("Sex :");
		lSex.setForeground(Color.yellow);
		rdS1=new JRadioButton("Male",true);
		rdS2=new JRadioButton("Female");
		lSex.setBounds(70,250,50,30);
		rdS1.setBounds(110,250,55,30);
		rdS2.setBounds(165,250,70,30);
		rdS1.setBackground(Color.lightGray);
		rdS2.setBackground(Color.lightGray);
		bg1.add(rdS1);
		bg1.add(rdS2);
		p1.add(lSex);
		p1.add(rdS1);
		p1.add(rdS2);

		lMar=new JLabel("Marital Status :");
		lMar.setForeground(Color.yellow);
		rdM1=new JRadioButton("Married");
		rdM2=new JRadioButton("Single",true);
		lMar.setBounds(350,250,120,30);
		rdM1.setBounds(435,250,70,30);
		rdM2.setBounds(505,250,80,30);
		rdM1.setBackground(Color.lightGray);
		rdM2.setBackground(Color.lightGray);
		bg2.add(rdM1);
		bg2.add(rdM2);
		p1.add(lMar);
		p1.add(rdM1);
		p1.add(rdM2);

		//how to make scroll
		post=new JList(p);
		lPost=new JLabel("POST APPLYING FOR  ");
		lPost.setForeground(Color.yellow);
		post.setBounds(630,250,120,110);
		lPost.setBounds(630,220,150,30);
		p1.add(post);
		p1.add(lPost);

		lDeg=new JLabel("  DEGREE  : ");
		lDeg.setForeground(Color.yellow);
		lColl=new JLabel("  HSC    :");
		lColl.setForeground(Color.yellow);
		lSch=new JLabel("SCHOOLING :");
		lSch.setForeground(Color.yellow);
		lInst=new JLabel("          INSTITUTION");
		lInst.setForeground(Color.yellow);
		lYear=new JLabel("     YEAR ");
		lYear.setForeground(Color.yellow);
		lYear1=new JLabel("OF PASSING");
		lYear1.setForeground(Color.yellow);
		lPerc=new JLabel("    %AGE  ");
		lPerc.setForeground(Color.yellow);
		lSpl=new JLabel("SPECIALIZATION");
		lSpl.setForeground(Color.yellow);
		lInst.setBounds(140,280,120,30);
		p1.add(lInst);
		lYear.setBounds(330,265,130,30);
		p1.add(lYear);
		lYear1.setBounds(330,280,130,30);
		p1.add(lYear1);
		lPerc.setBounds(410,280,50,30);
		p1.add(lPerc);
		lSpl.setBounds(490,280,100,30);
		p1.add(lSpl);
		lDeg.setBounds(35,300,80,30);
		p1.add(lDeg);
		lColl.setBounds(50,330,80,30);
		p1.add(lColl);
		lSch.setBounds(20,360,80,30);
		p1.add(lSch);
		tDIn=new JTextField(120);
		tDIn.setBounds(110,305,220,20);
		p1.add(tDIn);
		tDYr=new JTextField(15);
		tDYr.setBounds(330,305,70,20);
		p1.add(tDYr);
		tDPr=new JTextField(15);
		tDPr.setBounds(400,305,70,20);
		p1.add(tDPr);
		tDSpl=new JTextField(15);
		tDSpl.setBounds(470,305,130,20);
		p1.add(tDSpl);
		tHIn=new JTextField(120);
		tHIn.setBounds(110,335,220,20);
		p1.add(tHIn);
		tHYr=new JTextField(15);
		tHYr.setBounds(330,335,70,20);
		p1.add(tHYr);
		tHPr=new JTextField(15);
		tHPr.setBounds(400,335,70,20);
		p1.add(tHPr);
		tHSpl=new JTextField(15);
		tHSpl.setBounds(470,335,130,20);
		p1.add(tHSpl);
		tSIn=new JTextField(120);
		tSIn.setBounds(110,365,220,20);
		p1.add(tSIn);
		tSYr=new JTextField(15);
		tSYr.setBounds(330,365,70,20);
		p1.add(tSYr);
		tSPr=new JTextField(15);
		tSPr.setBounds(400,365,70,20);
		p1.add(tSPr);
		tSSpl=new JTextField(15);
		tSSpl.setBounds(470,365,130,20);
		p1.add(tSSpl);

		lSkill=new JLabel("SKILL SETS :");
		lSkill.setForeground(Color.yellow);
		lSkill.setBounds(20,395,80,30);
		p1.add(lSkill);
		cSK2=new JCheckBox("C");
		cSK2.setBackground(Color.lightGray);
		cSK2.setBounds(95,395,40,30);
		p1.add(cSK2);
		cSK3=new JCheckBox("C++");
		cSK3.setBackground(Color.lightGray);
		cSK3.setBounds(130,395,50,30);
		p1.add(cSK3);
		cSK4=new JCheckBox("VB");
		cSK4.setBackground(Color.lightGray);
		cSK4.setBounds(185,395,50,30);
		p1.add(cSK4);
		cSK5=new JCheckBox("ORACLE");
		cSK5.setBackground(Color.lightGray);
		cSK5.setBounds(240,395,90,30);
		p1.add(cSK5);
		cSK6=new JCheckBox("CORE JAVA");
		cSK6.setBackground(Color.lightGray);
		cSK6.setBounds(335,395,120,30);
		p1.add(cSK6);
		cSK7=new JCheckBox("J2EE");
		cSK7.setBackground(Color.lightGray);
		cSK7.setBounds(450,395,70,30);
		p1.add(cSK7);
		cSK8=new JCheckBox(".NET");
		cSK8.setBackground(Color.lightGray);
		cSK8.setBounds(525,395,70,30);
		p1.add(cSK8);

		lCent=new JLabel("PREFFRED WORK PLACE :");
		lCent.setForeground(Color.yellow);
		lCent.setBounds(5,435,150,30);
		p1.add(lCent);
		lC1=new JLabel("    (1st Choice)  ");
		lC1.setForeground(Color.yellow);
		lC1.setBounds(180,415,150,30);
		p1.add(lC1);
		lC2=new JLabel("    (2nd Choice)  ");
		lC2.setForeground(Color.yellow);
		lC2.setBounds(350,415,150,30);
		p1.add(lC2);
		lC3=new JLabel("    (3rd Choice)  ");
		lC3.setForeground(Color.yellow);
		lC3.setBounds(520,415,150,30);
		p1.add(lC3);
		cbCenter1=new JComboBox(c);
		cbCenter1.setBounds(180,440,100,20);
		p1.add(cbCenter1);
		cbCenter2=new JComboBox(c);
		cbCenter2.setBounds(350,440,100,20);
		p1.add(cbCenter2);
		cbCenter3=new JComboBox(c);
		cbCenter3.setBounds(520,440,100,20);
		p1.add(cbCenter3);

		lDecl=new JLabel("DECLARATION");
		lDecl.setForeground(Color.blue);
		lDecl.setBounds(350,445,100,60);
		p1.add(lDecl);
		Font mf2=new Font("Times New Roman",Font.BOLD,16);
		l2=new JLabel("I do hereby declare that all the above mentioned details are true to the best of my knowledge.");
		l2.setFont(mf2);
		l2.setForeground(Color.yellow);
		l2.setBounds(50,473,700,30);
		p1.add(l2);

		b1=new JButton("SUBMIT");
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b1.setBounds(700,500,80,20);
		p1.add(b1);

		}

		public static void main(String args[])
		{
			MyCV obj=new MyCV();
		}

}