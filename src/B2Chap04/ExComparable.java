package B2Chap04;
import java.lang.*;
import java.util.Collections;
import java.util.ListIterator;
import java.util.ArrayList;

class Student implements Comparable{
	
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
	public int compareTo(Object obj)
	{
		Student s=(Student) obj;
		if(this.marks > s.getMarks())
			return 1;
		else if(this.marks < s.getMarks())
				return -1;
		else
			return 0;
	}
	public String toString()
	{
		StringBuffer buffer=new StringBuffer();
		buffer.append("Name: "+name+"\n");
		buffer.append("Marks: "+marks+"\n");
		return buffer.toString();
	}
}
public class ExComparable
{
	public static void main(String args[])
	{
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
		Collections.sort(obj);
		System.out.println("Student details after sorting are:");
		
		ListIterator li2=obj.listIterator();
		while(li2.hasNext())
		{
			System.out.println(li2.next());
		}
	}
}
