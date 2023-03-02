package com.bl.regex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Regex");
		
		UserRegistration user = new  UserRegistration();
		user.firstName();
		user.secondName();
		user.checkEmail();
		user.phoneNumber();
		user.password();
		user.checkSampleEmail();
	
	}

}
