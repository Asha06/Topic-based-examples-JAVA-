package B2Chap01;
//Example for Regular Inner Class
import java.util.Scanner;
public class ExRegular {
	 private String uName;
	 private String passwd;
	 Scanner in=new Scanner(System.in);
	 class Inside{
		void validate()
		{
			
			System.out.println("Enter the password");
			passwd =in.next();
			if(passwd.equalsIgnoreCase("niit"))
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExRegular obj=new ExRegular();
		
		ExRegular.Inside cobj=obj.new Inside();
		cobj.validate();
	}
}

