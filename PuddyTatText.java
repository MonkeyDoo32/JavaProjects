import java.util.Scanner;

import java.io.*;



public class PuddyTatText {



	public static void main(String[] args) {

		/*

		 * Written by Jackson Serrano

		 * Language - Java

		 * Date: Feb 28th 2024

		 */

				//FileReader

				File f = null;

				

				//Arrays

				int [] id = {1904313318,57676066,1647035967,1147688702,1232241774,112461115,1373096662,219280045,429420453};

				String [][] names = {	{"Coyote, Wile E", "Deliveries", "supergenius", "acmecorporation"},  
										{ "Wolf, Ralph", "Security", "sheepthief", "punchtheclock"}, 
										{"Sheepdog, Sam", "Security", "bergerdebrie", "8to5chitchat"}, 
										{"Runner, Road", "Deliveries", "beepbeep", "beepbeep"}, 
										{"Buzzard, Beaky", "Waiter", "bashful", "yupnope"}, 
										{"Hopper, Hippety", "Baker (Dough)", "giantmouse", "kangaroo"}, 
										{"Webster, Emma", "Chef", "granny", "canary"}, 
										{"Pussycat, Sylvester", "Owner", "puddytat", "sufferinsuccotash"}, 
										{"Bird, Tweety", "Owner", "tweetwittlebirdie", "puttytat"}
									};

				

				

				//Function called

				password(names);

		

}

	public static void password(String[][] a) {

		

		Scanner sc = new Scanner(System.in);

		
		//Variables
		int maxFailure = 0;

		int enteredID = 0;

		int passFailure = 0; 

		String password;

		String username;

		

		do {

			

			//Main Prompt

			System.out.println("Enter Username: ");

			username = sc.nextLine();

			

			//User name and Password input scenarios

			if(username.equals(a[0][2])) {

				System.out.println("Welcome, Please enter password " + a[0][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[0][3])) {

						System.out.println("Hello " + a[0][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

					

				}while(passFailure < 3);





			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[1][2])) {

				System.out.println("Welcome, Please enter password " + a[1][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[1][3])) {

						System.out.println("Hello " + a[1][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[2][2])) {

				System.out.println("Welcome, Please enter password " + a[2][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[2][3])) {

						System.out.println("Hello " + a[2][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[3][2])) {

				System.out.println("Welcome, Please enter password " + a[3][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[3][3])) {

						System.out.println("Hello " + a[3][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[4][2])) {

				System.out.println("Welcome, Please enter password " + a[4][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[4][3])) {

						System.out.println("Hello " + a[4][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[5][2])) {

				System.out.println("Welcome, Please enter password " + a[5][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[5][3])) {

						System.out.println("Hello " + a[5][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[6][2])) {

				System.out.println("Welcome, Please enter password " + a[6][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[6][3])) {

						System.out.println("Hello " + a[6][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[7][2])) {

				System.out.println("Welcome, Please enter password " + a[7][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[7][3])) {

						System.out.println("Hello " + a[7][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else if (username.equals(a[8][2])) {

				System.out.println("Welcome, Please enter password " + a[8][0] + ": ");

				password = sc.nextLine();

				do {

					if(password.equals(a[8][3])) {

						System.out.println("Hello " + a[8][0]);

					}else {

						System.out.println("Password not recognized");

						passFailure += 1;

					}

					sc.nextLine();

				}while(passFailure < 3);



			}

			if(passFailure >= 3) {

				System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

				return;

			}

			else {

				System.out.println("Username not recognized");

				maxFailure += 1;

			}

		

			

		//Maximum Attempts	

		}while(maxFailure < 3);

		

		if(maxFailure >= 3) {

			System.out.println("You have reached the maximum number of attempts.  I do not think you work here.");

		}
		sc.close();
	}

}