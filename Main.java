import java.util.*;

public class Main {

    public static void main(String [] args) {

        System.out.println("Welcome to Pizza Hut please read our menu?");
        System.out.println("MAIN MENU");
        System.out.println("Pepperoni - £2");
        System.out.println("Ham - £2");
        System.out.println("Cheese - £2");
        System.out.println("DRINKS");
        System.out.println("Coke - £1");
        System.out.println("Water - £0");

        System.out.println("Please select 1 to order or 2 if you still need time to read the menu");
        int a = 1;
        int b = 2;

        Scanner sc= new Scanner(System.in);
        System.out.print("Value -");
        int c = sc.nextInt();

        if (c == a) {
            System.out.println("Please procced to the window to order");
        } else {
            System.out.println("Welcome to Pizza Hut have you read our menu?");

        }

        if (c == a) {
            System.out.println("What Pizza's would you like?");
        } else {
            System.out.println("Sucker no pizza here"); //dunno about this line
        }




    }


}