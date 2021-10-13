
// If two or more methods have same name but different arguments, then they are called overloaded methods
// instance variables have default value 
// local variables does not have default value, must be initiailized before used
public class Emp {
	// instance variables
	int empId;
	String empName;
	String deptName;
	
	//instance methods
	// setEmpDetails is overloaded
	void setEmpDetails(int id, String name, String dept) {
		empId = id;
		empName = name;
		deptName = dept;
	}
	
	void setEmpDetails(String name, String dept) {
		empName = name;
		deptName = dept;
	}
	
	void setEmpDetails(int id) {
		empId = id;
		empName = "";
		deptName = "";
	}
	
	void displayEmpDetails() {
		System.out.println(empId +" "+ empName +" "+deptName );
	}
}




