package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter FirstName:");
		String firstName = s.nextLine();

		if(Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}

		System.out.println("enter SecondName:");
		String lastName = s.nextLine();

		if(Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}

	}

}
