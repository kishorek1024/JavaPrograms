package packone;

public class Sample {
	
	Sample(){
		System.out.println("This is Constructor");
	}
	
	public void method(){
		System.out.println("This is Method");
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.method();
	}

}
