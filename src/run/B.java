package run;
import  practice.A;

public class B extends A {
   int age=22;
	public B() {
		System.out.println("B constructor ");
	}
	public void sports() {
	 String s[]= {"footaball","basketball","volleyball"};
	 System.out.println(s[0] +"\t"+ s[1] +"\t"+ s[2]);
	}

	public static void main(String[] args) {
		B obj=new B();
		obj.sports();
		//obj.student();
        String s= obj.sname;
        System.out.println(s);
		obj.dance();
	}

}
