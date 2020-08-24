import javax.swing.*;
import java.awt.*; 
  
class HomeDemo extends JPanel{
	JButton b1,b2,b3;
	ImageIcon i=new ImageIcon("tenor2.gif");
	Image im=i.getImage();
	ImageIcon i1=new ImageIcon("3_in_1.png");
	Image title=i1.getImage();
	ImageIcon i2=new ImageIcon("orange.png");
	Image orange=i2.getImage();
	ImageIcon i3=new ImageIcon("blue.png");
	Image blue=i3.getImage();
	ImageIcon i4=new ImageIcon("green.jpg");
	Image green=i4.getImage();
	HomeDemo(FDemo f){
		
	setLayout(null);
	Font f1=new Font("",Font.BOLD,15);
	Font f2=new Font("",Font.BOLD,12);
	
	b1=new JButton(i2);
	b1.setBounds(210,261,100,31);
	b1.setFont(f1);
	add(b1);
	
	b2=new JButton(i3);
	b2.setBounds(205,331,110,31);
	b2.setFont(f1);
	add(b2);
	
	b3=new JButton(i4);
	b3.setBounds(210,412,100,31);
	b3.setFont(f2);
	add(b3);
	
	b1.addActionListener(f);
	b2.addActionListener(f);
	b3.addActionListener(f);
	}
	public void paintComponent(Graphics g){
		g.drawImage(im,0,0,this);
		g.drawImage(title,35,50,this);
		g.drawImage(orange,195,257,this);
		g.drawImage(blue,195,327,this);
		g.drawImage(green,195,407,this);
	}
}