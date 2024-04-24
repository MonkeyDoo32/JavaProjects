import java.util.Random;
import java.util.Scanner;

public class CirclesandSquares {

	public static void main(String[] args) {

/*
 * Written by Jackson
 * Date: April 22, 2024
 * Language - Java
 */
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Random
		Random rand = new Random();
		
		//Variables
		int rowsCircle;
		int rowsSquare;
		int cir;
		
		System.out.println("How many circles do you want?:");
		rowsCircle = sc.nextInt();
		System.out.println("How many squares do you want?:");
		rowsSquare = sc.nextInt();
		
		Circle [] cr = new Circle[rowsCircle];
		Squares [] sq = new Squares[rowsSquare];
		
		for(int i = 0; i<cr.length; i++) {
			Circle a = new Circle(rand.nextInt(100));
			cr[i] = a;
		}
		for(int i = 0; i<sq.length; i++) {
			Squares a = new Squares(rand.nextInt(100));
			sq[i] = a;
		}

		CircleInfo(cr);
		System.out.println();
		System.out.println("-----------------------------");
		SquareInfo(sq);

		sc.close();
		
	}
	
	public static void CircleInfo(Circle[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println("The radius of our circle " + (i + 1) + " is " + c[i].getRadius());
			System.out.println("The circumference of our circle " + (i + 1) + " is " + c[i].circumference());
			System.out.println("The area of our circle " + (i + 1) + " is " + c[i].area());
			System.out.println();
			
		 }
	}
	
	public static void SquareInfo(Squares[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println("The side length of this square " + (i + 1) + " is " + s[i].getLength());
			System.out.println("The area of the square " + (i + 1) + " is " + s[i].area());
			System.out.println();
	 }
	}

}
