import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int a1 = 5;
        int a2 = 4;
        int a3 = 8;
        int a4 = 0; //Pizza Price choice
        int a5 = 2;
        int a7 = 0; //Drink Price choice
        String a8 = " "; //Pizza choice
        String a9 = " "; //Drink choice

        Scanner a = new Scanner(System.in);
        System.out.println("Welcome to Essos's Pizza Parlour can I take your order?");
        System.out.println("(Yes/No)");
        String userAnswer = a.nextLine();
        String b = userAnswer.toLowerCase();

        String[][] Pizza;
        Pizza = new String[3][2];
        Pizza[0][0] = "pepperoni:";
        Pizza[0][1] = "£5";
        Pizza[1][0] = "ham:";
        Pizza[1][1] = "£4";
        Pizza[2][0] = "vegetable:";
        Pizza[2][1] = "£8";

        String[][] Drink;
        Drink = new String[2][2];
        Drink[0][0] = "coke:";
        Drink[0][1] = "£2";
        Drink[1][0] = "fanta:";
        Drink[1][1] = "£2";

        if (b.equals("yes")) {
            System.out.println("Pizza Menu");
            System.out.println(Arrays.deepToString(Pizza));
            System.out.println("Drink Menu");
            System.out.println(Arrays.deepToString(Drink));
        } else {
            System.out.println("No worries feel free to ask later");
            System.exit(0);
        }

        Thread.sleep(2000);
        Scanner c = new Scanner(System.in);
        System.out.println("What Pizza would you like to order");
        System.out.println("(Pepperoni/Ham/Vegetable)");
        String userPizzaOrder = c.nextLine();
        String d = userPizzaOrder.toLowerCase();

        int e;
        if (d.equals("pepperoni")) {
            System.out.println("Pepperoni pizza has been ordered");
            e = a1;
            System.out.println("Total order price so far: £" + e);
            a4 += 5;
            a8 = "Pepperoni";
        }
        if (d.equals("ham")) {
            System.out.println("Ham pizza has been ordered");
            e = a2;
            System.out.println("Total order price so far: £" + e);
            a4 += 4;
            a8 = "Ham";
        }
        if (d.equals("vegetable")) {
            System.out.println("Vegetable pizza has been ordered");
            e = a3;
            System.out.println("Total order price so far: £" + e);
            a4 += 8;
            a8 = "Vegetable";
        }

        Thread.sleep(2000);
        Scanner f = new Scanner(System.in);
        System.out.println("Would you like a drink with that?");
        System.out.println("(Yes/No)");
        String userDrinkQuestion = f.nextLine();
        String g = userDrinkQuestion.toLowerCase();

        if (g.equals("yes")) {
            System.out.println(Arrays.deepToString(Drink));
            System.out.println("Our drinks menu, our system will take your order in 2 seconds");
        } else {
            System.out.println("No problem");
            System.out.println("Your total for this order is £" + a4);
        }

        Thread.sleep(2000);
        Scanner h = new Scanner(System.in);
        System.out.println("What drink would you like?");
        System.out.println("(Fanta/Coke)");
        String userDrinkOrder = h.nextLine();
        String i = userDrinkOrder.toLowerCase();

        int j;
        if (i.equals("coke")) {
            System.out.println("Coke drink has been ordered");
            j = a5;
            System.out.println("Your total drink order is £" + j);
            a7 += 2;
            a9 = "Coke";
        } if (i.equals("fanta")) {
            System.out.println("Fanta drink has been ordered");
            j = a5;
            System.out.println("Your total drink order is £" + j);
            a7 += 2;
            a9 = "Fanta";
        }
        int a10 = a7 + a4;
        Thread.sleep(1000);
        System.out.println("£" + a4 + " for the " + a8);
        System.out.println("£" + a7 + " for the " + a9);
        System.out.println("Your total order for today is £" + a10 + " ");
        System.out.println("Thank you for order at Essos's Pizza Parlour we hope to see you again soon!!");
    }
}
