package repo5;

import java.util.Random;
import java.util.Scanner;

//public class repo5.boring_ass_assignments {
//    public static void main(String[] args) {
//        System.out.println("Input your two number you wanna ADD");
//        int num1 = new Scanner(System.in).nextInt();
//        int num2 = new Scanner(System.in).nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
//    }
//}

//public class repo5.boring_ass_assignments {
//    public static void main(String[] args) {
//        System.out.println("Welcome!");
//        String useroption = null;
//        do{
//        System.out.println("What do you wish to do....");
//        System.out.println("1. Check a number....");
//        System.out.println("2. Exit....");
//        Scanner reader = new Scanner(System.in);
//        Scanner reader2 = new Scanner(System.in);
//        String userOption = reader.nextLine();
//        if (userOption.equals("1")) {
//            System.out.println("Which number would you like to check");
//            int userNumber = reader.nextInt();
//
//            if (userNumber % 2 == 0) {
//                System.out.println(userNumber + " is an even number");
//
//            } else if (userNumber % 2 == 1) {
//                System.out.println(userNumber + " is an odd number");
//
//            }
//            System.out.println("Would you like to check a number again");
//             useroption = reader2.nextLine().toLowerCase();
//
//
//        }
//        else if(userOption.equals("2")){
//            System.out.println("Goodbye");
//        }
//        if(useroption.equals("no")){
//            System.out.println("Goodbye");
//        }
//    } while(useroption.equals("yes"));
//    }
//}

public class boring_ass_assignments {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Would you like to play a game? \n 1.Yes \n 2.No");
        String useroption = new Scanner(System.in).nextLine();
        if (useroption.equalsIgnoreCase("yes")){
            System.out.println("Input your number between 1-5");
            int userOption = new Scanner(System.in).nextInt();
            int computerChoice = new Random().nextInt(1,5);
            if (userOption<=5 && userOption>=1){
                if(userOption==computerChoice){
                    System.out.println("Wow, You've guessed the same number as me👏🙌");
                }else {
                    System.out.println("you've guessed wrong🤣");
                }
                System.out.println("I chose " + computerChoice);
            }else if (userOption>5){
                System.out.println("Your number is greater than 5🤦‍");
            }else if (userOption<1) {
                System.out.println("Your number is less than 1🤦");
            }
        }else if (useroption.equalsIgnoreCase("No")){
            System.out.println("Goodbye🥱");
        }else {
            System.out.println("Invalid input");
        }
    }
}
