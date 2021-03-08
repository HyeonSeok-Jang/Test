package codding;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CheckboxDemo extends JFrame{
	private Demo0 demo = new Demo0();
	public CheckboxDemo(){
		setSize(1800,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("학생데모");
		
		this.add(demo);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckboxDemo();
	}

	
}
class Demo0 extends JPanel implements ItemListener{
	private JCheckBox[] checkboxes = new JCheckBox[3];
	private String[] fruits = {"빨강","주황","노랑"};
	private JLabel[] label = new JLabel[3];
	private ImageIcon[] icons = new ImageIcon[3];
	private JPanel panel = new JPanel();
	public Demo0() {
		this.setLayout(new GridLayout(0,4));
		panel.setLayout(new GridLayout(3,0));
		this.add(panel);
		for(int i = 0;i<fruits.length;i++) {
			checkboxes[i] = new JCheckBox(fruits[i]);
			checkboxes[i].addItemListener(this);
			panel.add(checkboxes[i]);
		}
		
		for(int i = 0;i<label.length;i++) {
			label[i] = new JLabel();
			label[i].setText(fruits[i]);
			this.add(label[i]);
			icons[i] = new ImageIcon("슬라임_"+(i+1)+"_normal.png");
			
		}
		icons[1] = new ImageIcon("슬라임_2_normal.gif");
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object cb = e.getItemSelectable();
		for(int i = 0;i<fruits.length;i++) {
			if(cb==checkboxes[i]) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					label[i].setIcon(icons[i]);
					label[i].setText("");
				}else {
					label[i].setIcon(null);
					label[i].setText(fruits[i]);
				}
			}
		}
	}
}