package Chap7;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ExTextArea extends JFrame{
	JPanel jp;
	JTextArea about,exp;
	
	public ExTextArea()
	{
		jp=new JPanel();
		about=new JTextArea(5,20);
		
		jp.add(about);
		setTitle("JTextArea Demo");
		setVisible(true);
		setSize(500,200);
		add(jp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExTextArea tobj=new ExTextArea();
	}

}
