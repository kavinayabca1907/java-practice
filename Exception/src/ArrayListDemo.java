import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList l=new ArrayList();
          
          ArrayList l2=new ArrayList();
          
          l.add(2);
          l.add('u');
          l.add(0, "kavi");
          
          l2.add("anu");
          
          l2.addAll(0,l);
          
          System.out.println(l+ " "+l2);
          System.out.println(l.size());
          
          
          l2.remove("anu");
          System.out.println(l2);
          
          l.set(0, "abcd");
          System.out.println(l);
	}

}

