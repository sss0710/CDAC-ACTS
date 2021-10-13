//Create a class Emp with fields like empId, name,dept,salary,address. Write required constructors for initialization Write a method displayEmpDetails() in the same class.
//Write another Assign_Sec7_Ques01 class , where you have to take emp details from user using Scanner and create object and call methods.

import java.util.Scanner;
public class Assign_Sec5_Que01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Emp fresher = new Emp();
		System.out.print("Enter Employee ID : ");
		fresher.empId=sc.nextInt();
		System.out.print("Enter Employee Name : ");
		sc.nextLine();
		fresher.name=sc.nextLine();
		System.out.print("Enter Employee Department : ");
		fresher.dept=sc.next();
		System.out.print("Enter Employee Salary : ");
		fresher.salary=sc.nextInt();
		System.out.print("Enter Employee Address : ");
		sc.nextLine();
		fresher.address=sc.nextLine();
		fresher.displayEmpDetails();
		sc.close();
	}
}

class Emp {
	int empId;
	String name;
	String dept;
	int salary;
	String address;

	public Emp() {
		this.empId = 0;
		this.name = "nil";
		this.dept = "nil";
		this.salary = 0;
		this.address = "nil";
	}

	public Emp(int empId, String name, String dept, int salary, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}
	
	void displayEmpDetails() {
		System.out.println("--------------------------------------");
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Department : "+dept);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Address : "+address);
	}
}