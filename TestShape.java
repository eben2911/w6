package excercise2;

public class TestShape {
	
	public static void main(String[] args){
		Shape a = new Shape();
		Shape b = new Shape("yellow", false);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		a.setColor("blue");
		a.setFilled(false);
		
		System.out.println(a.toString());
	}
	
}