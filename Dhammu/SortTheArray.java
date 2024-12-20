package Dhammu;

public class SortTheArray {

	public static void main(String[] args) {
	
		int a[]= {10,2,9,8,7};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
	}

}
}
