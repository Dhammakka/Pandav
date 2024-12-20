package Dhammu;

public class FindingVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello";
		int vowels = 0, consonants = 0;
		for (char c : str.toLowerCase().toCharArray()) {
		    if ("aeiou".indexOf(c) != -1) 
		    	{
		    	vowels++;
		    	}
		    else if (Character.isLetter(c)) 
		    { 
		    	consonants++;
		    }
		    
		    }
		
		System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

	}

}
