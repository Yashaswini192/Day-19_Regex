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

		System.out.println("Enter SecondName:");
		String lastName = s.nextLine();

		if(Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
		System.out.println("Enter Email:");
		String email = s.nextLine();

		if(Pattern.matches("^[A-z]+[a-zA-Z0-9]*[-._]?+[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$", email)){
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}

	}

}
