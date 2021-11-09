package com.tss.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	
	/**
	 * To count the vowels in the given string
	 * @param data
	 * @return int
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-08
	 */
	public static int countVowelInGivenString(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		int count = 0;
		data = data.toLowerCase();
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'a' || data.charAt(i) == 'e' || data.charAt(i) == 'i' || data.charAt(i) == 'o'
					|| data.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * In a string,replace the existence word with new word
	 * @param source
	 * @param target
	 * @param replaced
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-11
	 */
	public static String replaceString(String source, String target, String replaced) throws Exception {
		if (source == null || target == null || replaced == null) {
			throw new Exception("Source cannot be null");
		}
		return source.replace(target, replaced);
	}
	
	/**
	 * Retrive the string with substring method
	 * @param source
	 * @param num
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-11
	 */
	public static String subString(String source, int num) throws Exception {
		if (source == null) {
			throw new Exception("Source cannot be null");
		}
		return source.substring(num);
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
			new Exception("Data cannot be null");
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
			new Exception("filePath cannot be null");
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
	 * @param source
	 * @param inital
	 * @param end
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-13
	 */
	public static String subStringWithOutBuiltInMethods(String source, int inital, int end) throws Exception {
		if (source == null) {
			throw new Exception("Source cannot be null");
		}
		String s = "";
		for (int i = inital; i < end; i++) {
			s += String.valueOf(source.charAt(i));
		}
		return s;
	}
	
	/**
	 * To remove extra spaces in the given string
	 * @param string
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-13
	 */
	public static String removeSpaces(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		return data.replaceAll("\\s", "").trim();
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
	public static int countToTheGivenCharacter(String data, char value) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
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
	public static String generateStringWithGivenCharacter(int num, char value) throws Exception {
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
		String s = "";
		if (num == 0)
			return "";
		return s = s + (value + repeatCharactersByRecursion(value, num - 1));
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
		String s = "";
		for (int i = 1; i <= num; i++) {
			s = s + value;
		}
		return s;
	}
	
	/**
	 * To count vowels with out duplicates
	 * @param string
	 * @return int
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-19
	 */
	public static int countVowelsWithOutDuplicate(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		data = data.toLowerCase();
		String vowels = "aeiou";
		String s = "";

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (vowels.contains(Character.toString(ch)) && !(s.contains(Character.toString(ch)))) {
				s = s + ch;
			}
		}
		return s.length();
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
			throw new Exception("Data cannot be null");
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
	 * @param data
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static String removeSpecialCharacter(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		return data.replaceAll("[^a-zA-Z0-9]", "");
	}
	
	/**
	 * To remove duplicate characters in the given string
	 * @param data
	 * @return StringBuilder
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static StringBuilder removeDuplicateCharacters(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		char[] arr = data.toCharArray();
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
	 * @param data
	 * @return map
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static Map<Character, Integer> occuranceEachCharacter(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		data = data.replace(".", "");
		char arr[] = data.toCharArray();
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
	 * @param data
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static String stringWithReversedWords(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		String stringReversedWords = "";
		String[] words = data.split(" ");
		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			stringReversedWords = stringReversedWords + revWord + " ";
		}
		return stringReversedWords;
	}
	
	/**
	 * To count the number of words in the given string
	 * @param data
	 * @return int
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */ 
	public static int wordsCount(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		int count = 0;
		for (int i = 0; i < data.length() - 1; i++) {
			if ((data.charAt(i) == ' ') && (data.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * To capitalize the each word in a given string
	 * @param data
	 * @return string
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-21
	 */
	public static String wordsCapitalization(String data) throws Exception {
		if (data == null) {
			throw new Exception("String cannot be null");
		}
		data = " " + data;
		String str = "";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch == ' ') {
				str = str + ch;
				i++;
				ch = data.charAt(i);
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
	
	/**
	 * To retrive the wildcards in the given string
	 * @param data
	 * @return List
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-29
	 */
	public static List<String> getWildCards(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		int start = 0;
		int end = 0;
		boolean flag = true;
		List<String> list = new ArrayList<>();
		while (flag) {
			start = data.indexOf("{{", start);
			end = data.indexOf("}}", end);
			list.add(data.substring(start + 2, end));
			start = end;
			end += 2;
			if (data.indexOf("{{", start) < 0) {
				break;
			}
		}
		return list;
	}
	
	/**
	 * Checking given string is integer or not
	 * @param data
	 * @return boolean
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-11-01
	 */
	public static boolean isNumber(String data) throws Exception {
		if (data == null)
			throw new Exception("Data cannot be null");
		for (int i = 0; i < data.length(); i++)
			if (Character.isDigit(data.charAt(i)) == false)
				return false;
		return true;
	}
	
	/**
	 * To validate given password is valid or not.
	 * Password length should be in the range of 8 to 12 characters.
	 * Standard password should contain (//?.,!_-~$%+=) only these special characters
	 * @param data
	 * @return boolean
	 * @throws Exception
	 * @author venkata subbaiah                                                  
	 * @since 2021-11-01
	 */
	public static boolean isValidPassword(String data) throws Exception {
		if (data == null) {
			throw new Exception("Password cannot be null");
		}
		Pattern par = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\$\\%\\!\\.\\,\\-\\_\\~\\+\\=])(?=\\S+$).{8,12}$");
		Matcher mat = par.matcher(data);
		return mat.matches();
	}
	
	/**
	 * To generate OTPs by the given number of int values
	 * @param num
	 * @return char[]
	 * @author venkata subbaiah
	 * @throws Exception 
	 * @since 2021-11-01
	 */
	public static int[] otpGenerator(int num) throws Exception {
		if (num < 0) {
			throw new Exception("Num value should be greater than 0");
		}
		int[] arr = new int[num];
		int min = 1000, max = 9999;
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			arr[i] = random.nextInt((max - min) + 1) + min;
		}
		return arr;
	}
	
	/**
	 * Count the characters and sum of digits in the given sting ,
	 * divided the sum of digits with the character count and print final output
	 * example : String = "123jcv";  
	 *           character count=3
	 *           sum of digits  =6
	 *           output=sum of digits/character count=6/3=2
	 * @param data
	 * @return double
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-11-02
	 */
	public static double countTheCharactersAndSumOfDigits(String data) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		int sumOfDigits = 0;
		int charCount = 0;
		for (int i = 0; i < data.length(); i++) {
			if (Character.isAlphabetic(data.charAt(i))) {
				charCount++;
			} else if (Character.isDigit(data.charAt(i))) {
				sumOfDigits = sumOfDigits + Integer.parseInt(String.valueOf(data.charAt(i)));
			}
		}
		double output=sumOfDigits/charCount;
		return  output;
	}
	
	/**
	 * Program to convert the given string into camelCase.
	 * @param data
	 * @return string
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-11-05
	 */
	public static String toCamelCase(String data) throws Exception {
		String output = toPascalCase(data);
		return output.substring(0, 1).toLowerCase() + output.substring(1);
	}
	
	/**
	 * Program to convert the given String into PascalCase.
	 * @param data
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-11-05
	 */
	public static String toPascalCase(String data) throws Exception {
		if (data == null || data.trim().equals("")) {
			throw new Exception("Data cannot be blank");
		}
		String words[] = data.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			char letter = words[i].charAt(0);
			if (!Character.isUpperCase(letter)) {
				sb.append(Character.toUpperCase(letter)).append(words[i].substring(1));
			} else {
				sb.append(words[i].substring(0));
			}
		}
		return  sb.toString().trim();
	}
    
	/**
	 * Program to convert the given String into ToggleCase
	 * @param data
	 * @return string
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-11-05
	 */
	public static String toToggleCase(String data) throws Exception {
		if (data == null || data.trim().equals("")) {
			throw new Exception("Data cannot be blank");
		}
		String words[] = data.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			char letter = word.charAt(0);
			if (!Character.isLowerCase(letter)) {
				sb.append(Character.toLowerCase(letter)).append(word.substring(1).toUpperCase() + " ");
			} else
				sb.append(word.substring(0, 1)).append(word.substring(1).toUpperCase() + " ");
		}
		return sb.toString().trim();
	}
	/**
	 * Write a method which takes three parameters first shoud have source string ,
	 * second should have target string and third should have replaced string ,return string 
	 * @param source
	 * @param target
	 * @param replaced
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception 
	 * @since 2021-11-08
	 */
	public static String replacedCharSequences(String source, String target, String replaced) throws Exception {
		if (source == null || target == null || replaced == null) {
			throw new Exception("Data cannot be blank");
		}
		for (;;) {
			int i = source.indexOf(target);
			if (i == -1) {
				break;
			}
			source = source.substring(0, i) + replaced + source.substring(i + target.length());
		}
		return source;
	}

	/**
	 * To print the indexes of the given character
	 * @param data
	 * @param value
	 * @return string
	 * @author venkata subbaiah
	 * @throws Exception 
	 * @since 2021-11-18
	 */
	public static List<Integer> retriveIndexes(String data, char value) throws Exception {
		if (data == null) {
			throw new Exception("Data cannot be null");
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < data.length() - 1; i++) {
			if (data.charAt(i) == value) {
				list.add(i);
			}
		}
		return list;
	}
}

