package ooops;

class Parentsss {
	public void lands(){
		System.out.println("Lands");
			}
		}
class C1 extends Parentsss {
	public void gold(){
		System.out.println("Gold");
	}}
public class C2 extends Parentsss {
	public void cash(){
		System.out.println("Cash");		
	}
	public static void main(String[] args) {
		C2 cc=new C2();
		cc.lands();cc.cash();
		C1 ccc=new C1();
		ccc.lands();ccc.gold();
	}

}
