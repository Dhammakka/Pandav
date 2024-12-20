package Programs;

import java.util.Arrays;

public class TwoarraysEqualorNot {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,8,4,5};
//		boolean status=Arrays.equals(a1,a2);
//		if (status==true)
//		{
//			System.out.println("both arrays are equal");
//		}
//		else
//		{
//			System.out.println("both arrays are not equal");
//		}
		
		//or without using array.equals method
		boolean status=true;
		if(a1.length==a2.length)
		{
		for(int i=0;i<a1.length;i++)
			{
              if(a1[i]!=a2[i])
              {
            	  status=false;
              }
			}
		}
		else
		{
			status=false;
		}
		if (status==true)
		{
			System.out.println("Arrays are equal");
			
		}
		else
		{
			System.out.println("Arrays are NOT equal");
		}
		
		
	
	}

}
