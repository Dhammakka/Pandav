package Programs;

public class SumofArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,4,9};
		int sum=0;
		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			sum=sum+a[i];
//			
//		}
//		
//		//or enhanced loop or for each loop
		
		for(int value:a)
			sum=sum+value;
		System.out.println("sum of array is: "+sum);
		
	}

}
