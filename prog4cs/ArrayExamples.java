/******************************************************************************
 *  Compilation:  javac ArrayExamples.java
 *  Execution:    java ArrayExamples
 *
 *  Typical array processing code.
 *
 *  % java ArrayExamples 5
 *  a[]
 *  -------------------
 *  0.04851944273872377
 *  0.8311550808965679
 *  0.5288965750549762
 *  0.5053593215147596
 *  0.6162362251917868
 *
 *  a = [D@f62373
 *
 *  max = 0.8311550808965679
 *  average = 0.5060333290793628
 *
 *  b[]
 *  -------------------
 *  0.6162362251917868
 *  0.5053593215147596
 *  0.5288965750549762
 *  0.8311550808965679
 *  0.04851944273872377
 *
 *  dot product of a[] and b[] = 1.1795943990991937
 *
 ******************************************************************************/

public class ArrayExamples {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		// initialize to random values between 0 & 1
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("a = " + a);
		System.out.println();

		// find the max value in the array
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) max = a[i];
		}
		System.out.println("max = " + max);

		// average the values in the array
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println("average = " + sum / n);

		// copy this array to another array
		double[] b = new double[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}

		// reverse the order
		for (int i = 0; i < n/2; i++) {
			double temp = b[i];
			b[i] = b[n-i-1]; // assign the value of the last to the first...
			b[n-i-1] = temp;
		}

		// print array values, one per line 
		System.out.println();
		System.out.println("b[]");
		System.out.println("-----------------");
		for (int i = 0; i < n; i++) {
			System.out.println(b[i]);
		}
		System.out.println();

		// dot product of a[] and b[]
		double dotProduct = 0.0;
		for (int i = 0; i < n; i++) {
			dotProduct += a[i] * b[i];
		}
		System.out.println("dot product of a[] and b[] = " + dotProduct);
	}
}
