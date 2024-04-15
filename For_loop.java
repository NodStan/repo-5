package repo5;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
//        for (int num = 1;num<=10,num++){
////            System.out.println(num);
//        }
//        System.out.println("Welcome to the multiplication table");
//        System.out.println("Choose a number you would like to check");
//        int UserChoice = new Scanner(System.in).nextInt();
//        for (int number = 1; number<=12; number++){
//            System.out.println( UserChoice + " X " + number + " = " + UserChoice*number);
//        }
//        System.out.println("input a number");
//        int option = new Scanner(System.in).nextInt();
//        for(int i = 1; i<=12; i++){
//            System.out.println(option+" * "+i+" = "+option*i);
//        }
//        int i = 5;
//        do {
//            System.out.println("VIRUS!!!");
//        }
//        while (i<5);\
//        int choice;
//        do{
//            System.out.println("1. withdraw \n 2. bal \n 3. transfer");
//            choice = new Scanner(System.in).nextInt();
//            switch (choice){
//                case 1 -> System.out.println("withdraw option");
//                case 2 -> System.out.println("checking balance......");
//                case 3 -> System.out.println("Transferring");
//            }
//        }while (choice!=0);
        for (int num = 0; num<=30; num++){
            if (num%3==0 && num%5!=0){
                System.out.println("Fizz!!!");
            }else if (num%5==0 && num%3!=0) {
                System.out.println("Buzz!!!");
            }else if (num%3==0 && num%5==0) {
                System.out.println("Fizz Buzz!!!");
            }else {
                System.out.println(num);
            }
        }
    }
}
