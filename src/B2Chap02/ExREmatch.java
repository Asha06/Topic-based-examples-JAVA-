package B2Chap02;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Example to demonstrate use of character class:Page no.2.8
public class ExREmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern myPattern=Pattern.compile("[abc]at");
		Matcher myMatcher=myPattern.matcher("bat");
		boolean myBoolean=myMatcher.matches();
		if(myBoolean)
			System.out.println("Expression Matched");
		else
			System.out.println("Expression not Matched");
	}

}
