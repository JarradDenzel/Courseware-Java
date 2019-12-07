/******************************************************************************
 *  Compilation:  javac Goldbach.java
 *  Execution:    java -Xmx900MB -Xms900MB Goldbach n
 *  
 *  Computes all primes less than n and tries to express n as a sum
 *  of two primes. Goldbach's conjecture says that this is always 
 *  possible if n is even and greater than 2. When n is odd, these
 *  are called prime pairs.
 *
 *  Sample execution:
 *
 *     % java Goldbach 10003292
 *     10003292 = 349 + 10002943
 *
 *     % java Goldbach 10000001
 *     10000001 is not expressible as the sum of two primes
 *
 *     % java Goldbach 10000021
 *     10000021 = 2 + 10000019 
 *
 ******************************************************************************/

public class Goldbach {
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++)
            isPrime[i] = true;

        // determine primes < n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor < n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j < n; j++)
                    isPrime[factor*j] = false;
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i < n; i++)
            if (isPrime[i]) primes++;

        System.out.println("Done tabulating primes.");

        // store primes in list
        int[] list = new int[primes];
        int count = 0;
        for (int i = 0; i < n; i++)
            if (isPrime[i]) list[count++] = i;

        // check if n can be expressed as sum of two primes
        int left = 0, right = count-1;
        while (left <= right) {
            if      (list[left] + list[right] == n) break;
            else if (list[left] + list[right]  < n) left++;
            else right--;
        }
        if (list[left] + list[right] == n)
            System.out.println(n + " = " + list[left] + " + " + list[right]);
        else
            System.out.println(n + " not expressible as sum of two primes");
    }

}
