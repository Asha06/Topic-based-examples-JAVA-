package Chap7;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ExJOptionPane extends JFrame{
	public ExJOptionPane()
	{
		setVisible(true);
		setSize(100,100);
		JOptionPane.showConfirmDialog(this,"Do you want to save it?","Confirmation Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJOptionPane obj=new ExJOptionPane();
	}

}
