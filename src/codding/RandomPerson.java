package codding;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class RandomPerson extends JFrame implements ActionListener{
	private JLabel[] labelList = new JLabel[21];
	private Font font1 = new Font("돋움", Font.BOLD, 40);
	private Font font2 = new Font("돋움", Font.PLAIN, 30);
	private JLabel label1 = new JLabel("당첨자");
	private JLabel label2 = new JLabel("참가자");
	private JTextField tf = new JTextField("입력하세요",20);
	private JPanel tPanel = new JPanel();
	private JPanel mPanel = new JPanel();
	private JPanel mPanel2 = new JPanel();
	private JButton plus = new JButton("추가");
	private JButton minus = new JButton("빼기");
	private JButton rand = new JButton("뽑기");
	public RandomPerson(){
		Border tBorder = BorderFactory.createTitledBorder("준비실");
		Border mBorder = BorderFactory.createTitledBorder("돌려돌려!");
		Border mBorder2 = BorderFactory.createTitledBorder("대기실");
		setSize(700,700);
		setTitle("랜덤 사람 뽑기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		tPanel.setBorder(tBorder);
		mPanel.setBorder(mBorder);
		mPanel2.setBorder(mBorder2);
		
		plus.addActionListener(this);
		minus.addActionListener(this);
		rand.addActionListener(this);
		
		
		this.add(tPanel, BorderLayout.NORTH);
		mPanel.add(label1);
		mPanel.setLayout(new GridLayout(5,0));
		label1.setFont(font1);
		tPanel.add(tf);
		tPanel.add(plus);
		tPanel.add(minus);
		tPanel.add(rand);
		
		this.add(mPanel2, BorderLayout.WEST);
		mPanel2.add(label2);
		mPanel2.setLayout(new GridLayout(0,2));
		for(int i = 0;i<labelList.length;i++) {
			labelList[i] = new JLabel();
			mPanel2.add(labelList[i]);
		}
		label2.setFont(font1);
		this.add(mPanel);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomPerson();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str= tf.getText();
		str = str.replaceAll(" ", "");
		System.out.println(str);
		if(e.getSource()==plus) {
			if(str.equals(null)||str.equals(""))
				return;
			for(int i = 1;i<labelList.length;i++) {
				if(labelList[i].getText().equals("")) {
					labelList[i].setText(str);
					break;
				}
			}
		}else if(e.getSource()==minus) {
			for(int i = labelList.length-1;i>0;i--) {
				if(!labelList[i].getText().equals("")) {
					labelList[i].setText("");
					break;
				}
			}
		}else{
			
			ArrayList<JLabel> list = new ArrayList<>();
			ArrayList<Integer> intList = new ArrayList<>();
			
			for(int j = 0;j<labelList.length;j++) {
				if(!labelList[j].getText().equals("")) {
					list.add(labelList[j]);
					intList.add((int)(Math.random()*100));
				}
			}
			
			for(int i = 0;i<3;i++) {
				for(int j = 0;j<labelList.length;j++) {
					if(!labelList[j].getText().equals("")) {
						list.set(j,labelList[j]);
						intList.set(j,(int)(Math.random()*100));
					}
				}
				
				boolean find = true;
				while(find) {
					
					for(int j=0;j<labelList.length-1;j++) {
						if(j == labelList.length-1) {
							find = false;
							break;
						}
						if(intList.get(i)<intList.get(i+1)) {
							int a = intList.get(i);
							intList.set(i, intList.get(i+1));
							intList.set(i+1, a);
							JLabel newb = list.get(i);
							list.set(i, list.get(i+1));
							list.set(i+1, newb);
							j=0;
						}
						
					}
				}
			}
			
			for(int i = 0;i<list.size();i++) {
				if(i==5)
					break;
				mPanel.add(list.get(i));
			}
		}
	}

	
}
