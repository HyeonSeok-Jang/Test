package codding;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Java2D extends JFrame{
	
	public Java2D() {
		setSize(800,800);
		setTitle("draw");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		JPanel panel = new MyPanel();
		this.add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Java2D();
	}
}

class MyPanel extends JPanel{
	ArrayList<Shape> list = new ArrayList<>();
	MyPanel (){
		Shape s;
		s = new Rectangle2D.Double(10, 10, 700, 700);
		list.add(s);
		
		s = new RoundRectangle2D.Double(110, 50, 80, 80,20,60);
		list.add(s);
		
		
		s = new Ellipse2D.Double(210, 50, 80, 40);
		list.add(s);
		
		s = new Ellipse2D.Double(310, 50, 80, 80);
		list.add(s);
		
		
		
		s = new RoundRectangle2D.Double(110, 150, 80, 80,50,50);
		list.add(s);
		// new RoundRectangle2D.Double(x, y, w, h, r1,r2);
		
		
		s = new Arc2D.Double(110, 250, 80, 80,0,210, Arc2D.OPEN);
		list.add(s);
		
		s = new Arc2D.Double(210, 250, 80, 80,0,210, Arc2D.PIE);
		list.add(s);
		
		s = new Arc2D.Double(310, 250, 80, 80,0,210, Arc2D.CHORD);
		list.add(s);
		// new RoundRectangle2D.Double(x, y, rw, rh, startdegree,startdegree+Degree, 타입);
		// OPEN= 원호, PIE= 부채꼴, CHORD= 활호
		
		
		
		
		
		s = new RoundRectangle2D.Double(110, 350, 80, 80,20,60);
		list.add(s);
		
		s = new RoundRectangle2D.Double(110, 450, 80, 80,50,50);
		list.add(s);
		
		s = new Ellipse2D.Double(210, 350, 80, 40);
		list.add(s);
		
		s = new Ellipse2D.Double(310, 350, 80, 80);
		list.add(s);
		
		
		
		
		s = new Arc2D.Double(110, 550, 80, 80,0,210, Arc2D.OPEN);
		list.add(s);
		
		s = new Arc2D.Double(210, 550, 80, 80,0,210, Arc2D.PIE);
		list.add(s);
		
		s = new Arc2D.Double(310, 550, 80, 80,0,210, Arc2D.CHORD);
		list.add(s);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		GradientPaint gp;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		for(int i = 1;i<4;i++) {
			g2.setColor(Color.RED);
			g2.fill(list.get(i));
		}
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		for(Shape s: list) {
			g2.draw(s);
		}
		
		g2.setColor(Color.GREEN);
		g2.fill(list.get(6));
		
		
		gp = new GradientPaint(110,350,Color.WHITE, 190, 430, Color.GREEN);
		//110, 350
		g2.setPaint(gp);
		g2.fill(list.get(8));
		g2.draw(list.get(8));
		
		gp = new GradientPaint(250,390,Color.WHITE, 290, 430, Color.GREEN);
		//110, 350
		g2.setPaint(gp);
		g2.fill(list.get(9));
		g2.draw(list.get(9));
		
		g2.setColor(Color.BLUE);
		g2.fill(list.get(13));
		g2.draw(list.get(13));
		
		
		gp = new GradientPaint(110,550,Color.WHITE, 160, 600, Color.RED);
		// new GradientPaint(JFrame의 시작 x, JFrame의 시작 y, 처음 색, JFrame의 끝 x, JFrame의 끝 y, 끝 색);
		g2.setPaint(gp);
		g2.fill(list.get(12));
		g2.setColor(Color.BLUE);
		g2.draw(list.get(12));
		
		
		g2.setColor(Color.BLUE);
		g2.fill(list.get(14));
		g2.draw(list.get(14));
//		for(int i = 10;i<16;i++) {
//			g2.setColor(Color.RED);
//			g2.fill(list.get(i));
//		}
	}
}