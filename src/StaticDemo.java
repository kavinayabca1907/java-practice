class StaticDemo{
	static int a=5;
	static int b;
	static void output(int x) {
		System.out.println("x="+x);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	static {
		System.out.println("static block intialized");
		b=a*6;
	}

	public static void main(String[] args) {
		output(46);
		
		
	}}


