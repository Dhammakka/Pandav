package Programs;

public class MaxandMinNumberfromarray {

	public static void main(String[] args) {
		int a[]= {20,90,80,100,70};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Max number from array:" + max);
		
		int min=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min number from array:" +min);
		
		

	}

}
