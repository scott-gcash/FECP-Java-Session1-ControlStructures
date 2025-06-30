package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double calculatePrice(String membership, int age){
        double price = 0;
        switch(membership.toLowerCase()){
            case "regular":
                if (age < 18)
                  price = 50.00;
                else if (age <= 64)
                    price = 100.00;
                else
                    price = 75.00;
                break;
            case "vip":
                if (age < 18)
                    price = 75.00;
                else if (age <= 64)
                    price = 150.00;
                else
                    price = 112.50;
                break;
            case "premium":
                if (age < 18)
                    price = 100.00;
                else if (age <= 64)
                    price = 200.00;
                else
                    price = 150.00;
                break;
            default:
                break;
        }

        return price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String membership;
        int age;
        String[] validMembership = {"regular", "vip", "premium"};

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        membership = scanner.nextLine();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();

        if (!Arrays.asList(validMembership).contains(membership.toLowerCase())){
            System.out.println("Invalid membership status entered.");
        }else {
            double price = calculatePrice(membership, age);
            System.out.printf("Price: $%.2f", price);
        }
    }
}