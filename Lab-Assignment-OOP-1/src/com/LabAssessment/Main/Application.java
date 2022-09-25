package com.LabAssessment.Main;

import java.util.Scanner;

import com.LabAssignment.Credential.CredentialService;
import com.LabAssignment.Employee.Employee;

public class Application {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hetvi", "Patel");
		CredentialService cs = new CredentialService();
		String email;
		String pass;
		
		System.out.println("Please enter the department from the following: ");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Technical (tech)");
		System.out.println("2. Admin (adm)");
		System.out.println("3. Human Resource (hr)");
		System.out.println("4. Legal (leg)");
			
			Scanner sc = new Scanner(System.in);
			
			int deptOption = sc.nextInt();
			
			switch (deptOption) {
			case 1:{
				email = cs.generateEmailAddress(e1.getFirstName(),e1.getLastName(), "tech");
				pass = cs.generatePassword(8);
				cs.showCredentials(e1, email, pass);
				break;
			}
			case 2:	{
				email = cs.generateEmailAddress(e1.getFirstName(),e1.getLastName(), "adm");
				pass = cs.generatePassword(8);
				cs.showCredentials(e1, email, pass);
				break;
			}
			case 3:{
				email = cs.generateEmailAddress(e1.getFirstName(),e1.getLastName(), "hr");
				pass = cs.generatePassword(8);
				cs.showCredentials(e1, email, pass);
				break;
			}
			case 4:{
				email = cs.generateEmailAddress(e1.getFirstName(),e1.getLastName(), "leg");
				pass = cs.generatePassword(8);
				cs.showCredentials(e1, email, pass);
				
				break;
			}
			default:{
				System.out.println("Please select correct option");
				
			}
		}
			sc.close();
	}
}
