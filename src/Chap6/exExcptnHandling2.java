package Chap6;

public class exExcptnHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,30,40,50};
		try{
		System.out.println(+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception:" +e);
		}
		
		System.out.println("This is after exception");
		

	}

}
