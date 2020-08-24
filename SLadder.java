import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SLadder extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3,img4;
	ImageIcon img5,img6,img7,img8;
	ImageIcon img9,img10,img11;
	
	Image snakeimg,board,s12,start;
	Image player1,player2;
	Image player11,player12;
	Image dice,dice1;
	
	JButton b1,b2,b3,b4;
	JTextField tx1,tx2,tx3;
	
		int s=140;
		int p=840;
		int s1=140;
		int p1=840;
	boolean abc=false;
	boolean def=true;
	boolean xyz=true;
	boolean abc1=false;
	boolean def1=true;
	boolean xyz1=true;
	
	SLadder()
	{	int px1=40,py1=620;
	int px2=40,py2=620;
		setBackground(Color.black);

		img1=new ImageIcon("snakeimg.png");
		img2=new ImageIcon("board.jpg");
		img3=new ImageIcon("s12.png");
		img4=new ImageIcon("start.jpg");
		img5=new ImageIcon("about.gif");
		img6=new ImageIcon("reset.png");
		img7=new ImageIcon("start.gif");
		img8=new ImageIcon("player1.png");
		img9=new ImageIcon("player2.png");
		img10=new ImageIcon("dice.gif");
		img11=new ImageIcon("dice.png");
		
		snakeimg=img1.getImage();
		board=img2.getImage();
		s12=img3.getImage();
		start=img4.getImage();
	
		player1=img8.getImage();
		player2=img9.getImage();
		
		player11=img8.getImage();
		player12=img9.getImage();

		dice=img10.getImage();
		dice1=img11.getImage();
		
		setLayout(null);
		b1=new JButton(img5);
		b1.setBounds(50,120,100,30);
		add(b1);
		b1.setBackground(new Color(4,129,255));
		
		b2=new JButton(img6);
		b2.setBounds(50,180,100,30);
		add(b2);
		b2.setBackground(new Color(4,129,255)); 
		 
		Font f=new Font("Bauhaus 93",Font.ITALIC,20);

		tx1=new JTextField("Start Game");
		tx1.setBounds(50,230,150,35);
		add(tx1);
		tx1.setFont(f);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		
		tx2=new JTextField("Player 1 Name");
		tx2.setBounds(50,290,150,35);
		add(tx2);
		tx2.setFont(f);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		
		tx3=new JTextField("Player 2 Name");
		tx3.setBounds(50,375,150,35);
		add(tx3);
		tx3.setFont(f);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
	
		b3=new JButton("ROLL");
		b3.setBounds(50,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setForeground(Color.red);
		b3.addActionListener(this);
		
		b4=new JButton(img7);
		b4.setBounds(20,560,150,60);
		add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red);
		b4.addActionListener(this);
	
	}
//paint	
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		g.setColor(new Color(4,129,255));;
		g.fillRect(0,0,200,735);
		g.drawImage(snakeimg,0,0,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s12,920,0,this);
		g.drawImage(start,20,550,this);

		g.drawImage(player1,px1,py1,this);
		g.drawImage(player2,px2,py2,this);
		g.drawImage(player12,10,280,this);
		g.drawImage(player11,10,360,this);
		g.drawImage(dice,10,420,this);
		g.drawImage(dice1,110,430,this);
		
	}
	int k=1; int j=1; int px1=140;  int py1=630;	int x=1;
	int px2=140;  int py2=630;	int x1=1; 
