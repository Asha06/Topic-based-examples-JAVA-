package B2Chap05;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class ExThreadByImplmntRunnable implements Runnable{
	JTextField tf;
	JLabel l;
	JFrame fr;
	public void run(){
		buildGUI();
	}
	void display(){
		for(int i=6; i>=0; i--)
		{
			try{
				Thread.sleep(1000);
				String s=Integer.toString(i);
				tf.setText("    "+s+"seconds to go..");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		JOptionPane.showMessageDialog(fr,  "Times Up !!!!");
		tf.setText("");
		tf.setEnabled(false);
	}
	public void buildGUI(){
		fr=new JFrame("Countdown Timer");
		JPanel p=new JPanel();
		l=new JLabel("");
		tf=new JTextField(15);
		tf.setEnabled(false);
		Font f=new Font("Verdana",0,18);
		tf.setFont(f);
		tf.setBackground(Color.BLACK);
		p.setBackground(Color.blue);
		fr.add(p);
		p.add(tf);
		p.add(l);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(300,100);
		fr.setResizable(false);
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExThreadByImplmntRunnable obj=new ExThreadByImplmntRunnable();
		Thread ExThreadByImplmntRunnable=new Thread(obj);
		ExThreadByImplmntRunnable.start();
	}
}
