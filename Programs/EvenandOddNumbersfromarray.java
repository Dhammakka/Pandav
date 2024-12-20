package Programs;

public class EvenandOddNumbersfromarray {

	public static void main(String[] args) {
		int a[]= {2,9,7,8,6,5};
		int sum=0;
		System.out.println("even numbers from array: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]);
		}
		System.out.println("Odd numbers from array: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		}

	}


