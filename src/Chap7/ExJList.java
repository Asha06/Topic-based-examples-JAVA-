package Chap7;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

public class ExJList extends JFrame{
	JPanel jp;
	JList list;
	DefaultListModel dlist;
	
	public ExJList()
	{
		jp=new JPanel();
		list=new JList();
		list.setSelectedIndex(0);
		
		dlist=new DefaultListModel();
		dlist.addElement("California");
		dlist.addElement("Flordia");
		dlist.addElement("Montana");
		dlist.addElement("New York");
		dlist.addElement("Oklahoma");
		list.setModel(dlist);
		jp.add(list);
		
		setTitle("JList Demo");
		setVisible(true);
		setSize(300,200);
		add(jp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExJList lobj=new ExJList();
	}

}
