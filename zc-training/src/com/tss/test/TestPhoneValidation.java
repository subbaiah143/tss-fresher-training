package com.tss.test;

import com.tss.utilities.StringUtil;

public class TestPhoneValidation {
	public static void main(String[] args) throws Exception {
		if(StringUtil.validatePhone("+919154834966")) {
			   System.out.println("given number is vaild");
		   }else {
			   System.out.println("given number is invalid");
		   }
	}
}
