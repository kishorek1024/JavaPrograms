package packone;

public class Excel {
	
	public static void opensheet(String sname){
		System.out.println("Sheet " + sname + " Opened");		
	}
	public static void opensheet(int snumbar){
		System.out.println("Sheet " + snumbar + " Opened");
	}
	
	public static void main(String[] args) {
		
		opensheet("abc");
		opensheet("xyz");
		opensheet("klm");
		opensheet(101);
		opensheet(56);
		opensheet("abcd");
		
		opensheet("abc123");
		
		
		
		
		
	}

}
