package codding;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bejie extends JFrame implements MouseListener, MouseMotionListener{
	private int[] xs = {50,150,400,450};
	private int[] ys = {200,50,300,200};
	private int dragIndex = -1;
	private BezierP panel=new BezierP();
	public Bejie() {
		setSize(700,700);
		setTitle("Bezier");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		this.add(panel);
		
		setVisible(true);
	}
	
	class BezierP extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			/*
			 * xs�迭, ys�迭�� ��ǥ�� �̿��� ��� �׸�
			 */
			g.setColor(Color.blue);
			g.fillRect(xs[0]-4,ys[0]-4,16,16);
			g.setColor(Color.green);
			g.fillRect(xs[2]-4,ys[2]-4,16,16);
			g.setColor(Color.red);
			g.fillRect(xs[1]-4,ys[1]-4,16,16);
			g.setColor(Color.pink);
			g.fillRect(xs[3]-4,ys[3]-4,16,16);
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.black);
			GeneralPath path = new GeneralPath();
			path.moveTo(xs[0]+4, ys[0]+4);
			path.curveTo(xs[1], ys[1], xs[2], ys[2], xs[3]+4, ys[3]+4);
			g2d.draw(path);
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bejie();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * ���õ� ���� �մ��� ���� ��, dragIndex�� -1�� �ƴ��� ����
		 * �ƴ϶�� ���õ� ���� �ִٸ�.
		 * ���õ� ���� XY��ǥ�� �����Ѵ�.
		 */
		if(dragIndex!=-1) {
			xs[dragIndex] = arg0.getX();
			ys[dragIndex] = arg0.getY();
		}
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * �װ��� �� �� ������� ���õǾ����� üũ
		 */
		dragIndex = -1;//1,2
		for(int i = 0;i < 4;i++) {
			Rectangle r = new Rectangle(xs[i]-6,ys[i]-6,20,20);
			if(r.contains(arg0.getX(), arg0.getY())) {
				dragIndex=i;
			}
		}
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
