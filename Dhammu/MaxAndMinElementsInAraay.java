package Dhammu;

public class MaxAndMinElementsInAraay {

	public static void main(String[] args) {
		
		int a[]= {10,100,98,34};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximum number in array:"+max);
        System.out.println("Minimum number in array:"+min);
	}

}
