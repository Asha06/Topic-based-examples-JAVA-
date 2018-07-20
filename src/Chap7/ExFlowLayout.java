package Chap7;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExFlowLayout extends JFrame{
	JButton add,update,delete;
	public ExFlowLayout()
	{
		add=new JButton("Add");
		update=new JButton("Update");
		delete=new JButton("Delete");
		
		setVisible(true);
		setSize(300,300);
		setTitle("FlowLayout Demo");
		
		setLayout(new FlowLayout());
		add(add);
		add(update);
		add(delete);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExFlowLayout obj=new ExFlowLayout();
	}

}
