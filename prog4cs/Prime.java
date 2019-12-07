/******************************************************************************
 *  Compilation:  javac Primes.java
 *  Execution:    java Primes n
 *  
 *  Determines whether or not n is prime.
 *
 *   % java Prime 81
 *   81 is not prime
 *
 *   % java Prime 17
 *   17 is prime
 *
 *   % java Prime 30864324691489
 *   30864324691489 is not prime
 *
 *
 ******************************************************************************/

public class Prime {

	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);
		boolean isPrime = true;
		if (n < 2) isPrime = false;

		// try all possible factors of n
		// if n has a factor, then it has one less than or equal to sqrt(n)
		// so for efficiency only check factor <= sqrt(n) or
		// equivalently factor*factor <= n
		for (long factor = 2; factor*factor <= n; factor++) {
			
			// if factor divides evenly into n, n is not prime, so break out and print
			if (n % factor == 0) {
				isPrime = false;
				break;
			}
		}	
		
		if (isPrime) System.out.println(n + " is prime.");
		else System.out.println(n + " is not prime.");
	}

}
