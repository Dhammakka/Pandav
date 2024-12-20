package Dhammu;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,40,30,50};
		int Largest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>Largest)
			{
				SecondLargest=Largest;
				Largest=numbers[i];
			}
			else
			{
				if(numbers[i]>SecondLargest&& numbers[i]!=Largest)
				{
					SecondLargest=numbers[i];
				}
			}
		}
		System.out.println("SecondLargest number in a array: "+SecondLargest);

	}

}
