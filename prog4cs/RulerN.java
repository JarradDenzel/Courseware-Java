/******************************************************************************
 *  Compilation:  javac RulerN.java
 *  Execution:    java RulerN n
 *  
 *  Prints the relative lengths of the subdivisions on a ruler or
 *  order n.
 * 
 *  % java RulerN 3
 *   1 
 *   1 2 1 
 *   1 2 1 3 1 2 1 
 *
 *  % java RulerN 5
 *   1 
 *   1 2 1 
 *   1 2 1 3 1 2 1 
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
 *
 * 
 *  % java RulerN 100
 *  a lot of output, then
 *  Exception in thread "main" java.lang.OutOfMemoryError
 *
 ******************************************************************************/

public class RulerN {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		// rule of order 0
		String ruler = " ";

		// repeat n times
		for (int i = 1; i <= n; i++) {
			
			// concatenate a ruler of order 0, i, ruler of order 0
			ruler = ruler + i + ruler;
		
			// print result
			System.out.println(ruler);
		}
	}
}
