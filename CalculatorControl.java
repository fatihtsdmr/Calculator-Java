package ceng344_termProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorControl {

	private CalculatorDesign design;
	private CalculatorOperations operation;
	
	String ErrorMsg = "Error!! You must enter 2 integers!";
	
	public CalculatorControl(CalculatorDesign design, CalculatorOperations model){
		
		this.design = design;
		this.operation = model;
		
		this.design.addCalculationListener(new addListener());
		this.design.subCalculationListener(new subListener());
		this.design.multCalculationListener(new multiListener());
		this.design.divCalculationListener(new divListener());
		this.design.powCalculationListener(new powListener());
		this.design.modCalculationListener(new modListener());
		this.design.sqrtCalculationListener(new sqrtListener());
		this.design.cosCalculationListener(new cosListener());
		this.design.sinCalculationListener(new sinListener());
	}
	
	//add
	class addListener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0){
			int firstNumber, secondNumber = 0;
			
			try{
				firstNumber = design.getAddFirstNumber();
				secondNumber = design.getAddSecondNumber();
				
				operation.addTwoNumbers(firstNumber, secondNumber);
				design.setAddCalcSolution(operation.getCalcAddValue());
			}
			catch(NumberFormatException ex){
				design.displayErrorMessage(ErrorMsg);
			}
		}
			
	}
	
	//sub
	class subListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0){
			int Number1, Number2 = 0;
			
			try{
				Number1 = design.getSubFirstNumber();
				Number2 = design.getSubSecondNumber();
				
				operation.subTwoNumbers(Number1, Number2);
				design.setSubCalcSolution(operation.getCalcSubValue());
			}
			catch(NumberFormatException ex){
				design.displayErrorMessage(ErrorMsg);
			}
		}
	}
	//Multi
	class multiListener implements ActionListener{
	
		public void actionPerformed(ActionEvent arg0){
			int Number1, Number2;
		
			try{
				Number1 = design.getMultiFirstNumber();
				Number2 = design.getMultiSecondNumber();
			
				operation.multiNumbers(Number1, Number2);
				design.setMultiResult(operation.getMultiRes());
			}
			catch(NumberFormatException ex){
				design.displayErrorMessage(ErrorMsg);
			}
		}
	}
	//div
	class divListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0){
			int Number1, Number2;
			
			try{
				Number1 = design.getDivFirstNumber();
				Number2 = design.getDivSecondNumber();
				
				operation.divTwoNumbers(Number1, Number2);
				design.setDivSolution(operation.getDivValue());
			}
			
			catch(NumberFormatException ex){
				design.displayErrorMessage(ErrorMsg);
			}
		}
	}
	
	//pow
	
	class powListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0){
			int Number1=0, pow = 0;
			
			try{
				Number1 = design.getPowNumber();
				
				pow = design.getPowNumber2();
				
				operation.PowCalculationNumbers(Number1, pow);
				
				design.setPowResult(operation.getCalculationPowValue());
			}
			
			catch(NumberFormatException ex){
				design.displayErrorMessage(ErrorMsg);
			}
		}
	}
	
	//mod
class modListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0){
			int Number1, Number2;
			
			try{
				Number1 = design.getModNumber();
				
				Number2 = design.getModNumber2();
				
				operation.ModCalculationNumbers(Number1, Number2);
				
				design.setModResult(operation.getCalculationModValue());
			}
			
			catch(NumberFormatException ex){
				design.displayErrorMessage(ErrorMsg);
			}
		}
	}
	
//sqrt

class sqrtListener implements ActionListener{
	
	public void actionPerformed(ActionEvent arg0){
		int Number;
		
		try{
			Number = design.getSqrtNumber();
			
			operation.SqrtCalculationNumbers(Number);
			
			design.setSqrtResult(operation.getCalculationSqrtValue());
		}
		
		catch(NumberFormatException ex){
			design.displayErrorMessage(ErrorMsg);
		}
	}
}

//cos
	
class cosListener implements ActionListener{
	
	public void actionPerformed(ActionEvent arg0){
		int Number;
		
		try{
			Number = design.getCosNumber();
			
			operation.cosCalculationNumbers(Number);
			
			design.setCosResult(operation.getCalculationCosValue());
		}
		
		catch(NumberFormatException ex){
			design.displayErrorMessage(ErrorMsg);
		}
	}
}

//sin
class sinListener implements ActionListener{
	
	public void actionPerformed(ActionEvent arg0){
		int Number;
		
		try{
			Number = design.getSinNumber();
			
			operation.sinCalculationNumbers(Number);
			
			design.setSinResult(operation.getCalculationSinValue());
		}
		
		catch(NumberFormatException ex){
			design.displayErrorMessage(ErrorMsg);
		}
	}
}
	

}

