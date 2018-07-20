package B2Chap04;
import java.util.*;

//Doubt???
//Example for Hash Map(pgNo:4.16)
public class ExMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(new Integer(101),"Arun");
		mp.put(new Integer(102),"Suresh");
		mp.put(new Integer(105),"Sunil");
		mp.put(new Integer(104),"Arun");
		
		System.out.println(mp.size());
		Set s=mp.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry)it.next();
			int key=(Integer)m.getKey();
			String value=(String)m.getValue();
			System.out.println("Student no is:"+key+"\tName is:"+value);
		}
	}
}
