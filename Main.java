import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
/*
 * Written by Jackson Serrano
 * Date: April 12th 2024
 * Language: Java
 */
		
		
		//Random
		Random rand = new Random();
		
		//Variables
		Integer minValues;
		Integer maxValues;
		
		Scanner sc = new Scanner(System.in);
		Circle a = new Circle(rand.nextInt(100));
		Circle b = new Circle(rand.nextInt(100));
		Circle c = new Circle(rand.nextInt(100));
		Circle d = new Circle(rand.nextInt(100));
		Circle e = new Circle(rand.nextInt(100));
		Circle f = new Circle(rand.nextInt(100));
		Circle g = new Circle(rand.nextInt(100));
		Circle h = new Circle(rand.nextInt(100));
		Circle I = new Circle(rand.nextInt(100));
		Circle j = new Circle(rand.nextInt(100));
		
		
		Circle [] circles = {a, b, c, d, e, f, g, h ,I ,j};
		for (int i = 0; i < circles.length; i++) {
		   System.out.println("The radius of our circle " + (i + 1) + " is " + circles[i].getRadius());
		   System.out.println("The circumference of our circle " + (i + 1) + " is " + circles[i].circumference());
		   System.out.println("The area of our circle " + (i + 1) + " is " + circles[i].area());
		   System.out.println();
		   
		}
		minValues = (int) circles[0].getRadius();
		maxValues = (int) circles[0].getRadius();
		if((int) circles[1].getRadius() < minValues) {
			minValues = (int) circles[1].getRadius();
		} if((int) circles[2].getRadius() < minValues) {
			minValues = (int) circles[2].getRadius();
		} if((int) circles[3].getRadius() < minValues) {
			minValues = (int) circles[3].getRadius();
		} if((int) circles[4].getRadius() < minValues) {
			minValues = (int) circles[4].getRadius();
		} if((int) circles[5].getRadius() < minValues) {
			minValues = (int) circles[5].getRadius();
		} if((int) circles[6].getRadius() < minValues) {
			minValues = (int) circles[6].getRadius();
		} if((int) circles[7].getRadius() < minValues) {
			minValues = (int) circles[7].getRadius();
		} if((int) circles[8].getRadius() < minValues) {
			minValues = (int) circles[8].getRadius();
		} if((int) circles[9].getRadius() < minValues) {
			minValues = (int) circles[9].getRadius();
		}
		
		if((int) circles[1].getRadius() > maxValues) {
			maxValues = (int) circles[1].getRadius();
		} if((int) circles[2].getRadius() > maxValues) {
			maxValues = (int) circles[2].getRadius();
		} if((int) circles[3].getRadius() > maxValues) {
			maxValues = (int) circles[3].getRadius();
		} if((int) circles[4].getRadius() > maxValues) {
			maxValues = (int) circles[4].getRadius();
		} if((int) circles[5].getRadius() > maxValues) {
			maxValues = (int) circles[5].getRadius();
		} if((int) circles[6].getRadius() > maxValues) {
			maxValues = (int) circles[6].getRadius();
		} if((int) circles[7].getRadius() > maxValues) {
			maxValues = (int) circles[7].getRadius();
		} if((int) circles[8].getRadius() > maxValues) {
			maxValues = (int) circles[8].getRadius();
		} if((int) circles[9].getRadius() > maxValues) {
			maxValues = (int) circles[9].getRadius();
		}
		
		System.out.println("The Smallest radius is " + minValues);
		System.out.println("The Largest radius is " + maxValues);
		List<Circle> list = Arrays.asList(circles);  

		
	}

}
