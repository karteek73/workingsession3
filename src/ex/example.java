package ex;

import java.io.BufferedReader;
import java.io.Reader;

import ex.exception.CalculationException;
import ex.exception.MathException;

public class example {
	

	public static void main(String[] args) {
		//System.out.println("Enter into Main class");
		Calculation cal=new Calculation();
		//System.out.println("Access back to main class");
		try {
			System.out.println("Addition : "+cal.add(1000000000, 20000));
			cal.antoherMethod();
			//BufferedReader br =new BufferedReader(new Reader());
		} catch (CalculationException | MathException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * catch (MathException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		//System.out.println("Exit from Main class");
	}

}
