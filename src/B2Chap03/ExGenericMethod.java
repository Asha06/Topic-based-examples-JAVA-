package B2Chap03;

//Page no:3.5
public class ExGenericMethod {
	public <M> M display(M val){
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExGenericMethod obj=new ExGenericMethod();
		System.out.println("The generic method is called with String value: "+obj.display("Test"));
		System.out.println("The generic method is called with Double value: "+obj.display("7.5"));
		System.out.println("The generic method is called with Boolean value: "+obj.display("True"));
		System.out.println("The generic method is called with Integer value: "+obj.display("10"));
	}
}
