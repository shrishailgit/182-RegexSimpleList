package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {

	public static void main(String args[]) {

		System.out.println("  *********First One EmailValidation *******      ");
		String[] emailvalidation = { "abc@yahoo.com,", "abc@" };

		for (String validemail : emailvalidation) {
			vaildation(validemail);

		}
		System.out.println("**********Second One EmailValidation******** ");
		String[] secondEmailvalidation = { "abc-100@yahoo.com,", "abc100@yahoo.com," };

		for (String secondEmail : secondEmailvalidation) {
			validation2(secondEmail);

		}

		System.out.println("***********Third One EmailValidation**********");
		String[] thridEmailvalidation = { "abc111@abc.com,", "acom," };

		for (String thirdemail : thridEmailvalidation) {
			validation3(thirdemail);

		}

		System.out.println("***********Fourth One EmailValidation**********");
		String[] fourthEmailvalidation = { "abc-100@abc.net,", "acom," };

		for (String fourtdemail : fourthEmailvalidation) {
			validation4(fourtdemail);

		}
	}

	private static void validation4(String fourtdemail) {
		
		Pattern pattern = Pattern.compile( "^([a-z]){3}([-.])([0-9]){3}@([a-z]{3}[-.])([a-z]{3}[-,])*$");
		Matcher matcher1 = pattern.matcher(fourtdemail);

		if (matcher1.matches()) {

			System.out.println(fourtdemail + "----------->vaildEmail");
		} else {
			System.out.println(fourtdemail + "----------->invaildEmail");
		}

		
	}

	private static void vaildation(String validemail) {
		
		Pattern pattern = Pattern.compile("^([a-z]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$");
		Matcher matcher1 = pattern.matcher(validemail);

		if (matcher1.matches()) {

			System.out.println(validemail + "----------->vaildEmail");
		} else {
			System.out.println(validemail + "----------->invaildEmail");
		}

	}

	private static void validation2(String validemail1) {
		
		Pattern pattern = Pattern.compile("^([a-z]){3}([-])([0-9]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$");
		Matcher matcher2 = pattern.matcher(validemail1);

		if (matcher2.matches()) {

			System.out.println(validemail1 + "----------->>vaildEmail");
		} else {
			System.out.println(validemail1 + "---------->invaildEmail");
		}
	}

	private static void validation3(String thirdemail) {
		
		Pattern pattern = Pattern.compile("^([a-z]){3}([0-9]){3}@([a-z]{3}[-.])([a-z]{3}[-,])*$");
		Matcher matcher1 = pattern.matcher(thirdemail);

		if (matcher1.matches()) {

			System.out.println(thirdemail + "----->vaildEmail");
		} else {
			System.out.println(thirdemail + "------>invaildEmail");
		}


	}
}
