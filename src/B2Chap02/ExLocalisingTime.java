package B2Chap02;
//page no:2.13
import java.text.*;
import java.util.*;

public class ExLocalisingTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("de","DE"));
		String time=df.format(new Date());
		System.out.println(time);
	}
}
