package B2Chap02;

import java.text.*;
import java.util.*;
//page no:2.13
public class ExLocalizingCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
		String formatted=nft.format(1000000);
		System.out.println(formatted);
	}

}
