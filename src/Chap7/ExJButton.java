package Chap7;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExJButton extends JFrame{
		JPanel jp;
		JButton submit,cancel;
		
		public ExJButton()
		{
			jp=new JPanel();
			submit=new JButton("Submit");
			cancel=new JButton("Cancel");
			
			jp.add(submit);
			jp.add(cancel);
			
			setTitle("JButton Demo");
			setVisible(true);
			setSize(300,200);
			add(jp);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJButton bobj=new ExJButton();
	}

}
