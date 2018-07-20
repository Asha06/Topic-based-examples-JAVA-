package B2Chap04;
import java.util.Comparator;
import java.util.Collections;
import java.util.ListIterator;
import java.util.ArrayList;
import java.lang.*;

class Student{
	
	private String name;
	private int marks;
	public Student(String nm,int mk)
	{
		this.name=nm;
		this.marks=mk;
	}
	public int getMarks()
	{
		return marks;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		StringBuffer buffer=new StringBuffer();
		buffer.append("Name: "+name+"\n");
		buffer.append("Marks: "+marks+"\n");
		return buffer.toString();
	}
}
class MarkCompare implements Comparator
{
	public int compare(Object a,Object b)
	{
		Student x=(Student)a;
		Student y=(Student)b;
	
		if(x.getMarks() > y.getMarks())
			return 1;
		else if(x.getMarks() < y.getMarks())
			return -1;
		else
			return 0;
	}
}
class NameCompare implements Comparator
{
	public int compare(Object a,Object b)
	{
		Student x=(Student)a;
		Student y=(Student)b;
	
		return x.getName().compareTo(y.getName());
	}
}	

public class ExComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Alex",88);
		Student s2=new Student("Bob",90);
		Student s3=new Student("Joe",78);
		
		ArrayList<Student> obj=new ArrayList<>();
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		System.out.println("Student details are:");
		
		ListIterator li=obj.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		Collections.sort(obj,new MarkCompare());
		System.out.println("Mark wise sort:");
		
		ListIterator li2=obj.listIterator();
		while(li2.hasNext())
		{
			System.out.println(li2.next());
		}
		
		Collections.sort(obj,new NameCompare());
		System.out.println("Name wise sort:");
		
		ListIterator li3=obj.listIterator();
		while(li3.hasNext())
		{
			System.out.println(li3.next());
		}
	}
}
