package com.bl.regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner s = new Scanner(System.in);

	public void firstName() {
		//UC1
		System.out.println("Enter FirstName:");
		String firstName = s.nextLine();

		if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	}

		public void secondName() {
			//UC2
			System.out.println("Enter SecondName:");
			String lastName = s.nextLine();

			if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName)) {
				System.out.println("valid");
			}else {
				System.out.println("invalid");
			}
		}

			public void checkEmail() {
				//UC3
				System.out.println("Enter Email:");
				String email = s.nextLine();

				if(Pattern.matches("^[A-z]+[a-zA-Z0-9]*[-._+/]?+[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$", email)){
					System.out.println("valid");
				}else {
					System.out.println("invalid");
				}
			}

			public void phoneNumber() {
				//UC4
				System.out.println("enter PhoneNumber:");
				String phoneNumber = s.nextLine();

				if(Pattern.matches("^[0-91]{2}[\s]?[0-9]{10}$", phoneNumber)) {
					System.out.println("valid");
				}else {
					System.out.println("invalid");
				}
			}

			public void password() {
				//UC5-password

				System.out.println("enter Password:");
				String password = s.nextLine();

				if(Pattern.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8}$)", password)) {
					System.out.println("valid");
				}else {
					System.out.println("invalid");
				}
			}
			
			
			public void checkSampleEmail() {
				System.out.println("Checking Sample Emails ");
				// array for emails
				ArrayList<String> email = new ArrayList<>();
				// valid EmailIDs
				email.add("abc@yahoo.com");
				email.add("abc-100@yahoo.com");
				email.add("abc.100@yahoo.com");
				email.add("abc111@abc.com");
				email.add("abc-100@abc.net");
				email.add("abc.100@abc.com.au");
				email.add("abc@1.com");
				email.add("abc@gmail.com.com");
				email.add("abc+100@gmail.com");
				// invalid EmailIDs
				email.add("abc");
				email.add("abc..");
				email.add("abc..@gmail.com");
				email.add("abc@abc@gmail.com");
				email.add("abc@.com.my");
				email.add("abc123@gmail.a");
				email.add("abc123@.com");
				email.add("abc123@.com.com");
				email.add(".abc@abc.com");
				email.add("abc()*@gmail.com");
				email.add("abc..2002@gmail.com");
				email.add("abc.@gmail.com");
				email.add("abc@abc@gmail.com");
				email.add("abc@gmail.com.1a");
				email.add("abc..@gmail.com");
				email.add("abc@gmail.com.aa.au");

				String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
				// Creating/Defining a pattern to be searched
				Pattern pattern = Pattern.compile(reGex);

				for (String str : email) {
					Matcher matcher = pattern.matcher(str);
					if (matcher.matches()) {
						System.out.println("valid email: " + str + " :" + matcher.matches());
					} else {
						System.out.println("Invalid email: " + str + " :" + matcher.matches());
					}
				}


			}

		}
