package Programs;

public class NumberofDigits {

	public static void main(String[] args) {
		int num=12345;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
     System.out.println("the no of digits in number are:" +count);
	}

}
