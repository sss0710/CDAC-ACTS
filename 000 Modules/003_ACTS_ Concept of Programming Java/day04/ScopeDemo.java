
public class ScopeDemo {

	public static void main(String[] args) {
		int a = 10;
		
		if(a == 10) {
			int b = 20; // b is in scope of if block only
			System.out.println(a); 
			System.out.println(b);
		}
		
		//System.out.println(b); // b is not accessible, not in scope

	}

}
