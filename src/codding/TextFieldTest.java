package codding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldTest extends JFrame implements KeyListener{
	
	private JTextField text = new JTextField(15);
	private JTextField result = new JTextField(15);
	private JPanel panel = new JPanel();
	
	public TextFieldTest(){
		setSize(250, 100);
		setTitle("TextField");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		text.addKeyListener(this);
//		result.setEnabled(false);
		result.setEditable(false);
		
		this.add(panel);
		panel.add(new JLabel("숫자 입력"));
		panel.add(text);
		panel.add(new JLabel("결과 값"));
		panel.add(result);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldTest();
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		try {
			double num = Double.parseDouble(text.getText());
//			num=Math.round(num*num*1000)/1000.0;
			num=Math.round(num*num*10000)/10000.0;
			String str = Double.toString(num);
			
			if(str.charAt(str.length()-1)=='0'&&str.charAt(str.length()-2)=='.') {
				str = str.substring(0, str.length()-2);
			}
			result.setText(str);
		}catch(Exception e1) {
			text.setText("");
			result.setText("");
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}
