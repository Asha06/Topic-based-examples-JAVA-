package Chap7;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class ExJMenu extends JFrame{
	JMenu fileMenu,editMenu,exitMenu;
	JMenuBar menuBar;
	
	public ExJMenu()
	{
		menuBar=new JMenuBar();
		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		exitMenu=new JMenu("Exit");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(exitMenu);
		
		setJMenuBar(menuBar);
		setTitle("JMenu Demo");
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJMenu mobj=new ExJMenu();
	}

}
