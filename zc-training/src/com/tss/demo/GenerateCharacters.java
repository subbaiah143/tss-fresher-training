package com.tss.demo;

import com.tss.util.*;

public class GenerateCharacters {
	
	public static void main(String[] args) throws Exception {
		System.out.println(StringUtil.generateStringWithGivenCharacter(3, 'g'));
		System.out.println(StringUtil.generateStringWithGivenCharacter(6, 'a'));
		System.out.println(StringUtil.generateStringWithGivenCharacter(8, 'l'));
		System.out.println(StringUtil.generateStringWithGivenCharacter(5, 'm'));
		System.out.println(StringUtil.generateStringWithGivenCharacter(14, 'x'));
	}
}
