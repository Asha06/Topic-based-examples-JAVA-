package Chap7;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class ExJMenuBar extends JFrame{
	JMenuBar menuBar;
	public ExJMenuBar()
	{
		menuBar=new JMenuBar();
		setTitle("JMenuBar Demo");
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJMenuBar mobj=new ExJMenuBar();
	}

}
