package prog2.midgroup2;

import java.util.Scanner;
public class FractionTester extends Fraction{
    public static Scanner sc = new Scanner(System.in); // creating object of Scanner class
    static  String smile = "\uD83D\uDE0A";
    static String love = "\uD83D\uDC9C";
    static String woman = "\uD83D\uDC67";
    static String man = "\uD83D\uDC66";
    //        //Create object
//        Fraction display = new Fraction();
    public static void main(String[] args) {
        showIntroduction();
        sc.nextLine();


        while (true) {
            showMenu(); //Displays the menu
            System.out.print("Make your choice: ");
        }
    }

    public static void showIntroduction() {
        System.out.println("\n");
        System.out.println("College of Information and Computing Sciences");
        System.out.println(" Saint Louis University");
        System.out.println(" Baguio City ");
        System.out.println("---------------------------------------------");
        for(int index=0; index < 10; index++){
            System.out.print(smile + love + smile + "");
        }
        System.out.println("\n");
        System.out.println(" Group 4 "+ smile);
        System.out.println(" Developers: \n Aliyah Javier" + woman + "\n Eduard Tadeo" + man
                + "\n Lawrence Miguel" + man + "\n Rhyen Natividad" + man);
        System.out.println("\n");
        System.out.print("Please press a key to start the program...");
    }

    public static void showMenu() {
        System.out.println();
        System.out.println("1: ADD");
        System.out.println("2: SUBTRACT");
        System.out.println("3: MULTIPLY");
        System.out.println("4: DIVIDE");
        System.out.println("5: Quit");


        int ch = Integer.parseInt(sc.next()); // reading user's choice
//                //Create object
        Fraction calling = new Fraction();
//        System.out.println("Enter fraction or Mixed depending on your preference: ");
//        String preference = sc.nextLine();
//
//        System.out.println("\n\n");

//            System.out.println("Enter numerator and denominator respectively");
//             int taas = Integer.parseInt(read.nextLine());
//             int baba = Integer.parseInt(read.nextLine());
//            Fraction f1 = new Fraction(taas, baba);
//            System.out.println(f1.toString());
//            System.out.println("Enter numerator and denominator respectively for the second inputs");
//             int taas2 = Integer.parseInt(read.nextLine());
//             int baba2 = Integer.parseInt(read.nextLine());
//            Fraction f2 = new Fraction(taas2, baba2);
//            Fraction f3 = f1.add(f2);

        switch (ch) {
            case 1:
                calling.addition();
                break;
            case 2:
                calling.subtraction();
                System.out.println();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 3:
                System.out.println("\n\n");
                calling.multiplication();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 4:
                System.out.println("\n\n");
                calling.division();
                sc.nextLine();
                System.out.print("press enter to continue...");
                sc.nextLine();
                break;
            case 5:
                System.out.println("\nThank your for using our program! Feel free to come back.");
                for(int index=0; index < 35; index++){
                    System.out.print(smile + "");
                }
                System.exit(0);
            default:
                System.err.println("Invalid choice! Please make a valid choice.");
        }
    }
    
}
