package Chap3;

public class ExContinue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			if(i%5==0)
				continue;
			else
				System.out.println("i="+i);
		}
	}
}
