package codding;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class QFunction extends JFrame{
	public QFunction(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,700);
		setTitle("Quadratic Function");
		setLocationRelativeTo(null);
		setResizable(false);
		JPanel panel = new MyPanel();
		
		this.add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QFunction();
	}
	class MyPanel extends JPanel implements ActionListener{
		JTextField a, b, c;
		double A, B, C;
		MyPanel (){
			a = new JTextField("1.0", 10);
			b = new JTextField("-5.0", 10);
			c = new JTextField("6.0", 10);
			add(a);
			add(b);
			add(c);
			JButton button = new JButton("DRAW");
			add(button);
			button.addActionListener(this);
			repaint();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			A = Double.parseDouble(a.getText());
			B = Double.parseDouble(b.getText());
			C = Double.parseDouble(c.getText());
			repaint();
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			g2.drawLine(0, 350, 700, 350);
			g2.drawLine(350, 0, 350, 700);
			g2.setPaint(Color.red);
			for(int i = -100;i<100;i++) {
				double x = i/5;
				double y = (A*x*x-B*x+C)/5;
				g2.fillOval((int)(350+x), (int)(350-(y)), 3, 3);
			}
		}
	}
}
