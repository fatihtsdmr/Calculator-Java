package ceng344_termProject;
import java.lang.Math;
public class CalculatorOperations {

	private int AddValue;
	private int SubValue;
	private int MultiValue;
	private double divValue;
	private int powNumber;
	private int modNumber;
	private double sqrtNumber;
	private double cosNumber;
	private double sinNumber;
	
	public void addTwoNumbers(int addNumber1, int addNumber2){
		AddValue = addNumber1 + addNumber2;
	}
	
	public int getCalcAddValue(){
		return AddValue;
	}
	

	
	public void subTwoNumbers(int subNumber1, int subNumber2){
		SubValue = subNumber1 - subNumber1;
	}
	
	public int getCalcSubValue(){
		return SubValue;
	}
	
	//multi
	
	public void multiNumbers(int Number1, int Number2){
		MultiValue = Number1 * Number2;
	}
	
	public int getMultiRes(){
		return MultiValue;
	}
	
	
	//div
	public void divTwoNumbers(int Number1, int Number2){
		divValue = Number1 / Number2;
	}
	
	public double getDivValue(){
		return divValue;
	}
	
	//pow
	
	public void PowCalculationNumbers(int number, int pow){
		powNumber= (int) Math.pow(number, pow);
		
	}
	
	public int getCalculationPowValue(){
		return powNumber;
	}
	
	//mod
	public void ModCalculationNumbers(int Number1, int Number2){

modNumber= Number1 % Number2;
		
	}
	public int getCalculationModValue(){
		return modNumber;
	}
	
	
	//sqrt
	
	public void SqrtCalculationNumbers(int Number){

		sqrtNumber= (double) Math.sqrt(Number);
				
			}
			
			public double getCalculationSqrtValue(){
				return sqrtNumber;
			}
	//cos
	
			public void cosCalculationNumbers(int Number){

				cosNumber= (double) Math.cos(Number);
						
					}
					
					public double getCalculationCosValue(){
						return cosNumber;
					}
					
					
	//sin
					public void sinCalculationNumbers(int Number){

						sinNumber= (double) Math.sin(Number);
								
							}
							
							public double getCalculationSinValue(){
								return sinNumber;
							}
					
	 
}

