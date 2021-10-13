package com.calc;

public class Emp {
	// instance variables
	int empId;
	String empName;
	String deptName;
	
	
	//instance methods
	void setEmpDetails(int id, String name, String dept) {
		empId = id;
		empName = name;
		deptName = dept;
	}
	
	void displayEmpDetails() {
		System.out.println(empId +" "+ empName +" "+deptName );
	}
}
