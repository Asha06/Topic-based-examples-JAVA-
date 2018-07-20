package Chap3;

public class ExBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=20)
		{
			if(i==5)
				break;
			else
			{
				System.out.println("i="+i);
				i++;
			}
		}
	}

}
