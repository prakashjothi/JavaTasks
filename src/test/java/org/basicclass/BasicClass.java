package org.basicclass;

import org.testng.annotations.Test;

public class BasicClass {
	
	@Test
	private void employee() {
		
		EmployeeDetails ed = new EmployeeDetails();
		ed.setEmpId(123);
		ed.setEmpName("Prakash");
		ed.setEmpAddress("Chromepet");
		ed.setEmpDob("01.04.1987");
		ed.setEmpPhone(9884545801l);
		ed.setEmpEmail("prakashjothi22@gmail.com");
		
		System.out.println(ed.getEmpId());
		System.out.println(ed.getEmpName());
		System.out.println(ed.getEmpDob());
		System.out.println(ed.getEmpPhone());
		System.out.println(ed.getEmpAddress());
		System.out.println(ed.getEmpEmail());
		System.out.println();
		
		
	}
	
	@Test
	private void vehicles() {
		
		VehicleNecessary vn = new VehicleNecessary();
		vn.allVehicles();

	}
	
	
	
	

}
