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
			 * xs배열, ys배열의 좌표를 이용해 곡선을 그림
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
		 * 선택된 점이 잇는지 보고 즉, dragIndex가 -1이 아닌지 보고
		 * 아니라면 선택된 점이 있다면.
		 * 선택된 점의 XY좌표를 변경한다.
		 */
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * 네개의 점 중 어느점이 선택되었는지 체크
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
