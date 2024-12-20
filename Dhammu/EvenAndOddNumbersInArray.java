package Dhammu;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		
		int a[]= {10,4,5,7,8};
	
		System.out.println("Even numbers are:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
		
				System.out.println(a[i]);
			}
		}
		System.out.println("odd numbers are");
	for(int i=0;i<a.length;i++) {
			if(a[i]%2==1)
			{
		
				System.out.println(a[i]);
			}
		}

	}}


