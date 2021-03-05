package codding;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class Yaho extends JPanel implements ActionListener{
	private BufferedImage img;
	private File file;
	private Timer timer;
	private int x,y;
	private boolean dirx=true,diry=true;
	private final int START_X=0, START_Y=250;
	public Yaho (){
		/* �̹��� ������ �о� img��ü�� ����
		 * 20ms ���� �̺�Ʈ �߻���Ű�� timer ��ü�� �����ϰ� timer�� start��Ŵ 
		 */
		file = new File("src\\codding\\Egg_G_1.png");
		try {
			img = ImageIO.read(file);
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		x = START_X;
		y = START_Y;
		timer = new Timer(20, this);
		timer.start();
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new Yaho());
		frame.setSize(500,700);
		frame.setTitle("���ư���!");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.setVisible(true);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//xy��ǥ �̹��� �׸���
		g.drawImage(img, x, y, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		// xy��ǥ ����
		if(dirx) {
			x+=10;
		}else {
			x-=10;
		}
		if(diry) {
			y-=10;
		}else {
			y+=10;
		}
		if(x>=400)
			dirx=false;
		else if(x<=0)
			dirx=true;
		
		if(y<=0)
			diry=false;
		else if(y>=560)
			diry=true;
		repaint();
	}
	
}
