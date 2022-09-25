package com.LabAssignment.Credential;

import com.LabAssignment.Employee.Employee;

public class CredentialService {
	
	String emailAddress;
	String password;
	String companySuffix = "khrp.com";
	String upperCaseAlphabates = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String numbers = "0123456789";
	String specialCharacters = "@#$%^&*!-=+?/";
	String lowerCaseAlphabates = "abcdefghijklmnopqrstuvwxyz";
	String passWord = upperCaseAlphabates + numbers + specialCharacters + lowerCaseAlphabates;
	
	public String generatePassword(int length) {
		
		char[] password = new char[8];
		
		for (int i = 0; i<length; i++) {
			int randomPassword = (int)(Math.random() * passWord.length());
			password [i]= passWord.charAt(randomPassword);
		}
		return new String (password);
}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
	 
	 emailAddress = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department +"." + companySuffix;
	 
	 return emailAddress;
	} 
	
	public void showCredentials(Employee emp, String emailAddress, String password) {
		 
		System.out.println("Dear "+emp.getFirstName()+" "+emp.getLastName()+ " your generated credentials are as follows: ");
		System.out.println("Emai-------> "+emailAddress);
		System.out.println("Password---> "+password);
	}
}


