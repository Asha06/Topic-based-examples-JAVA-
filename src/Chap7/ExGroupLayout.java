package Chap7;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExGroupLayout extends JFrame{
	JButton red,blue,green,black;
	public ExGroupLayout()
	{
		red=new JButton("Red");
		blue=new JButton("Blue");
		green=new JButton("Green");
		black=new JButton("Black");
		
		setVisible(true);
		setSize(300,300);
		setTitle("GroupLayout Demo");
		
		GroupLayout Layout=new GroupLayout(this.getContentPane());
		setLayout(Layout);
		
		Layout.setAutoCreateGaps(true);
		Layout.setAutoCreateContainerGaps(true);
		
		GroupLayout.SequentialGroup sg=Layout.createSequentialGroup();
		GroupLayout.ParallelGroup pg=Layout.createParallelGroup();
		
		pg.addComponent(red);
		pg.addComponent(blue);
		
		GroupLayout.ParallelGroup pg1=Layout.createParallelGroup();
		pg1.addComponent(green);
		pg1.addComponent(black);
		
		sg.addGroup(pg);
		sg.addGroup(pg1);
		
		GroupLayout.SequentialGroup sg1=Layout.createSequentialGroup();
		GroupLayout.ParallelGroup pg3=Layout.createParallelGroup();
		
		pg3.addComponent(red);
		pg3.addComponent(green);
		
		GroupLayout.ParallelGroup pg4=Layout.createParallelGroup();
		pg4.addComponent(blue);
		pg4.addComponent(black);
		
		sg1.addGroup(pg3);
		sg1.addGroup(pg4);
		
		Layout.setHorizontalGroup(sg);
		Layout.setVerticalGroup(sg1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExGroupLayout obj=new ExGroupLayout();
	}
}
