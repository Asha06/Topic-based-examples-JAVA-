package Chap7;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class ExJCheckBox extends JFrame{
	JPanel jp;
	JCheckBox h1,h2,h3;
	
	public ExJCheckBox()
	{
		jp=new JPanel();
		h1=new JCheckBox("Music");
		h2=new JCheckBox("Sports");
		h3=new JCheckBox("Pinting");
		
		jp.add(h1);
		jp.add(h2);
		jp.add(h3);
		
		setTitle("JCheckBox Demo");
		setVisible(true);
		setSize(300,200);
		add(jp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJCheckBox cobj=new ExJCheckBox();
	}

}
