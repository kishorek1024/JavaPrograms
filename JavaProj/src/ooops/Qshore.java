package ooops;
abstract class FirstRelease {
	
	public void ClassRoom(){
		System.out.println("Class Room Trainings");
	}
	public abstract void Online();
	public abstract void Corporate();
}
abstract class SecondRelease extends FirstRelease {
	public void Online(){
		System.out.println("Online Trainings");
	}}
public class Qshore extends SecondRelease{
	public void Corporate(){
		System.out.println("Corporate Trainings");	}
	public static void main(String[] args) {
		Qshore q=new Qshore();
		q.ClassRoom();q.Online();q.Corporate();
		
		
	}

}
