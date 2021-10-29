package com.tss.demo;

import com.tss.util.*;

public class RetriveWildCardsInTheGivenString {
	
	public static void main(String[] args) throws Exception {
	
	System.out.println(StringUtil.getWildCards("{{chinna}} hai (dddd) {{22222}}"));
	System.out.println(StringUtil.getWildCards("this is my {{world}}"));
	System.out.println(StringUtil.getWildCards("my {{name}} is {{venkat}}"));
	System.out.println(StringUtil.getWildCards("tss {{software}} {{solution}}"));
	System.out.println(StringUtil.getWildCards("(going) {{to}} {{hydrabad}}"));
	
	}
}
