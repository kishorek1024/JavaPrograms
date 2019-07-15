package ooops;

interface Software {
	public void Startdate();
	public void Enddate();
	public void T1();
	public void T2();
	public void T3();}
public class School1 implements Software{
	public void Startdate(){System.out.println("June13");}
	public void Enddate(){System.out.println("Apr24");}
	public void T1(){System.out.println("60000");}
	public void T2(){System.out.println("60000");}
	public void T3(){System.out.println("60000");}	
	public static void main(String[] args) {
		
		School1 s1=new School1();
		Software s=s1;
		
		Software ss=new School1();
		ss.Startdate();ss.Enddate();
		
	}
}

class School2 implements Software {
	public void Startdate(){System.out.println("June18");}
	public void Enddate(){System.out.println("Apr28");}
	public void T1(){System.out.println("80000");}
	public void T2(){System.out.println("60000");}
	public void T3(){System.out.println("70000");}
}

