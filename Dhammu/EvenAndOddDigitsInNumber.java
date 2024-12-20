package Dhammu;

public class EvenAndOddDigitsInNumber {

	public static void main(String[] args) {
		
		int num=123467;
		int evencount=0;
		int oddcount=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0) 
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("Even Digits in number:"+evencount);
		System.out.println("odd digits in number:"+oddcount);

  
    
	}

}
