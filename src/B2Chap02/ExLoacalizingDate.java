package B2Chap02;
import java.text.DateFormat;
import java.util.*;
//page no:2.12

public class ExLoacalizingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM,new Locale("de","DE"));
		String date=df.format(new Date());
		System.out.println(date);
	}

}
