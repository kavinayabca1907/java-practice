
public class Teacher {
	int Basic,DA,HRA;
	
	int salary(int x,int y,int z) {
	   
		int Totalsalary= x+y+z;
		return Totalsalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher();
		
		int s=t.salary(100,200,250);
		System.out.println(s);

	}

}
