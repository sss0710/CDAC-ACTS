
public class EmpDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		
		//e1.empId = 101;
		e1.setEmpDetails(101, "Raj", "IT");
		e2.setEmpDetails(102, "Ashish", "HR");
		e3.setEmpDetails(103);
		
		e1.displayEmpDetails();
		e2.displayEmpDetails();
		e3.displayEmpDetails();
		
	}

}
