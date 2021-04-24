package excercise2;

public class Square extends Rectangle{
	public Square(double side){
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	
	public double getSide(){
		return getWidth();
	}
	
	public void setSide(double side){
		setWidth(side);
		setLength(side);
	}
	
	@Override
	public void setWidth(double side){
		setWidth(side);
		setLength(side);
	}
	
	@Override
	public void setLength(double side){
		setWidth(side);
		setLength(side);
	}
	
	@Override
	public String toString(){
		return "A Square with side: " + getWidth() + ", which is a subclass of " + super.toString();
	}
}