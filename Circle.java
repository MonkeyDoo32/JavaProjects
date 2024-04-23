
public class Circle {

		//Data Member
		private double radius;
		
		//Constructor
		public Circle(double r) {
			radius = r;
		}
		
		//Area
		public double area() {
			double a = 0;
			a = Math.PI * radius * radius;
			return a;
		}
		
		//Circumference
		public double circumference() {
			double c = 0;
			c = Math.PI * 2 * radius;
			return c;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public String toString() {
			String circleInfo = "Radius: " + radius + "\nCircumference" + circumference() + "\nAreaL" + area();
			
			return circleInfo;
		}
}
