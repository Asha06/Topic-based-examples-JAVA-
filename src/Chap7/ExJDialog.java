package Chap7;
import javax.swing.JDialog;
public class ExJDialog {
	public class DialogDemo
	{
		JDialog obj;
		public DialogDemo()
		{
			obj=new JDialog();
			obj.setTitle("JDialog Demo");
			obj.setVisible(true);
			obj.setSize(300,150);
		}
	}
	public void main(String[] args) {
		// TODO Auto-generated method stub
		DialogDemo dobj=new DialogDemo();
	}
}

