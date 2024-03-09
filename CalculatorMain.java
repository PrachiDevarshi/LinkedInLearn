
package Calculator;


public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double num1 = 10;
		double num2 = 3;
		

		

			System.out.println("Addition of " + num1 + " + " + num2 + " = " + calculator.add(num1, num2));
			
			System.out.println("Subtraction of " + num1 + " - " + num2 + " = " + calculator.subtract(num1, num2));

			System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + calculator.multiply(num1, num2))
	
			System.out.println("Division of " + num1 + " / " + num2 + " = " + calculator.divide(num1, num2));
		
		

	}
}