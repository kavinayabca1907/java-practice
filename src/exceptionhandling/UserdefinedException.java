package exceptionhandling;
import java.lang.Exception;

class MyException extends Exception{
	
	MyException(String m){
		
		super(m);
	}
}

public class UserdefinedException {

	public static void main(String[] args) {
		
		int a=5, b=5000;
		try {
			float c=(float)a/(float)b;
			
			if(c<0.01) {
				
				throw new MyException("\nNumber is too small");
			}
		}
		catch(MyException e) {
			
			System.out.println("\nCaught my exception");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("\nFinally block executed");
		}
	

	}

}
