package ooops;

class Firstmonth {
	public void ROI(){
		System.out.println("8.30%");
	}}
class Secondmonth extends Firstmonth {
	public void ROI(){
		System.out.println("8.75%");
	}}
class Thirdmonth extends Secondmonth {
	public void ROI(){
		System.out.println("9.75%");}
}
public class CurrentMonth extends Thirdmonth {
	public void ROI(){
		System.out.println("8%");}
	public static void main(String[] args) {
		CurrentMonth c=new CurrentMonth();
		c.ROI();
	}

}
