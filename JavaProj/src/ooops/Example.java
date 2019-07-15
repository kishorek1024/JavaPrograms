package ooops;

public class Example {	
	private String name;
	private int age;
	private int marks;
	public int getAge() {
		return age;	}
	public void setAge(int age) {
		if(age<18 || age>120)
			throw new RuntimeException("Age should be inbetween 18 to 120");
	}
	public String getName() {
		return name;	}
	public void setName(String name) {
		if(name.length()<4 || name.length()>10)
			throw new RuntimeException("Name should be inbetween 4 to 10");
	}

}
