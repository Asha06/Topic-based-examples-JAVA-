package Chap8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExEventHandler extends JFrame implements ActionListener {
	JButton click;
	JPanel panel;
	JLabel message;
	
	public ExEventHandler()
	{
		super("Action Event Demo");
		click=new JButton("click");
		panel=new JPanel();
		message=new JLabel();
		
		add(panel);
		panel.add(click);
		panel.add(message);
		
		setSize(300,300);
		setVisible(true);
		
		click.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		message.setText("Welcome to Event Handling in Java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExEventHandler obj=new ExEventHandler();
	}

}
