//bhai programe thik hai .... haa ase toh chl rha h alag se bhi same code kiya tha toh!
//btaun kya ??
// bhai isme kya prob. aa rhi hai
//abhi button dbane pr bhi chl nhi rha h,pr jb me minimize krke maximize krunga tb chlta h 
//ye panel open kanha se ho rha hai
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Snake extends JPanel implements ActionListener,KeyListener{
	ImageIcon img1,img2,img3;
	Image head,body,food;
	ImageIcon img4;
	Image bg;
	int x[]=new int[100];
	int y[]=new int[100];
	int dots=5;
	boolean start_game=false;
	boolean left=false,right=true,up=false,down=false;
	int r1=0,r2=0;
	Snake()
	{
		x[0]=120; y[0]=100;
		x[1]=100; y[1]=100;
		x[2]=80; y[2]=100;
		x[3]=60; y[3]=100;
		x[4]=40; y[4]=100;
		img1=new ImageIcon("head.jfif");
		head=img1.getImage();
		img2=new ImageIcon("body.png");
		body=img2.getImage();
		img3=new ImageIcon("food.jpg");
		food=img3.getImage();
		img4=new ImageIcon("Sbg.jpg");
		bg=img4.getImage();
		Timer t=new Timer(80,this);
		t.start();
		addKeyListener(this);
		randomDemo();
	}
	void randomDemo(){
		r1=(int)Math.round(Math.random()*45+1);
		r1=r1*20;
		r2=(int)Math.round(Math.random()*45+1);
		r2=r2*20;
		if(((r1>=800)||(r2>=600))){
			randomDemo();
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(bg,0,0,this);
		g.drawImage(food,r1,r2,this);
		g.drawRect(20,20,780,570);
		for(int i=0;i<dots;i++){
			if(i==0)
			{
				if((x[i]>=790|| x[i]<=10) || (y[i]<=10 || y[i]>=580))
 				{
					start_game=false;
					removeKeyListener(this);
					Font f=new Font("",Font.BOLD,55);
					g.setColor(Color.WHITE);
					g.setFont(f);
					g.drawString("Game Over",280,300);
				}
				else{
			g.drawImage(head,x[i],y[i],this);
					
				}
			}
			else{
				g.drawImage(body,x[i],y[i],this);
				if((x[0]==x[i]) && (y[0]==y[i]))
				{
					start_game=false;
					removeKeyListener(this);
					Font f=new Font("",Font.BOLD,55);
					g.setColor(Color.WHITE);
					g.setFont(f);
					g.drawString("Game Over",280,300);
					
				}
			}
		}
		
	}
	public void actionPerformed(ActionEvent ae){
		if(x[0]==r1 && y[0]==r2){
			dots++;
			randomDemo();
		}
		if(start_game){
			for(int i=dots;i>0;i--)
			{
				x[i]=x[i-1];
				y[i]=y[i-1];
			}
			if(right){
			x[0]=x[0]+20;}
			if(left){
			x[0]=x[0]-20;}
			if(up){
			y[0]=y[0]-20;}
			if(down){
			y[0]=y[0]+20;}
			}
			repaint();
 	}
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e){
		start_game=true;
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			left=true;
			right=false;
			up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			left=false;
			right=true;
			up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP){
			left=false;
			right=false;
			up=true;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			left=false;
			right=false;
			up=false;
			down=true;
		}
	}
	public void keyTyped(KeyEvent e){}
}
