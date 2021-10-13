import com.calc.Calculator;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator.sayHello();
		
		Calculator calc = new Calculator();
		calc.info();
		
		int result = calc.sum(10, 20);
		System.out.println(result);
	}

}
// Class
// Object
// Invoking(calling) methods
