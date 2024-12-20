package Dhammu;

public class CompressTtheString {

	public static void main(String[] args) {
		
		String input="AAABBCCC";
		String output="";
		int count=0;
	
		for(int i=1;i<input.length();i++)
		{
			if(input.charAt(i)==input.charAt(i-1))
			{
				count++;
			}
			else
				
			{
			  output=output+input.charAt(i-1)+String.valueOf(count);
			  count=1;
			}
		}
		output=output+input.charAt(input.length() - 1) + String.valueOf(count);
		System.out.println("Input:"+input);
		System.out.println("Output:"+output);
		

	}

}
