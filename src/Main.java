//Code written by EssosMc
//Project Pizza Parlour

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        ArrayList<String> PizzaMenu = new ArrayList<String>();
        PizzaMenu.add("Pepperoni - £5");
        PizzaMenu.add("Ham - £10");
        PizzaMenu.add("Margherita - £7");
        PizzaMenu.add("Sausage - £11");

        ArrayList<String> DrinkMenu = new ArrayList<String>();
        DrinkMenu.add("Water - £0");
        DrinkMenu.add("Coke - £2");
        DrinkMenu.add("Fanta - £3");

        ArrayList<Integer> Prices = new ArrayList<Integer>();
        Prices.add(5);
        Prices.add(10);
        Prices.add(7);
        Prices.add(11);
        Prices.add(0);
        Prices.add(2);
        Prices.add(3);

        int[] TotalPrice = {0, 0};

        Scanner user = new Scanner(System.in);
        System.out.println("Welcome to the Essos Pizza Parlour, would you folks like some menu's?");
        String menu = user.nextLine();
        if (menu.equalsIgnoreCase("yes")) {
            System.out.println(PizzaMenu);
            System.out.println(DrinkMenu);
        } else {
            System.out.println("No worries we will ask later");
            System.exit(0);
        }

        Thread.sleep(1000);
        System.out.println("Okay folks can we take your order from the PizzaMenu?");
        String PizzaOrder = user.nextLine();
        String A = PizzaOrder;
        if (A.equalsIgnoreCase("Pepperoni")) {
            System.out.println(A + " " + "ordered!");
            System.out.println("Your total order price is " + Prices.get(0));
            TotalPrice[0] = Prices.get(0);
        }
        if (A.equalsIgnoreCase("Ham")) {
            System.out.println(A + " " + "ordered!");
            System.out.println("Your total order price is " + Prices.get(1));
            TotalPrice[0] = Prices.get(1);
        }
        if (A.equalsIgnoreCase("Margherita")) {
            System.out.println(A + " " + "ordered!");
            System.out.println("Your total order price is " + Prices.get(2));
            TotalPrice[0] = Prices.get(2);
        }
        if (A.equalsIgnoreCase("Sausage")) {
            System.out.println(A + " " + "ordered!");
            System.out.println("Your total order price is " + Prices.get(3));
            TotalPrice[0] = Prices.get(3);
        }

        Thread.sleep(1000);
        System.out.println("Okay folks can we take your order from the DrinkMenu?");
        String DrinkOrder = user.nextLine();
        String B = DrinkOrder;
        if (B.equalsIgnoreCase("Water")) {
            System.out.println(B + " " + "ordered!");
            System.out.println("Your total order price is " + Prices.get(4));
            TotalPrice[1] = Prices.get(4);
        }
        if (B.equalsIgnoreCase("Coke")) {
            System.out.println(B + " " + "ordered!");
            System.out.println("Your total order price is " + Prices.get(5));
            TotalPrice[1] = Prices.get(5);
        }
        if (B.equalsIgnoreCase("Fanta")) {
            System.out.println(B + " " + "ordered!");
            System.out.println("Your total order price is " + Prices.get(6));
            TotalPrice[1] = Prices.get(6);
        }

            int R = TotalPrice[0] + TotalPrice[1];
            Thread.sleep(1000);
            System.out.println("Thank you for your order, how would you like to pay?");
            System.out.println("Cash or Card");
            String Payment = user.nextLine();
            if (Payment.equalsIgnoreCase("Card")) {
            System.out.println("Card confirmed your total today is " + R);
            } else {
            System.out.println("Cash confirmed your total today is " + R);
             }

        FileWriter Receipt = new FileWriter("Receipt");
            Receipt.write("Essos's Pizza Parlour Receipt " + "Ordered: " + A + " " + B);
            Receipt.write("Order Total: " + R);
            Receipt.write("Transaction authorised, payed by " + Payment);
            Receipt.close();
            Thread.sleep(1000);
            System.out.println("Okay folks your payment has gone through, here is your receipt");
            System.out.println(Receipt);
            Thread.sleep(1000);
            System.out.println("Okay folks here is your food, enjoy Essos's Pizza Parlour Pizza, we hope to see you soon");
            Thread.sleep(1000);
            }
        }

