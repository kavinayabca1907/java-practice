package run;
import practice.A;

public class C {

	public C() {
		System.out.println("c Constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A obj1=new A();
       obj1.sports();
       B obj=new B();
       int f=obj.age;
       System.out.println(f);
	}

}
