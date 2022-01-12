package ceng344_termProject;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorDesign{
	
	JFrame jFramework = new JFrame("Ceng344 Term Project - Multifunction Calculator");
	
	//Add
	private JTextField addNumber1 = new JTextField(10);
	private JLabel addition = new JLabel(" + ");
	private JTextField addNumber2 = new JTextField(10);
	private JButton addbutton = new JButton("=");
	private JTextField addRes = new JTextField(10);
	
	//Sub
	private JTextField subNumber1 = new JTextField(10);
	private JLabel subtraction = new JLabel("-");
	private JTextField subNumber2 = new JTextField(10);
	private JButton subButton = new JButton("=");
	private JTextField subRes = new JTextField(10);
	
	//Multi
	private JTextField multiNumber1 = new JTextField(10);
	private JLabel multiLabel = new JLabel("x");
	private JTextField multiNumber2 = new JTextField(10);
	private JButton multiButton = new JButton("=");
	private JTextField multiRes = new JTextField(10);
	
	//Div
	private JTextField divNumber1 = new JTextField(10);
	private JLabel divLabel = new JLabel("÷");
	private JTextField divNumber2 = new JTextField(10);
	private JButton divButton = new JButton("=");
	private JTextField divRes = new JTextField(10);
	
	//pow
	private JTextField powNumber1 = new JTextField(10);
	private JLabel powLabel = new JLabel("^");
	private JTextField powNumber2 = new JTextField(10);
	private JButton powbutton = new JButton("=");
	private JTextField powRes = new JTextField(10);
	
	//mod
	
	private JTextField modNumber1 = new JTextField(10);
	private JLabel modLabel = new JLabel("%");
	private JTextField modNumber2 = new JTextField(10);
	private JButton modbutton = new JButton("=");
	private JTextField modRes = new JTextField(10);
	
	//Sqrt
	

	private JTextField sqrtNumber = new JTextField(10);
	private JLabel sqrtLabel = new JLabel("√");
	private JButton sqrtbutton = new JButton("=");
	private JTextField sqrtRes = new JTextField(20);
	
	//cos
	
	private JTextField cosNumber = new JTextField(10);
	private JLabel cosLabel = new JLabel("cos");
	private JButton cosbutton = new JButton("=");
	private JTextField cosRes = new JTextField(20);
	
	//sin
	
	private JTextField sinNumber = new JTextField(10);
	private JLabel sinLabel = new JLabel("sin");
	private JButton sinbutton = new JButton("=");
	private JTextField sinRes = new JTextField(20);
	
	
	CalculatorDesign(){
	JPanel Panel = new JPanel();
	jFramework.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jFramework.setSize(500, 400);
	
	jFramework.setResizable(false);
	jFramework.setBackground(Color.blue);
	jFramework.setVisible(true);
	
	//Add
	Panel.add(addNumber1);
	Panel.add(addition);
	Panel.add(addNumber2);
	Panel.add(addbutton);
	Panel.add(addRes);
	
	//Sub
	Panel.add(subNumber1);
	Panel.add(subtraction);
	Panel.add(subNumber2);
	Panel.add(subButton);
	Panel.add(subRes);	
	
	//Multi
	Panel.add(multiNumber1);
	Panel.add(multiLabel);
	Panel.add(multiNumber2);
	Panel.add(multiButton);
	Panel.add(multiRes);
	
	
	//Div
	Panel.add(divNumber1);
	Panel.add(divLabel);
	Panel.add(divNumber2);
	Panel.add(divButton);
	Panel.add(divRes);
	
	//pow
	Panel.add(powNumber1);
	Panel.add(powLabel);
	Panel.add(powNumber2);
	Panel.add(powbutton);
	Panel.add(powRes);
	
	//mod
	
	Panel.add(modNumber1);
	Panel.add(modLabel);
	Panel.add(modNumber2);
	Panel.add(modbutton);
	Panel.add(modRes);
	
	//sqrt

	Panel.add(sqrtNumber);
	Panel.add(sqrtLabel);
	Panel.add(sqrtbutton);
	Panel.add(sqrtRes);
	
	//cos
	Panel.add(cosNumber);
	Panel.add(cosLabel);
	Panel.add(cosbutton);
	Panel.add(cosRes);
	
	//sin
	Panel.add(sinNumber);
	Panel.add(sinLabel);
	Panel.add(sinbutton);
	Panel.add(sinRes);
	
	

	
	jFramework.add(Panel);
	}
	
	
	//Add
	public int getAddFirstNumber(){
		return Integer.parseInt(addNumber1.getText());
	}
	
	public int getAddSecondNumber(){
		return Integer.parseInt(addNumber2.getText());
		
	}
	
	public int getAddCalcSolution(){
		return Integer.parseInt(addRes.getText());
	}
	
	public void setAddCalcSolution(int solution){
		addRes.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenForCalcButton1){
		addbutton.addActionListener(listenForCalcButton1);
	}
	
	//Sub
	public int getSubFirstNumber(){
		return Integer.parseInt(subNumber1.getText());
	}
	
	public int getSubSecondNumber(){
		return Integer.parseInt(subNumber2.getText());
	}
	
	public int getSubCalcSolution(){
		return Integer.parseInt(subRes.getText());
	}
	
	public void setSubCalcSolution(int solution){
		subRes.setText(Integer.toString(solution));
	}
	
	void subCalculationListener(ActionListener listenForCalcButton2){
		subButton.addActionListener(listenForCalcButton2);
	}
	
	//Multi
	public int getMultiFirstNumber(){
		return Integer.parseInt(multiNumber1.getText());
	}
	
	public int getMultiSecondNumber(){
		return Integer.parseInt(multiNumber2.getText());
	}
	
	public int getMultiResult(){
		return Integer.parseInt(multiRes.getText());
	}
	
	public void setMultiResult(int solution){
	
		multiRes.setText(Integer.toString(solution));
	}
	
	void multCalculationListener(ActionListener listenForCalcButton3){
		multiButton.addActionListener(listenForCalcButton3);
	}
	
	//Div
	public int getDivFirstNumber(){
		return Integer.parseInt(divNumber1.getText());
	}
	
	public int getDivSecondNumber(){
		return Integer.parseInt(divNumber2.getText());
	}
	
	public double getDivSolution(){
		return Double.parseDouble(divRes.getText());
	}
	
	public void setDivSolution(double solution){
		divRes.setText(Double.toString(solution));
	}
	
	void divCalculationListener(ActionListener listenForCalcButton4){
		divButton.addActionListener(listenForCalcButton4);
	}
	
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(jFramework, errorMessage);
	}
	
	
	//pow
	
	public int getPowNumber(){
		return Integer.parseInt(powNumber1.getText());
	}
	
	public int getPowNumber2(){
		return Integer.parseInt(powNumber2.getText());
		
	}
	
	public int getPowResult(){
		return Integer.parseInt(powRes.getText());
	}
	
	public void setPowResult(int res){
		powRes.setText(Integer.toString(res));
	}
	
	void powCalculationListener(ActionListener listenForCalcButton5){
		powbutton.addActionListener(listenForCalcButton5);
	}

	//mod
	
	public int getModNumber(){
		return Integer.parseInt(modNumber1.getText());
	}
	
	public int getModNumber2(){
		return Integer.parseInt(modNumber2.getText());
		
	}
	
	public int getModResult(){
		return Integer.parseInt(modRes.getText());
	}
	
	public void setModResult(int res){
		modRes.setText(Integer.toString(res));
	}
	
	void modCalculationListener(ActionListener listenForCalcButton6){
		modbutton.addActionListener(listenForCalcButton6);
	}
	
	//Sqrt
	
	public int getSqrtNumber(){
		return Integer.parseInt(sqrtNumber.getText());
	}
	

	
	public int getSqrtResult(){
		return Integer.parseInt(sqrtRes.getText());
	}
	
	public void setSqrtResult(double res){
		sqrtRes.setText(Double.toString(res));
	}
	
	void sqrtCalculationListener(ActionListener listenForCalcButton7){
	
		sqrtbutton.addActionListener(listenForCalcButton7);
	}
	
	//cos
	
	
	public int getCosNumber(){
		return Integer.parseInt(cosNumber.getText());
	}
	

	
	public int getCosResult(){
		return Integer.parseInt(sqrtRes.getText());
	}
	
	public void setCosResult(double res){
		cosRes.setText(Double.toString(res));
	}
	
	void cosCalculationListener(ActionListener listenForCalcButton8){
	
	cosbutton.addActionListener(listenForCalcButton8);
	}
	
	
	//sin
	
	public int getSinNumber(){
		return Integer.parseInt(cosNumber.getText());
	}
	

	
	public int getSinResult(){
		return Integer.parseInt(sqrtRes.getText());
	}
	
	public void setSinResult(double res){
		sinRes.setText(Double.toString(res));
	}
	
	void sinCalculationListener(ActionListener listenForCalcButton9){
	
	sinbutton.addActionListener(listenForCalcButton9);
	}
	
	

	
}