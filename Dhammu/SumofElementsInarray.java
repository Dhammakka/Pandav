package Dhammu;

public class SumofElementsInarray {

	public static void main(String[] args) {
		
		int a[]= {1,12,10,3,4};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
        System.out.println("Sum of elements in a array:" +sum);
	}

}
