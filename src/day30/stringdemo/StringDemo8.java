package day30.stringdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo8 {

	public static void main(String[] args) {
		StringDemo8 obj = new StringDemo8();
		System.out.println(obj.isYes("Yes"));
		System.out.println(obj.isYes("yes"));
		System.out.println("=================");
		System.out.println(obj.IsYesOrNo("Yes"));
		System.out.println(obj.IsYesOrNo("yes"));
		System.out.println(obj.IsYesOrNo("No"));
		System.out.println(obj.IsYesOrNo("no"));
		System.out.println("********************");
		System.out.println(obj.IsString("H"));
		System.out.println(obj.IsString("1"));
		System.out.println("========================");
		System.out.println(obj.validatePassword("abc123"));
		System.out.println(obj.validatePassword("Abc@1234"));
		System.out.println("******************************");
		System.out.println(obj.isNumber("aaa"));
		System.out.println(obj.isNumber("11"));
		
	}

	public boolean isYes(String s) {
		boolean result = s.matches("[Y|y]es");
		return result;
	}

	public boolean IsYesOrNo(String s) {
		return s.matches("[Y|y]es|[N|n]o");
	}

	public boolean IsString(String s) {
		return s.matches("[0-9]");
	}
	
	public boolean validatePassword(String password) {
		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(password);
		return m.matches();
	}

	public boolean isNumber(String s) {
		Pattern pattern = Pattern.compile(".*\\D.*");
		Matcher m = pattern.matcher(s);
		return m.matches();
		
	}
}
