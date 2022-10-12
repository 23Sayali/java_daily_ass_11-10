/*
WAP to create two class one class do the process of fibonacci series and 
in second class find out the greater between two no . 
From second class display both the operation.
*/

import java.util.Scanner;

public class Fib_Question1 {

	public static void fibo() {
		int n, num1 = 0, num2 = 1;  	//Taking user input
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Fibonacci Series number");
		n=sc.nextInt();
	    System.out.println("Fibonacci Series till " + n + " terms:");  //Finding Series
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(num1 + " ");

	      // compute the next term
	      int nextTerm = num1 + num2;
	      num1 = num2;
	      num2 = nextTerm;

	    }

	}
}