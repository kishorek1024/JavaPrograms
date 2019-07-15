package ooops;

class Parents {
	public void lands(){
		System.out.println("Lands");
	}
	public void buildings(){
		System.out.println("Buildings");
	}
}
public class Child extends Parents{
	public void gold(){
		System.out.println("Gold");
	}
   public static void main(String[] args) {
	Child  c=new Child();
	c.gold();c.lands();c.buildings();
}

}
