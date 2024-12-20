package Programs;

public class Reverse_words_in_a_string {

	public static void main(String[] args) {
		
		String str="Welcome To Java";
		String[] words=str.split(" ");		
		String reversedString="";
		for (String w:words)
		{
			String reversedWords="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reversedWords=reversedWords+w.charAt(i);
			}
			reversedString=reversedString+reversedWords+" ";
		}
        System.out.println("reversed String is:"+ reversedString);
	}

}
