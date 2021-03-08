package codding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;

public class RadioDemo extends JFrame implements ActionListener{
	private JRadioButton small, medium, large;
	
	private JPanel topPanel, sizePanel, resultPanel;
	
	private JLabel text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�");
	
	public RadioDemo(){
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("�Ƿ�����");
		setVisible(true);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		 
		topPanel.add(label);
		
		Border border=BorderFactory.createTitledBorder("Ŀ�� ũ��");
		
		sizePanel = new JPanel();
		sizePanel.setBorder(border);
		small = new JRadioButton("small size");
		medium = new JRadioButton("medium size");
		large = new JRadioButton("large size");
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		ButtonGroup group = new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		resultPanel = new JPanel();
		text.setForeground(Color.blue);
		resultPanel.add(text);
		
		this.add(topPanel,BorderLayout.NORTH);
		this.add(sizePanel,BorderLayout.CENTER);
		this.add(resultPanel,BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==small) {
			text.setText("small");
		}else if(e.getSource()==medium) {
			text.setText("medium");
		}else {
			text.setText("large");
		}
		text.setText(text.getText()+"ũ�Ⱑ ���õǾ����ϴ�.");
		
	}
	
}	
