package packone;

public class Methods {
	
	public static void method1(){
		int a=30; int b=40;
		System.out.println(a*b);	}
	
	public void method2(){
		int a=30; int b=70;
		System.out.println(a+b);}
	
	public static void main(String[] args) {
		method1();
		Methods m=new Methods();
		m.method2();
	}
	
	

}
