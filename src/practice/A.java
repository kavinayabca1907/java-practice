package practice;

import java.util.Scanner;

public  class A {

char grade;
protected  String sname="Pooja";
public void student() {
	
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the mark:");
	int marks=s.nextInt();
	if(marks==100) {
		System.out.println(grade='A');
	}else if(marks>=70) {
		System.out.println(grade='b');
	}else {
		System.out.println(grade='c');
	}
}public  void sports() {
	System.out.println("A sports");
}
protected void dance() {
	System.out.println("A dance method");
}
}
