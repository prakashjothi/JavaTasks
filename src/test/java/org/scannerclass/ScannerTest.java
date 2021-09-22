package org.scannerclass;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ScannerTest {
	
	@Test
	private void employee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the emp ID");
		int empId = sc.nextInt();
		
		System.out.println("Enter the emp name");
		String empName = sc.next();
		
		System.out.println("Enter the emp phone no");
		long empPhone = sc.nextLong();
		
		System.out.println("Enter the emp DOB");
		String empDob = sc.next();
		
		System.out.println("Enter the emp salary");
		long empSalary = sc.nextLong();
		
		System.out.println("Enter the emp gender");
		Character empGender = sc.next().charAt(0);

		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empPhone);
		System.out.println(empDob);
		System.out.println(empSalary);
		System.out.println(empGender);
		
	}

}
