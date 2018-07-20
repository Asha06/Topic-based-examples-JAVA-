package Chap5;

public class exAbstract1 extends exAbstarct{
	void print(){
		System.out.println("This is inside print method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exAbstract1 obj=new exAbstract1();
		obj.get();
		obj.print();
	}

}
