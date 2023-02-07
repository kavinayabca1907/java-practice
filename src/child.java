
public class child extends parent{

	public child() {
	     System.out.println("defalt constructor");
	}
	public child(int i) {
		super(i);
		System.out.println("child parameterized"+i);
		
	}


	public static void main(String[] args) {
        child c = new child(7);
        

	}

}
