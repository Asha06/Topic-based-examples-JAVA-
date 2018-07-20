package Chap3;
import java.util.Scanner;

public class ExSwitch1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char ch;
		System.out.println("Enter a char:");
		ch=in.next().charAt(0);
		switch(ch)
		{
		case 'A':		
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println("UPPER CASE VOWEL");
			break;
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println("lower case vowel");
			break;
		default:System.out.println("Not a Vowel");
			break;
		}
		
	}
}
