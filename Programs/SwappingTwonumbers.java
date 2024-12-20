package Programs;

public class SwappingTwonumbers {

	public static void main(String[] args) {
		int a=10, b=20;
		 
      System.out.println("before swapping" +a+" "+b);
//      int t=a;
//      a=b;
//      b=t;

      
      //or without using third variable
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("after swapping"+a+" "+b);
	}

}
