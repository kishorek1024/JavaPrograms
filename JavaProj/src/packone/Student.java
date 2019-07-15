package packone;

public class Student {
	int a; int b ; int c;	
	Student(int m1, int m2){
		a=m1; b=m2;
	}
	Student(int m1, int m2, int m3){
		a=m1; b=m2; c=m3;
	}
	public void total(){System.out.println(a+b);}
	public void percentage(){System.out.println((a+b)/2);}
	public void tota2(){System.out.println(a+b+c);}
	public void percentage2(){System.out.println((a+b+c)/3);}
	
	public static void main(String[] args) {
		
		Student s=new Student(80, 60);
		s.total();s.percentage();
		
		Student s1=new Student(70, 50);
		s1.total();s1.percentage();
		
		Student s2=new Student(80, 90, 80);
		s2.tota2();s2.percentage2();
	}
	

}
