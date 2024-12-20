package Dhammu;

public class MissingNumberInarray {

	public static void main(String[] args) {
	
		int a[]= {11,12,14,15};
		int sumWithoutmiss=0;
		int sumWithmiss=0;
		
		for(int i=11;i<=15;i++)
		{
			sumWithoutmiss=sumWithoutmiss+i;
		}
		
		for(int i=0;i<a.length;i++)
		{
			sumWithmiss=sumWithmiss+a[i];
			
		}
		System.out.println("Missing number in array is:" +(sumWithoutmiss-sumWithmiss));

	}

}
