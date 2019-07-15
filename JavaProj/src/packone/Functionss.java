package packone;

public class Functionss {

	public static void main(String[] args) {
		
		
		int k=30;
		
		String a="kishore kumar sel 8am April May";
		String[] b=a.split(" ");
		
		int i;
		for(i=0; i<b.length; i++){
			//System.out.println(b[i]);
			if(b[i].length()==3)
				System.out.println(b[i]);
		}
		
		/*String a="   kishore   kumar   ";
		String b="KISHOREKUMAR";
		
		System.out.println(a.trim());
		System.out.println(b.replace("R", "r"));
		
		System.out.println(a.replace(" ", ""));*/
		
		/*System.out.println(a.charAt(5));
		System.out.println(a.indexOf("kum"));*/
		
		/*System.out.println(a.contains("kum"));
		if(a.contains("xyz")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		System.out.println(a.concat(b));*/
		
		/*System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));*/
		
		
		
		
		/*System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println(a.startsWith("K"));
		if(a.startsWith("K")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		if(a.endsWith("z")==true)
			System.out.println("Pass");
		else
			System.out.println("fail");*/
		
		
		
		/*//System.out.println(a.length());
		if(a.length()==10)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/

	}

}
