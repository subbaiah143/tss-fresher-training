package com.tss.utilities;

import java.util.regex.*;

public class StringUtil {
	/**
	 * To validate given string data is valid phone number or not
	 * @param s
	 * @return boolean
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-22
	 */
	public static boolean validatePhone(String s) throws Exception  {
		if (s == null) {
			throw new Exception("Phone cannot be null");
		}
		Pattern p = Pattern.compile("^(\\+91)?[6-9][0-9]{2}[\\-]?[0-9]{3}[\\-]?[0-9]{4}$");
		Matcher m = p.matcher(s);
		return m.matches();
	}
}
