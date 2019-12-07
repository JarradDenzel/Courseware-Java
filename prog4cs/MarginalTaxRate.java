/******************************************************************************
 *  Compilation:  javac MarginalTaxRate.java
 *  Execution:    java MarginalTaxRate income
 *  
 *  Prints the marginal tax rate for a given income.
 *
 *  % java MarginalTaxRate 100000
 *  marginal tax rate = 0.28
 *
 *  % java MarginalTaxRate 100
 *  marginal tax rate = 0.1
 * 
 *  % java MarginalTaxRate 1000000
 *  marginal tax rate = 0.396
 *
 ******************************************************************************/

public class MarginalTaxRate {
	public static void main(String[] args) {
		int income = Integer.parseInt(args[0]);
		double rate = 0.0;

		if	(income < 0) 	  rate = 0.00;
		else if (income < 9700)   rate = 0.10;
		else if (income <  39475) rate = 0.12;
        	else if (income <  84200) rate = 0.22;
        	else if (income < 160725) rate = 0.24;
        	else if (income < 204100) rate = 0.32;
        	else if (income < 510000) rate = 0.35;
        	else                      rate = 0.37;

        System.out.println("marginal tax rate = " + rate);
    }
}