//action
	public void actionPerformed(ActionEvent e)
	{
		
	while(j<2)
	{	if(e.getSource()==b4)
		{	
			JOptionPane.showMessageDialog(this,"Enter Name First !!");
			String name1=JOptionPane.showInputDialog(this,"Enter PLAYER 1 Name :");
			 tx2.setText(name1);
			 String name2=JOptionPane.showInputDialog(this,"Enter PLAYER 2 Name :");
			 tx3.setText(name2);
			 JOptionPane.showMessageDialog(this,"Player 1 can ROLL now :)");
			 
		}
		if(e.getSource()==b3)
		{	
			//JOptionPane.showMessageDialog(this,"Kindly Press START Button","Alert",JOptionPane.WARNING_MESSAGE);						 
					
							JOptionPane.showMessageDialog(this,"Enter Name First !!");
							String name1=JOptionPane.showInputDialog(this,"Enter PLAYER 1 Name :");
							tx2.setText(name1);
							String name2=JOptionPane.showInputDialog(this,"Enter PLAYER 2 Name :");
							tx3.setText(name2);
							JOptionPane.showMessageDialog(this,"Player 1 can ROLL now :)");
			 k++;
		
			}
		j++; 
	}
	int random=0;
		
		

	
if(k%2!=0)
{	
		if(e.getSource()==b3)
	{

	
	random=(int)Math.round(Math.random()*5+1);

	
		if(abc ){	
	 	if(x%2==0 && px1>=200)
		{
			
			switch(random)
		{
			case 1:
			img11=new ImageIcon("dice1.png");
			px1=p-70; 
			
			break; 
			case 2:
			img11=new ImageIcon("dice2.png");px1=p-140;
			break; 
			case 3:
			img11=new ImageIcon("dice3.png");px1=p-210;
			break; 
			case 4:
			img11=new ImageIcon("dice4.png");px1=p-280;
			break; 
			case 5:
			img11=new ImageIcon("dice5.png");px1=p-350;
			break; 
			case 6:
			img11=new ImageIcon("dice6.png");px1=p-420;
			break; 
		} p=px1;	
		 if( x%2==0 && px1<=200){ 
		 p=0;
		       py1-=70;		
		px1=140+(210-px1);
		s=px1;x++;  abc=false;	xyz=true;
		
		
		}
	
		}
		}

		
		
		
		if(def){
		if(x%2!=0 && px1<=860)
		{			
		switch(random)
		{
			case 1:
			img11=new ImageIcon("dice1.png");
			px1=s+70; 
			break; 
			case 2:
			img11=new ImageIcon("dice2.png");px1=s+140;
			break; 
			case 3:
			img11=new ImageIcon("dice3.png");px1=s+210;
			break; 
			case 4:
			img11=new ImageIcon("dice4.png");px1=s+280;
			break; 
			case 5:
			img11=new ImageIcon("dice5.png");px1=s+350;
			break; 
			case 6:
			img11=new ImageIcon("dice6.png");px1=s+420;
			break; 
		}s=px1; 
	
		if( x%2!=0 && px1>=860){  s=140;
		       py1-=70; 
		px1=840-(px1-840)+70;
		p=px1;
		 abc=true; xyz=false;		x++;	
		}
				
		}
		
		}
				def=xyz;
	//for ladders			
				if(px1==420 && py1==630)
				{
					px1=490;s=px1;
					py1=490;
				}
				if(px1==700 && py1==560)
				{
					px1=560;s=px1;
					py1=350;x++;xyz=true;
				}
				if(px1==700 && py1==420)
				{
					px1=770;s=px1;
					py1=350;x++;xyz=true;
				}
				if(px1==840 && py1==350)
				{
					px1=770;s=px1;
					py1=210;
				}
				if(px1==280 && py1==350)
				{
					px1=350;s=px1;
					py1=210;
				}
				if(px1==280 && py1==210)
				{
					px1=210;s=px1;
					py1=70;
				}
				if(px1==630 && py1==140)
				{
					px1=770;p=px1;
					py1=0;
				}
	//for snakes
				if(px1==630 && py1==490)
				{
					px1=490;s=px1;
					py1=630;
				}
				if(px1==210 && py1==420)
				{
					px1=350;s=px1;
					py1=630;
					x++; xyz=true;
				}
				if(px1==350 && py1==350)
				{
					px1=350;p=px1;
					py1=560;x++;abc=true;
				}
				if(px1==630 && py1==280)
				{
					px1=840;s=px1;
					py1=420;
				}
				if(px1==560 && py1==210)
				{
					px1=490;s=px1;
					py1=350;
				}
				if(px1==490 && py1==140)
				{
					px1=350;p=px1;
					py1=280;
				}
				if(px1==770 && py1==70)
				{
					px1=700;p=px1;
					py1=280;x++;abc=true;
				}
				if(px1==280 && py1==0)
				{
					px1=210;s=px1;
					py1=350;x++;xyz=true;
				}
		
		}
		
}		
if(k%2==0)
{
	
		if(e.getSource()==b3)
	{

	
	random=(int)Math.round(Math.random()*5+1);

		if(abc1 ){
	 	if(x1%2==0 && px2>=200)
		{
			
			switch(random)
		{
			case 1:
			img11=new ImageIcon("dice1.png");
			px2=p1-70; 
			
			break; 
			case 2:
			img11=new ImageIcon("dice2.png");px2=p1-140;
			break; 
			case 3:
			img11=new ImageIcon("dice3.png");px2=p1-210;
			break; 
			case 4:
			img11=new ImageIcon("dice4.png");px2=p1-280;
			break; 
			case 5:
			img11=new ImageIcon("dice5.png");px2=p1-350;
			break; 
			case 6:
			img11=new ImageIcon("dice6.png");px2=p1-420;
			break; 
		} p1=px2;	
		 if( x1%2==0 && px2<=200){ 
		 p1=0;
		       py2-=70;		
		px2=140+(210-px2);
		s1=px2;x1++;  abc1=false;	xyz1=true;
		
		
		}
		
		}
		}

	
		
		
		if(def1){
		if(x1%2!=0 && px2<=860)
		{			
		switch(random)
		{
			case 1:
			img11=new ImageIcon("dice1.png");
			px2=s1+70; 
			break; 
			case 2:
			img11=new ImageIcon("dice2.png");px2=s1+140;
			break; 
			case 3:
			img11=new ImageIcon("dice3.png");px2=s1+210;
			break; 
			case 4:
			img11=new ImageIcon("dice4.png");px2=s1+280;
			break; 
			case 5:
			img11=new ImageIcon("dice5.png");px2=s1+350;
			break; 
			case 6:
			img11=new ImageIcon("dice6.png");px2=s1+420;
			break; 
		}s1=px2; 
		
		if( x1%2!=0 && px2>=860){  s1=140;
		       py2-=70; 
		px2=840-(px2-840)+70;
		p1=px2; 
		 abc1=true; xyz1=false;		x1++;	
		}
			
		}
		
		}
				def1=xyz1;
	//for ladders			
				if(px2==420 && py2==630)
				{
					px2=490;s1=px2;
					py2=490;
				}
				if(px2==700 && py2==560)
				{
					px2=560;s1=px2;
					py2=350;x1++;xyz1=true;
				}
				if(px2==700 && py2==420)
				{
					px2=770;s1=px2;
					py2=350;x1++;xyz1=true;
				}
				if(px2==840 && py2==350)
				{
					px2=770;s1=px2;
					py2=210;
				}
				if(px2==280 && py2==350)
				{
					px2=350;s1=px2;
					py2=210;
				}
				if(px2==280 && py2==210)
				{
					px2=210;s1=px2;
					py2=70;
				}
				if(px2==630 && py2==140)
				{
					px2=770;p1=px2;
					py2=0;
				}
	//for snakes
				if(px2==630 && py2==490)
				{
					px2=490;s1=px2;
					py2=630;
				}
				if(px2==210 && py2==420)
				{
					px2=350;s1=px2;
					py2=630;
					x1++; xyz1=true;
				}
				if(px2==350 && py2==350)
				{
					px2=350;p1=px2;
					py2=560;x1++;abc1=true;
				}
				if(px2==630 && py2==280)
				{
					px2=840;s1=px2;
					py2=420;
				}
				if(px2==560 && py2==210)
				{
					px2=490;s1=px2;
					py2=350;
				}
				if(px2==490 && py2==140)
				{
					px2=350;p1=px2;
					py2=280;
				}
				if(px2==770 && py2==70)
				{
					px2=700;p1=px2;
					py2=280;x1++;abc1=true;
				}
				if(px2==280 && py2==0)
				{
					px2=210;s1=px2;
					py2=350;x1++;xyz1=true;
				}
			
		
	}	
}
	dice1=img11.getImage();			
		repaint();
		
			
			if(py1<0)
			{	abc=false;
				xyz=false;
				abc1=false;
				xyz1=false;
			JOptionPane.showMessageDialog(this,tx3.getText()+" WINS !!");}
			if(py2<0)
			{	abc=false;
				xyz=false;
				abc1=false;
				xyz1=false;
			JOptionPane.showMessageDialog(this,tx2.getText()+" WINS !!");}
					k++;
	}
	
	
	
}
	