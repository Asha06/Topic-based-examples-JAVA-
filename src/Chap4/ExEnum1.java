package Chap4;

public class ExEnum1 {
	enum Mango{Carrie,Farchild,Haden};
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		for(Mango p:Mango.values())
			System.out.println(p);
	}
}
