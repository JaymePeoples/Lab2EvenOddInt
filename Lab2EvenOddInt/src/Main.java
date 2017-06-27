import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        String userName = "";
        String userChoice ="y";

        System.out.print("Please enter your name: ");
        userName = scnr.next();

        while (userChoice.equalsIgnoreCase("y")) {

        System.out.println(userName + " enter a number 1 - 100");
        userNum = scnr.nextInt();

        while (userNum > 100 | userNum < 1) {
            System.out.println(userName + " please enter a number 1-100.");
            userNum = scnr.nextInt();
        }
        if (userNum >= 1 && userNum <= 100) {
            if (userNum % 2 != 0) {
                System.out.println("Odd");
            } else if (userNum >= 2 && userNum <= 25) {
                if (userNum % 2 == 0) {
                    System.out.println("Even and less than 25.");
                }
            } else if (userNum >= 26 && userNum <= 60) {
                if (userNum % 2 == 0) {
                    System.out.println("Even");
                }
            } else if (userNum > 60 && userNum <= 100) {
                if (userNum % 2 == 0) {
                    System.out.println(userNum + " Even");
                }
            } else if (userNum > 60 && userNum <= 100) {
                if (userNum % 2 != 0) {
                    System.out.println("Odd and over 60");
                }
            }
        }
                System.out.println("Continue? Type (y/n)");
                userChoice = scnr.next();
            }
            System.out.println("Thanks for playing " + userName);//If user enters anything other than yes, will direct here.
            }
        }


