package B2Chap04;

import java.util.*;
//Tree map gives in an Ordered Sequence(however the data might be entered)
public class ExTreeMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp=new TreeMap<Integer,String>();
		mp.put(new Integer(101),"Arun");
		mp.put(new Integer(1022),"Suresh");
		mp.put(new Integer(108),"Sunil");
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
		mp.remove(1022);
		System.out.println("After Removing");
		it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry)it.next();
			int key=(Integer)m.getKey();
			String value=(String)m.getValue();
			System.out.println("Student no is:"+key+"\tName is:"+value);
		}
		mp.put(new Integer(106),"Ashok");
		System.out.println("After Adding");
		it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry)it.next();
			int key=(Integer)m.getKey();
			String value=(String)m.getValue();
			System.out.println("Student no is:"+key+"\tName is:"+value);
		}
	}
}
