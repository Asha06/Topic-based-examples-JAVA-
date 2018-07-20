package Chap7;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExGridBagLayout extends JFrame{
	JButton red,blue,green;
	public ExGridBagLayout()
	{
		red=new JButton("Red");
		blue=new JButton("Blue");
		green=new JButton("Green");
		
		setVisible(true);
		setSize(300,300);
		setTitle("GridLayout Demo");
		
		setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		
		c.gridx=0;
		c.gridy=0;
		add(red,c);
		
		c.gridx=1;
		c.gridy=1;
		add(blue,c);
		
		c.gridx=2;
		c.gridy=2;
		add(green,c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExGridBagLayout obj=new ExGridBagLayout();
	}

}
