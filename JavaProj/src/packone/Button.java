package packone;

public class Button {	
	// Creating Variables
	int a; int b; String c;
	// Creaying Constructor
	public Button(int h, int w, String bname){
		a=h; b=w; c=bname;	}	
	// Creating Methods
	public void buttonCreate(){
	System.out.println("Button " + c + " Created with height and widgth as " + a + "-" + b);	}
	public void clickable(){ System.out.println("Button " + c + " is Clickable");}
	public void doubleclickable(){ System.out.println("Button " + c + " is Double clickable");}
	public void rightClick(){System.out.println("Button " + c + " is Right Clickable");}
	
	public static void main(String[] args) {
		
		Button ok=new Button(40, 50, "OK");
		ok.buttonCreate();ok.clickable();ok.doubleclickable();ok.rightClick();
		
		Button cancel=new Button(30, 60, "Cancel");
		cancel.buttonCreate();cancel.clickable();
		
		Button help=new Button(80, 90, "Help");
		help.buttonCreate();
		
	}
	
	
	
	
	
	
	
}
