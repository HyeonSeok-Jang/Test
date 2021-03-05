import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class MoveTest extends JFrame implements KeyListener, Runnable{
	private MovePotion view = new MovePotion();
	private ImageIcon icon = new ImageIcon("src\\Potion.png");
	public static int x = 100;
	public static boolean move = true;
	public static boolean move2 = true;
	public Thread akack; 
	public MoveTest(){
		view.setIcon(icon);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		setSize(700,700);
		view.setBounds(100, 100, 300, 300);
		this.addKeyListener(this);
		setLocationRelativeTo(null);
		setLayout(null);
		
		this.add(view);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveTest view= new MoveTest();
		Thread thiss = new Thread(view);
		thiss.start();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		akack.interrupt();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		this.repaint();
	}
	@Override
	public void run() {
		akack = new Thread(view);
		akack.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			
		}
		// TODO Auto-generated method stub
	}
	
}
