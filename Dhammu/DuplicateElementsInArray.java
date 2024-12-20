package Dhammu;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {10,5,34,8,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element in array is:"+a[i]);
				}
			}
		}

	}

}
