abstract class shape{
	abstract void draw();
	public shape() {
		System.out.println("abstract constructor");
	}
}
class Rect extends shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Triangle extends shape{
	void draw() {
		System.out.println("Drawing Triangle");
	}
}
public class Abstractdemo {

	public static void main(String[] args) {
		shape s1=new Rect();
		s1.draw();
		s1=new Triangle();
		s1.draw();

	}

}
