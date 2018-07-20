package Chap7;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExJLabel extends JFrame{
	JPanel jPanel;
	JLabel firstname,lastname;
	
	public ExJLabel()
	{
		jPanel=new JPanel();
		firstname=new JLabel("First Name");
		lastname=new JLabel("Last Name");
		
		jPanel.add(firstname);
		jPanel.add(lastname);
		
		firstname.setForeground(Color.BLUE);
		lastname.setForeground(Color.GREEN);
		
		setTitle("JLabel Demo");
		setVisible(true);
		setSize(400,300);
		add(jPanel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJLabel pd=new ExJLabel();
	}

}
