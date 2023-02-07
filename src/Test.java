interface One{
	void MethodOne();
}
interface Two extends One{
	public void MethodTwo();
}
class interfaceInherit implements Two{
	public void MethodOne() {
		System.out.println("Method of interface One is implemented");
	}
	public void MethodTwo() {
		System.out.println("Method of interface Two is implemented");
	}
}
public class Test {

	public static void main(String[] args) {
		interfaceInherit obj=new interfaceInherit();
		obj.MethodOne();
		obj.MethodTwo();

	}

}
