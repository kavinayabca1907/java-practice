package exceptionhandling;

class Parent{
	void display() throws Exception {
		System.out.println("parent class called");
	}
}

public class Child extends Parent {
	void display() throws Exception {
		System.out.println("child class called");
	}

	public static void main(String[] args) {
		try {
		Parent p= new Child();
		p.display();
		}
		catch(Exception e) {}

	}

}
