package B2Chap01;
//Example for annanonymous Inner Class
abstract class person{
	abstract void eat();
}

public class Exanon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person()
		//Annaonymous class:without class name
		{
			void eat()
			{
				System.out.println("nice fruits");
			}
			
	};
		p.eat();
	}
}

