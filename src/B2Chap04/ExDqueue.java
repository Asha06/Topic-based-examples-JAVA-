package B2Chap04;
import java.util.*;
import java.util.Iterator;

public class ExDqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Chennai");
		dq.add("Delhi");
		dq.add("Calcutta");
		dq.add("Mumbai");
		
		Iterator itr=dq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("\nAfter the removal");
		itr=dq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		dq.addFirst("Madhurai");
		dq.addLast("Cochi");
		System.out.println("\nAfter adding");
		itr=dq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
