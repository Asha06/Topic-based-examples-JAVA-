package Chap7;
import javax.swing.JFrame;
public class ExJframe {

	JFrame obj; //JFrame is a Class
	public ExJframe() //Constructor
	{
		obj=new JFrame();
		obj.setTitle("JFrames Demo");
		obj.setVisible(true);
		obj.setSize(500,300);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJframe fobj=new ExJframe();
	}

}
