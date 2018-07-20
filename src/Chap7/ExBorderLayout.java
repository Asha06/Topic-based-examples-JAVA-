package Chap7;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExBorderLayout extends JFrame{
	JButton reset,add,update,delete;
	public ExBorderLayout()
	{
		reset=new JButton("Reset");
		add=new JButton("Add");
		update=new JButton("Update");
		delete=new JButton("Delete");
		
		setVisible(true);
		setSize(300,300);
		setTitle("BorderLayout Demo");
		
		setLayout(new BorderLayout());
		add(reset,BorderLayout.EAST);
		add(add,BorderLayout.WEST);
		add(update,BorderLayout.NORTH);
		add(delete,BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExBorderLayout obj=new ExBorderLayout();
	}

}
