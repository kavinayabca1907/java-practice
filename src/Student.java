import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
              String len;
              @SuppressWarnings("resource")
			Scanner s= new Scanner(System.in);
              System.out.println("Enter the String:");
              len=s.nextLine();
              int n=len.length();
              String res=len.trim();
              String rep=len.replace('r', 's');
              System.out.println("The length of the string is:"+n);
              System.out.println("The trim of the string is:"+res);
              System.out.println("The replaced of the string is:"+rep);
              
            	 

	}

}
