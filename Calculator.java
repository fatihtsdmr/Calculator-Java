package ceng344_termProject;



public class Calculator {
	
	
	

	public static void main(String[] args) {
		
		
		
		CalculatorDesign d = new CalculatorDesign();
		CalculatorOperations o = new CalculatorOperations();
		CalculatorControl Controller = new CalculatorControl(d, o);
		
		
	}

}
