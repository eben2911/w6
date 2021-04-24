package excercise2;


public class TestAll {
	public static void main(String[] args){
		Circle cir = new Circle(7.0, "red", true);
		Rectangle rect = new Rectangle(5.0, 10.0, "blue", false);
		Square sq = new Square(4);
		
		System.out.println(cir.toString());
		System.out.println(rect.toString());
		System.out.println(sq.toString());
	}
}	