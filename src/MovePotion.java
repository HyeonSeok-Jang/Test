import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MovePotion extends JLabel implements Runnable{
	public MovePotion(){
		
	}
	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		this.repaint();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ƾ�");
		while(true) {
			try {
				System.out.println("�ƴϤ���");
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("��ȣ");
				for(int i = 0;i<40;i++) {
					MoveTest.x=MoveTest.x+3;
					this.setBounds(MoveTest.x, 100, 300, 300);
					try {
						Thread.sleep(5);
					}catch(InterruptedException e1) {
						
					}
				}
				
				this.setIcon(new ImageIcon("src\\Potion.png"));
				
			}
			
		}
	}
	
}
