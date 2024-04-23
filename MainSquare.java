import java.util.*;


public class MainSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Random
		Random rand = new Random();
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Objects
		Squares a = new Squares(rand.nextInt(100));
		Squares b = new Squares(rand.nextInt(100));
		Squares c = new Squares(rand.nextInt(100));
		Squares d = new Squares(rand.nextInt(100));
		Squares e = new Squares(rand.nextInt(100));
		
		Squares [] squares = {a,b,c,d,e};
		
		for(int i = 0; i < squares.length; i++) {
			   System.out.println("The side length of this square " + (i + 1) + " is " + squares[i].getLength());
			   System.out.println("The area of the square " + (i + 1) + " is " + squares[i].area());
			   System.out.println();
		}
	}

}


