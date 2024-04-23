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
		
		String [] cr = new String[rowsCircle];
		String [] sq = new String[rowsSquare];
		
		for(int i = 0; i<cr.length; i++) {
			cr[i] = Integer.toString(rand.nextInt(100));
			//Circle a = new Circle(cr[i]);
		}
		for(int i = 0; i<sq.length; i++) {
			sq[i] = Integer.toString(rand.nextInt(100));
			//Squares a = new Squares(sq[i]);
		}

		CircleInfo(cr);
		SquareInfo(sq);
		
	}
	
	public static void CircleInfo(String[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println("The radius of our circle " + (i + 1) + " is " + c[i].getRadius());
			System.out.println("The circumference of our circle " + (i + 1) + " is " + c[i].circumference());
			System.out.println("The area of our circle " + (i + 1) + " is " + c[i].area());
			System.out.println();
			
		 }
	}
	
	public static void SquareInfo(String[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println("The side length of this square " + (i + 1) + " is " + s[i].getLength());
			System.out.println("The area of the square " + (i + 1) + " is " + s[i].area());
			System.out.println();
	 }
	}

}
