package Programs;

import java.util.Scanner;

public class largestofTwoNumbers {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a first number");
    int a=sc.nextInt();
    
    System.out.println("Enter a first number");
    int b=sc.nextInt();
    
    System.out.println("Enter a first number");
    int c=sc.nextInt();
    
    if(a>b && a>c)
    {
    System.out.println(a+" is greater");
	}
    else if (b>a && b>c)
    {
    	System.out.println(b+ "b is greater");
    }
    else
    {
    	System.out.println(c+ "is greater");
    }
}
}
