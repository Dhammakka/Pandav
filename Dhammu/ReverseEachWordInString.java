package Dhammu;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String s="Hirasugar Institute of Technology Nidasoshi";
		String revString="";
		String words[]=s.split(" ");
		for(String word:words)
		{
			String revWord="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revWord=revWord+word.charAt(i);
			}
			revString=revString+revWord+" ";
		}
		System.out.println("Reverse of every word in a String:"+revString);
		
	}
}
