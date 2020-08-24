import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	Container cn=getContentPane();
	CardLayout card;
	HomeDemo home;
	SLadder sl;
	TTT t; 
	Snake s;
	FDemo()
	{
		card=new CardLayout();
		setLayout(card);
		
		home=new HomeDemo(this);
		add("home",home);
		sl=new SLadder();
		add("sl",sl);
		t=new TTT();
		add("ttt",t);
		s=new Snake();
		add("s",s);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==home.b1)
		{
		card.show(cn,"s");
		setBounds(250,50,830,640);
		s.requestFocusInWindow();	
		}
		if(e.getSource()==home.b2)
		{
		card.show(cn,"ttt");
		setBounds(250,80,700,600);		
		setResizable(false);
		}
		if(e.getSource()==home.b3)
		{
		card.show(cn,"sl");	
		setBounds(200,0,990,735);
		setResizable(false);
		}
	}
	
	                                    
}
class Demo
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(350,80,510,530);
		f.setResizable(false);
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("logo.png");
		f.setIconImage(i);
		f.setTitle("3-in-1 Game");
	}
}




