/*
WAP to accept no from the user and perform the different types of Operator.
/*


package Assignment_11_10_Inheritance;

import java.util.Scanner;

public class AcceptValue
{
	 static Scanner sc=new Scanner(System.in);
	 static int num1,num2,num3;
	
	public static void accept()
	{
	
	System.out.println("Enter the  number ");
	num1 = sc.nextInt();
	System.out.println("Enter the  number ");
	num2 = sc.nextInt();
	System.out.println("Enter the  number ");
	num3 = sc.nextInt();

	}
}


package Assignment_11_10_Inheritance;

public class Airthmatic extends AcceptValue
{
	public static void Arithmetic_Operation()
	{
		System.out.println("Addition of "+num1+" + "+num2+ " = "+(num1+num2));
		System.out.println("Subtraction of "+num1+" - "+num2+ " = "+(num1-num2));
		System.out.println("Mulptication of "+num1+" * "+num2+ " = "+(num1*num2));
		System.out.println("Division of "+num1+" / "+num2+ " = "+(num1/num2));
		System.out.println("Modules of "+num1+" % "+num2+ " = "+(num1%num2));
	
	}
	
}




package Assignment_11_10_Inheritance;

public class LogicalOperator extends AcceptValue
{
	public static void logical_Operator()
	{
		
		System.out.println("Logical And (&&)  "); //if both condition is true then and only then loop will executed
	     if(num1>num2 && num1>num3)
	     {
	    	 System.out.println(num1+" is greater ");
	     }
	     else if(num2>num3)
	     {
	    	 System.out.println(num2+" is greater ");
	     }
	     else
	    	 System.out.println(num3+" is greater ");
	     
	     System.out.println("Logical or (||) ");//if any one of them  condition is true then  loop will executed
	     if(num1>num2 || num1>num3 || num2>num1 || num3>num2)
	     {
	    	 System.out.println("if condition is true add a b and c = "+(num1+num2+num3));
	     }
	     
	    
		    System.out.println("NOT Operator(!)");   // ! operator
		    System.out.println(!(num1 == num2));  
		    System.out.println(!(num1 > num2));
		    System.out.println(!(num1 < num2));  
	}
	

}



package Assignment_11_10_Inheritance;

public class TernaryOperator extends AcceptValue
{
	public  static void ternary_operator()
	{
		int max = (num1 > num2) ? num1 : num2;
		 
        // Print the largest number
        System.out.println("Maximum is = " + max);
    }
		
	
}



package Assignment_11_10_Inheritance;

public class Bitwise extends AcceptValue
{

	
	 public static void bitwise()
	{
	System.out.println("number1 & number2 = " + (num1 & num2));     //// bitwise and   
	System.out.println("number1 ^ number2 = " + (num1 ^ num2));   //// bitwise XOR   
	System.out.println("number1 | number2 = " + (num1 | num2));   // bitwise inclusive OR  
	System.out.println("~number1 = " + (~num1));   // bitwise compliment 
	}
}







package Assignment_11_10_Inheritance;

public class Hierarchical_Inheritance {

	public static void main(String[] args) 
	{
		
		
		Airthmatic obj1= new Airthmatic();
		obj1.accept();
		obj1.Arithmetic_Operation();
		
		LogicalOperator obj2= new LogicalOperator();
		obj2.logical_Operator();
		TernaryOperator obj3= new TernaryOperator();
		obj3.ternary_operator();
		Bitwise  obj4= new Bitwise();
		obj4.bitwise();
			
	}

}