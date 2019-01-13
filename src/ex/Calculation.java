package ex;

import java.io.FileNotFoundException;
import java.io.IOException;

import ex.exception.CalculationException;
import ex.exception.MathException;

public class Calculation {
	
	public Calculation() {
		//System.out.println("Enter into Calclulation class");
		//System.out.println("Calculation object is ccreated");
	}
		
	public int add(int a, int b) throws CalculationException {
		//System.out.println("addtion method is executing");
		sub(a,b);
		return a+b;
	}
	public int sub(int a, int b) throws CalculationException {
		//System.out.println("sub method is executing");
		someMethod();
		return a-b;
	}
	public int mult(int a, int b) {
		return a*b;
	}
	public void someMethod() throws CalculationException{
		
		  try { 
			  throw new CalculationException("ERROR: exception at runtime"); 
		  } catch (CalculationException  e) { // TODO Auto-generated catch block
		  //e.printStackTrace(); 
			  throw new CalculationException("exception while ccalculting",e);
			  
			 // Logger.Error(e,"msg");
		  
		  }
		  catch (RuntimeException  e) { // TODO Auto-generated catch block
			  //e.printStackTrace(); 
				  throw new CalculationException("exception while ccalculting",e);
				  
				 // Logger.Error(e,"msg");
			  
			  }
		  
		 
		//throw new CalculationException();
	}
	
	public void antoherMethod() throws MathException {
		throw new MathException();
	}
	
	//System.out.println("Exit from Claculation class");

}
