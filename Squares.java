
public class Squares {
	
	//Data Member
	private double length;
	
	//Constructor
	public Squares(double l) {
		length = l;
	}
	
	//Area
	public double area() {
		double a = 0;
		a = length * length;
		return a;
	}
	
	//Perimeter
	public double perimeter() {
		double p = 0;
		p = length * 4;
		return p;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	

	public String toString() {
    String squareInfo = "SideLength: " + length + 
                        "\nArea: " + area();
    	return squareInfo; 
	}
}
