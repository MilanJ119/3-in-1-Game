import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TTT extends JPanel implements ActionListener
{
	ImageIcon i2=new ImageIcon("TTT.jfif");
	Image title=i2.getImage();
	ImageIcon i3=new ImageIcon("mario.png");
	Image mario=i3.getImage();
	ImageIcon i4=new ImageIcon("luigi.png");
	Image luigi=i4.getImage();
	JButton start;
	JLabel p1,p2;
	JTextField tx1,tx2;
	boolean start_game=false;
	boolean boo1=false;
	boolean boo2=false;
	JButton b[]=new JButton[9];
	int x=250,y=220;
	TTT()
	{	
		Font f=new Font("",Font.BOLD,15);
		Font f1=new Font("",Font.BOLD,45);
		setLayout(null);
		setBackground(Color.BLACK);
		/* reset=new JButton("RESET");
		reset.setBounds(0,525,700,30);
		reset.setFont(f);
		add(reset); */
		
		p1=new JLabel("Player 1:");
		p1.setBounds(40,240,100,30);
		p1.setFont(f);
		add(p1);
		tx1=new JTextField();
		tx1.setBounds(5,275,180,25);
		add(tx1);
		
		p2=new JLabel("Player 2:");
		p2.setBounds(40,340,100,30);
		p2.setFont(f);
		add(p2);
		tx2=new JTextField();
		tx2.setBounds(5,375,180,25);
		add(tx2);

		start=new JButton("START");
		start.setBounds(45,430,100,30);
		add(start);
		int a=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
				b[a]=new JButton("");
				b[a].setBounds(x,y,80,80);
				b[a].addActionListener(this);
				b[a].setFont(f1);
				add(b[a]);
				a++;
				x=x+83;
				
			}
			x=250;
			y=y+83;
		}
		start.addActionListener(this);
		// reset.addActionListener(this);
	}
	int k=0;
	int z=0;
	String s1="";
	String s2="";
	public void actionPerformed(ActionEvent e)
		
	{
		if(e.getSource()==start)
		{
			
			JOptionPane.showMessageDialog(this,"Enter Name First !!");
			String name1=JOptionPane.showInputDialog(this,"Enter PLAYER 1 Name :");
			 tx1.setText(name1);
			 String name2=JOptionPane.showInputDialog(this,"Enter PLAYER 2 Name :");
			 tx2.setText(name2);
			start_game=true;
		}
		/* if(e.getSource()==reset)
		{
			for(int i=0;i<9;i++)
			{
				b[i].setLabel("");
				start_game=true;
			}
		} */
	if(start_game)
	{
		JButton b1=(JButton)e.getSource();
		if(e.getSource()==start)
		{
			b1.setLabel("Started");
		}
		else if(k%2==0)
		{	
			b1.setLabel("0");
		}
		else
		{
			b1.setLabel("X");
		}
		k++;
		b1.removeActionListener(this);
			
//Winner Condition
		if((b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X") 
			||(b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X")
			||(b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X")
			||(b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X")
			||(b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X")
			||(b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X")
			||(b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X")
			||(b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X")
			)
		{	
			s1=tx1.getText();
			boo1=true;
			start_game=false;
			repaint();
		}
		else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0") 
			||(b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0")
			||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")
			||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")
			||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0")
			||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")
			||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")
			||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")
			)
		{
			s2=tx2.getText();
			boo2=true;
			start_game=false;
			repaint();
		}
	}
		
	}
	public void paintComponent(Graphics g)
	{	
		Font f=new Font("Comic Sans MS",Font.BOLD,27);
		super.paintComponent(g);
		g.drawRect(5,200,180,280);
		g.drawImage(title,160,30,this);
		g.drawImage(mario,15,230,this);
		g.drawImage(luigi,10,330,this); 
		if(boo1)
		{
			g.setFont(f);
			g.setColor(Color.GREEN);
			g.drawString(s1+" Wins!",295,200);
		}
		if(boo2)
		{
			g.setFont(f);
			g.setColor(Color.GREEN);
			g.drawString(s2+" Wins!",295,200);
		}
		
	}
}
