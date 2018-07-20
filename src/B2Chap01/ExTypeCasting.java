package B2Chap01;

public class ExTypeCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Implicit conversion
	int x=100;
	double y=x;
	
	//Explicit conversion
	double a=100.89;
	int b=(int)a;
	//Explicit conversion from String to integer
	String str="100";
	int st=Integer.parseInt(str);
	
	System.out.println(+y);
	System.out.println(+b);
	System.out.println(+st);
	}

}
