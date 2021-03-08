package codding;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.awt.event.*;
import javax.swing.*;

public class ImageLabelTest extends JFrame implements ActionListener{

	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("�̹����� ������ ��ư�� ��������.");
	private JButton button = new JButton("�̹��� ����");
	private ImageIcon icon = new ImageIcon("");
	private boolean onoff = false;
	public ImageLabelTest(){
		setSize(700,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Test");
		
		label.setIcon(icon);
		button.addActionListener(this);
		
		this.add(panel);
		panel.add(label);
		panel.add(button);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageLabelTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(onoff) {
			ImageIcon dog = new ImageIcon("");
			
			label.setIcon(dog);
			label.setText("�ٽ� ��");
			onoff=false;
		}else {
//			ImageIcon dog = new ImageIcon("src/codding/Egg_G_1.png");
			ImageIcon dog = new ImageIcon("Egg_G_1.png");
			File file = new File("Egg_G_1.png");
			
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getPath());
			label.setIcon(dog);
			label.setText(null);
			onoff=true;
		}
		
	}
}
