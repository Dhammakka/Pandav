package Dhammu;

public class SortArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
			    a[j]=temp;
			}
		}
		System.out.println("Sorted array in descending order is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
