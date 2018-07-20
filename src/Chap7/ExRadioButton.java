package Chap7;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ExRadioButton extends JFrame{
	JPanel jp;
	JRadioButton male,female;
	ButtonGroup bg;
	
	public ExRadioButton()
	{
		jp=new JPanel();
		
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		
		bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		jp.add(male);
		jp.add(female);
		
		setTitle("JRadioButton Demo");
		setVisible(true);
		setSize(300,200);
		add(jp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExRadioButton robj=new ExRadioButton();
	}

}
