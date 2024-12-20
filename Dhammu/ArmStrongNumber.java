package Dhammu;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int cubedNumber=0;
		int org_num=num;
		
        while(num>0)
        {
        	int rem=num%10;
        	cubedNumber=cubedNumber+(rem*rem*rem);
             num=num/10;
        }
        if(org_num==cubedNumber)
        
        {
        	System.out.println("It is ArmStrong number");
        }
        else
        {
        	System.out.println("It is not armstrong number");
        }
	}

}
