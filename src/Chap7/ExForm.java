package Chap7;
import javax.swing.*;
import java.awt.Color;

public class ExForm extends JFrame{
	JLabel form,name,number,addr,gender,phno,hobbies,country;
	JFrame jf;
	JTextField name1,number1,addr1,phno1;
	JRadioButton male,female;
	ButtonGroup bg;
	JCheckBox h1,h2,h3;
	JList list;
	DefaultListModel dlist;
	
	public ExForm()
	{
		jf=new JFrame();
		form=new JLabel("FORM");
		name=new JLabel("Name");
		number=new JLabel("Number");
		addr=new JLabel("Address");
		phno=new JLabel("PhoneNo");
		gender=new JLabel("Gender");
		hobbies=new JLabel("Hobbies");
		country=new JLabel("Country");
		
		name1=new JTextField();
		number1 =new JTextField();
		addr1 = new JTextField();
		phno1 = new JTextField();
		
		list=new JList();
		dlist=new DefaultListModel();
		
		jf.setLayout(null);
		
	
		list.setSelectedIndex(0);

		dlist.addElement("California");
		dlist.addElement("India");
		dlist.addElement("Japan");
		dlist.addElement("New York");
		list.setModel(dlist);
		
		form.setForeground(Color.GREEN);
		form.setBounds(250,20,100,100);
		
		name.setForeground(Color.BLUE);
		name.setBounds(50,70,80,80);
	
		number.setForeground(Color.BLUE);
		number.setBounds(50,100,80,80);
		
		addr.setForeground(Color.BLUE);
		addr.setBounds(50,130,80,80);
		
		phno.setForeground(Color.BLUE);
		phno.setBounds(50,160,80,80);
		
		gender.setForeground(Color.BLUE);
		gender.setBounds(50,190,80,80);
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		hobbies.setForeground(Color.BLUE);
		hobbies.setBounds(50,220,80,80);
		h1=new JCheckBox("Sports");
		h2=new JCheckBox("Drawing");
		h3=new JCheckBox("Sketching");
		
		country.setForeground(Color.BLUE);
		country.setBounds(50,250,100,80);
		list.setBounds(150,280,100,150);
		
		
		
		name1.setBounds(150,100,60,20);
		number1.setBounds(150,130,60,20);
		addr1.setBounds(150,160,60,20);
		phno1.setBounds(150,190,60,20);
		
		male.setBounds(150,220,100,30);
		female.setBounds(250,220,100,30);
		
		h1.setBounds(150,250,100,30);
		h2.setBounds(250,250,100,30);
		h3.setBounds(350,250,100,30);
		
		list.setBounds(150,280,100,30);
		
		jf.add(form);
		jf.add(name);
		jf.add(number);
		jf.add(addr);
		jf.add(gender);
		jf.add(phno);
		jf.add(hobbies);
		jf.add(country);
		
		jf.add(name1);
		jf.add(number1);
		jf.add(addr1);
		jf.add(phno1);
		
		jf.add(male);
		jf.add(female);
		
		jf.add(h1);
		jf.add(h2);
		jf.add(h3);
		
		jf.add(list);
		
		jf.setVisible(true);
		jf.setSize(600,900);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExForm pd=new ExForm();
	}
}
