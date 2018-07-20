package Chap4;

public class exStringFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Welcome";
		String str2=" to Niit";
		StringBuilder str3=new StringBuilder("Welcome");
		String str4="Welcome";
		String str5="Welcome to niit";
		System.out.println("String Length:"+str1.length());
		System.out.println("String Concatenation:"+str1.concat(str2));
		System.out.println("Append Strings:"+str3.append(str2));
		System.out.println("Character at Func:"+str1.charAt(4));
		System.out.println("Index Function:"+str1.indexOf('e'));
		System.out.println("Last index func:"+str1.lastIndexOf('e'));
		System.out.println("Replace e to a:"+str1.replace('e','a'));
		System.out.println("Check weather two strings are equal:"+str1.equals(str4));
		System.out.println("Compare strings & egnore case"+str1.equalsIgnoreCase(str2));
		System.out.println("prints from Substring 3:"+str5.substring(3));
		System.out.println("To upper case:"+str5.toUpperCase());
		System.out.println("To Lower case:"+str5.toLowerCase());
		System.out.println("To upper case from a particular substring:"+str5.substring(3).toUpperCase());
		}

}
