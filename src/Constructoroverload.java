class Rectangle{
	int l,b;
	Rectangle(int x,int y){
		l=x;
		b=y;
	}
	int first() {
		return (l*b);
	}
	Rectangle(int x){
		l=x;
		b=x;
	}
	int second() {
		return(l*b);
	}
}
public class Constructoroverload {

	public static void main(String[] args) {
		
           Rectangle obj=new Rectangle(2,4);
           int area1=obj.first();
           System.out.println("Area in first:"+area1);
           Rectangle obj1=new Rectangle(5);
           int area2=obj1.first();
           System.out.println("Area in second:"+area2);
           
	}

}
