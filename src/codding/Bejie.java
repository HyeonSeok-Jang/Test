package codding;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bejie extends JFrame implements MouseListener, MouseMotionListener{
	private int[] xs = {50,150,400,450};
	private int[] ys = {200,50,300,200};
	private int dragIndex = -1;
	public Bejie() {
		
	}
	
	class BezierP extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			/*
			 * xs�迭, ys�迭�� ��ǥ�� �̿��� ��� �׸�
			 */
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * ���õ� ���� �մ��� ���� ��, dragIndex�� -1�� �ƴ��� ����
		 * �ƴ϶�� ���õ� ���� �ִٸ�.
		 * ���õ� ���� XY��ǥ�� �����Ѵ�.
		 */
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * �װ��� �� �� ������� ���õǾ����� üũ
		 */
		dragIndex = 0;//1,2
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		dragIndex = -1;
		repaint();
	}
	
	
	
	
	
	
	

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}
}
