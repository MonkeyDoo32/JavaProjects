import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PuddyTat {

    public static void main(String[] args) throws IOException{

        String[][] names;
        names = readFile("file.txt");

		password(names);


    }

    public static String[][] readFile(String f)throws IOException{

        Scanner sc = new Scanner(new BufferedReader(new FileReader(f)));
        int rows = 9;
        int columns = 4;
        String [][] array = new String[rows][columns];
        
        while(sc.hasNextLine()) {
           for (int i=0; i < array.length; i++) {
              String[] line = sc.nextLine().trim().split("\\t");              
              for (int j=0; j < line.length; j++) {
                 array[i][j] = line[j];                 
              }
           }
        }
        //System.out.println(Arrays.deepToString(array));

        sc.close();

        return array;
    }


    public static void password(String[][] a) {

        Scanner sc = new Scanner(System.in);

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