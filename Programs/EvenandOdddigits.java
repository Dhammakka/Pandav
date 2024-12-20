package Programs;

public class EvenandOdddigits {

	public static void main(String[] args) {
		int num=12345;
		int evencount=0;
		int oddcount=0;
		int rem=0;
		 while(num>0)
		 {
			 rem=num%10;
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
		
  System.out.println("the number of even digits are" +evencount);
  System.out.println("the number of odd digits are" +oddcount);
 
	}

}
