package Chap7;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExJPanel extends JFrame {
	JPanel obj;
	public ExJPanel()
	{
		obj=new JPanel();
		setTitle("JPanel Demo");
		setVisible(true);
		setSize(300,200);
		add(obj);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJPanel pobj=new ExJPanel();
	}

}
