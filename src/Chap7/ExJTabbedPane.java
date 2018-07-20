package Chap7;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class ExJTabbedPane extends JFrame{
	JTabbedPane obj;
	public ExJTabbedPane()
	{
	obj=new JTabbedPane(JTabbedPane.BOTTOM);
	obj.addTab("Tab1",null);
	obj.addTab("Tab2",null);
	obj.setSize(100,100);
	
	this.setTitle("JTabbedPane Demo");
	this.setVisible(true);
	this.setSize(300,200);
	this.add(obj);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJTabbedPane tobj=new ExJTabbedPane();
	}

}
