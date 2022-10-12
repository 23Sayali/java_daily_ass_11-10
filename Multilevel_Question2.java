/*
WAP to crate three class, one class implemet the prime no prcess , 
second class implement the swapping of two no, third class imepelment 
the find out the average of student marks.
*/


package Inherti_demo;

import java.util.Scanner;

public class Prime {
	static Scanner sc = new Scanner(System.in);

	public static void prime() {
		int num, i, count = 0; // Variable declaration

		System.out.print("Enter the Number : ");
		num = sc.nextInt();

		for (i = 2; i < num; i++) { // loop starts with 2 because prime number is a number which is divided by
									// itself.
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0)
			System.out.println(+num + " is a Prime Number.");
		else
			System.out.println(+num + " is not a Prime Number.");
	}

}

package Inherti_demo;

public class Swapping extends Prime {

	public static void swap() {
		int num1, num2, temp;// x and y are to swap

		System.out.println("Enter the value of num1 and num2");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("before swapping numbers: " + num1 + "  " + num2);
		/* swapping */
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping: " + num1 + "   " + num2);
		System.out.println();
	}

}

package Inherti_demo;

import java.util.Scanner;

public class Average extends Swapping {
	public static void Avg()
	{			
			Scanner sc=new Scanner(System.in);
			int Marks[]=new int[5];
			for(int i=0;i<5;i++)                 ///size by programmer
			{
				System.out.println("Enter marks of Subject "+(i+1)+":");
				Marks[i]=sc.nextInt();
			}
			int sum=0,per;
			for(int i=0;i<5;i++)
			{
				sum=sum+Marks[i];
			}
			int avg=sum/5;
			System.out.println("Average of marks = "+avg);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avg();
		prime();
		swap();
		
	}

}