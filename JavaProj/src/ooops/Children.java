package ooops;

class GP {
	public void lands(){
		System.out.println("Lands");
	}
	}
class P extends GP {
	public void buildings(){
		System.out.println("Buildings");
	}
}
public class Children extends P{
	public void cash(){
		System.out.println("Cash");
	}
	public static void main(String[] args) {
		Children c=new Children();
		c.lands();c.buildings();c.cash();
	}

}
