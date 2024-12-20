package Dhammu;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,23,2,7};
		HashSet<Integer> set=new HashSet<Integer> ();
		for(int i=0;i<a.length;i++)
		{
			if(!set.add(a[i]))
			{
				System.out.println(a[i]);
			}
		}

	}

}
