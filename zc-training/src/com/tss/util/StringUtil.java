package com.tss.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	
	/**
	 * To count the vowels in the given string
	 * @param name
	 * @return int
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-08
	 */
	public static int countVowelInGivenString(String name) throws Exception {
		if (name == null) {
			throw new Exception("Name cannot be null");
		}
		int vowelCount = 0;
		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
	/**
	 * In a string,replace the existence word with new word
	 * @param name
	 * @param replacedWord
	 * @param newWord
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-11
	 */
	public static String replaceString(String name, String replacedWord, String newWord) throws Exception {
		if (name == null || replacedWord == null || newWord == null) {
			throw new Exception("Strings cannot be null");
		}
		return name.replace(replacedWord, newWord);
	}
	
	/**
	 * Retrive the string with substring method
	 * @param name
	 * @param num
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-11
	 */
	public static String subString(String name, int num) throws Exception {
		if (name == null) {
			throw new Exception("Name cannot be null");
		}
		return name.substring(num);
	}

	/**
	 * To checking the given string is palindrome or not
	 * @param data
	 * @return boolean
	 * @author venkata subbaiah
	 * @since 2021-10-11
	 */
	public static boolean isPalindrome(String data) throws Exception {
		if (data == null) {
			new Exception("String  cannot be null");
		}
		String reverse = "";
		for (int i = data.length() - 1; i >= 0; i--) {
			reverse += data.charAt(i);
		}
		return data.equalsIgnoreCase(reverse);
	}
	
	/**
	 * Retrive the extension in the given string
	 * @param filePath
	 * @return string
	 * @author venkata subbaiah
	 * @since 2021-10-12
	 */
	public static String getFileExtension(String filePath) throws Exception {
		if (filePath == null) {
			new Exception("Name cannot be null");
		}
		int index = filePath.lastIndexOf('.');
		String extension = "";
		if (index > 0) {
			extension = filePath.substring(index + 1);
		}
		return extension;
	}
	
	/**
	 * Retrive the string with out substring method
	 * @param s
	 * @param inital
	 * @param end
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-13
	 */
	public static String withOutSubString(String s, int inital, int end) throws Exception {
		if (s == null) {
			throw new Exception("String cannot be null");
		}
		String newStr = "";
		for (int i = inital; i < end; i++) {
			newStr += String.valueOf(s.charAt(i));
		}
		return newStr;
	}
	
	/**
	 * To remove extra spaces in the given string
	 * @param string
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-13
	 */
	public static String removeSpaces(String s) throws Exception {
		if (s == null) {
			throw new Exception("Name cannot be null");
		}
		return s.replaceAll("\\s", "").trim();
	}

	/**
	 * To count char values in the given string
	 * @param data
	 * @param value
	 * @return int
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static int charactersCount(String data, char value) throws Exception {
		if (data == null) {
			throw new Exception("Name cannot be null");
		}
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == value) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * To generate characters by the given number of times
	 * @param num
	 * @param value
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static String generateCharacters(int num, char value) throws Exception {
		if (num < 0) {
			throw new Exception("Count value should be greater than 0");
		}
		return new String(new char[num]).replaceAll("\0", value + "");
	}
	
	/**
	 * To print repeated char value with the given number of times by using Recursion
	 * @param value
	 * @param num
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static String repeatCharactersByRecursion(char value, int num) throws Exception {
		if (num < 0) {
			throw new Exception("Num value should be greater than 0");
		}
		String str = "";
		if (num == 0)
			return "";
		return str = str + (value + repeatCharactersByRecursion(value, num - 1));
	}
	
	/**
	 * To print repeated char value with the given number of times by using for loop
	 * @param value
	 * @param num
	 * @return string
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static String repeatCharactersByLoops(char value, int num) throws Exception {
		if (num < 0) {
			throw new Exception("Num value should be greater than 0");
		}
		String str = "";
		for (int i = 1; i <= num; i++) {
			str = str + value;
		}
		return str;
	}
	
	/**
	 * To count vowels with out duplicates
	 * @param string
	 * @return int
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-19
	 */
	public static int countVowelsWithOutDuplicate(String s) throws Exception {
		if (s == null) {
			throw new Exception("String cannot be null");
		}
		s = s.toLowerCase();
		int l = s.length();
		String Vow = "aeiou";
		String sb = "";
		char ch;
		for (int i = 0; i < l; i++) {
			ch = s.charAt(i);
			if (Vow.contains(Character.toString(ch)) && !(sb.contains(Character.toString(ch)))) {
				sb = sb + ch;
			}
		}
		return sb.length();
	}
	
	/**
	 * sort the given string in the alphabaical order
	 * @param data
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static String sortCharacters(String data) throws Exception {
		if (data == null) {
			throw new Exception("String cannot be null");
		}
		char[] arr = data.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return new String(arr);
	}
	
	/**
	 * To remove special cahracters in the given string
	 * @param name
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static String removeSpecialCharacter(String name) throws Exception {
		if (name == null) {
			throw new Exception("Name cannot be null");
		}
		return name.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	/**
	 * To remove duplicate characters in the given string
	 * @param s
	 * @return StringBuilder
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static StringBuilder removeDuplicateCharacters(String s) throws Exception {
		if (s == null) {
			throw new Exception("String cannot be null");
		}
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb.append(arr[i]);
			}
		}
		return sb;
	}
	
	/**
	 * Checking the given two Strings are anagram or not
	 * @param primaryS
	 * @param secondaryS
	 * @return boolean
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static boolean isAnagram(String primaryS, String secondaryS) throws Exception {
		if (primaryS == null || secondaryS == null) {
			throw new Exception("Strings cannot be null");
		}
		primaryS = primaryS.replaceAll("\\s", "");
		secondaryS = secondaryS.replaceAll("\\s", "");
		if (primaryS.length() != secondaryS.length()) {
			return false;
		} else {
			char[] firstStringArr = primaryS.toCharArray();
			char[] secondStringArr = secondaryS.toCharArray();
			Arrays.parallelSort(firstStringArr);
			Arrays.parallelSort(secondStringArr);
		}
		long[] firstStringArr = null, secondStringArr = null;
		return Arrays.equals(firstStringArr, secondStringArr);
	}
	
	/**
	 * To count the occurance of each character in a given string
	 * @param s
	 * @return map
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static Map<Character, Integer> occuranceEachCharacter(String s) throws Exception {
		if (s == null) {
			throw new Exception("String cannot be null");
		}
		s = s.replace(" ", "");
		char arr[] = s.toCharArray();
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);
		}
		return map;
	}
	
	/**
	 * To reverse each word in the given string
	 * @param s
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static String reverseWords(String s) throws Exception {
		if (s == null) {
			throw new Exception("String cannot be null");
		}
		String reversedWords = "";
		String[] words = s.split(" ");
		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			reversedWords = reversedWords + revWord + " ";
		}
		return reversedWords;
	}
	
	/**
	 * To count the number of words in the given string
	 * @param s
	 * @return int
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static int wordsCount(String s) throws Exception {
		if (s == null) {
			throw new Exception("String cannot be null");
		}
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * To capitalize the each word in a given string
	 * @param s
	 * @return string
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-21
	 */
	public static String wordsCapitalization(String s) throws Exception {
		if (s == null) {
			throw new Exception("String cannot be null");
		}
		s = " " + s;
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				str = str + ch;
				i++;
				ch = s.charAt(i);
				str = str + Character.toUpperCase(ch);
			} else {
				str = str + ch;
			}
		}
		return str = str.trim();
	}

	/**
	 * To validate given string data is valid phone number or not
	 * @param phoneNum
	 * @return boolean
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-26
	 */
	public static boolean validatePhone(String phoneNum) throws Exception {
		if (phoneNum == null) {
			throw new Exception("Phone cannot be null");
		}
		Pattern p = Pattern.compile("^(((\\(\\+91\\))|(\\+91)|0)?[\\s]?[\\-]?\\(?[6-9]\\d{2}\\)?[\\s]?[\\-]?\\(?\\d{3}\\)?[\\s]?[\\-]?\\(?\\d{4}\\)?|\\(?[6-9]\\d{4}\\)?[\\s]?[\\-]?\\(?\\d{5}\\)?)$");
		Matcher m = p.matcher(phoneNum);
		return m.matches();
	}
	
	/**
	 * To validate given emailid is valid emailid or not
	 * @param emailId
	 * @return boolean
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-25
	 */
	public static boolean validateEmail(String emailId) throws Exception {
		if (emailId == null) {
			throw new Exception("Email cannot be null");
		}
		Pattern p = Pattern.compile("^[A-Za-z][A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[A-Za-z]+(\\.[A-Za-z]{2,})$");
		Matcher m = p.matcher(emailId);
		return m.matches();
	}
}
