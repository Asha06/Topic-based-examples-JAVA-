package B2Chap02;
import java.util.regex.*;
import java.util.*;

public class ExPatternMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the desired pattern: ");
		String pattern=in.nextLine();
		System.out.println("Enter the text: ");
		String matcher=in.nextLine();
		Pattern myPattern2=Pattern.compile(pattern);
		Matcher myMatcher2=myPattern2.matcher(matcher);
		Boolean myBoolean2=myMatcher2.matches();
		boolean b=myBoolean2;
		if(b == true)
		{
			System.out.println("I found the text:"+myMatcher2.group()+"\n"
						+"Starting at:"+myMatcher2.start()+"\n"
						+"Ending at index:"+myMatcher2.end());
		}
		else if(b == false)
		{
			System.out.println("No match found");
		}
	}

}
