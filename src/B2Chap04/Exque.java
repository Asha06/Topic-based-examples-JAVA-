package B2Chap04;
import java.util.Queue;
import java.util.*;
import java.util.Iterator;

public class Exque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qe=new LinkedList<String>();
		qe.add("Chennai");
		qe.add("Mumbai");
		qe.add("Delhi");
		qe.add("Calcutta");
		
		System.out.println("Size of the Queue before peek is:"+qe.size());
		Iterator itr=qe.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("The peek is :"+qe.peek());
		System.out.println("The poll is :"+qe.poll());
		System.out.println("Size of the queue after peek is:"+qe.size());
		itr=qe.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
