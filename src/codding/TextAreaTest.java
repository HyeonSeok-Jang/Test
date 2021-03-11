package codding;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextAreaTest extends JFrame implements KeyListener, ActionListener{
	private JTextArea area = new JTextArea(10, 30);
	private JTextField tf = new JTextField(30);
	private JScrollPane scr = new JScrollPane(area);
	public TextAreaTest(){
		setSize(300, 300);
		setTitle("TextArea");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
//		setResizable(false);
		tf.addKeyListener(this);
		area.setEnabled(false);
//		area.setEditable(false);
		this.add(tf, BorderLayout.NORTH);
//		this.add(area, BorderLayout.CENTER);
		this.add(scr, BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaTest();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
//		area.append(tf.getText()+"\n");
//		tf.selectAll();
//		area.setCaretPosition(area.getDocument().getLength());
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==10) {
			area.setText(area.getText()+tf.getText()+"\n");
			tf.setText("");
//			area.append(tf.getText()+"\n");
//			area.append(tf.getText()+"\n");
//			tf.selectAll();
//			area.setCaretPosition(area.getDocument().getLength());
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
	}
	
}
