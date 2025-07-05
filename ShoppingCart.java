import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price of the item?: "); 
        price = scanner.nextDouble();
        System.out.print("How many of the item would you like to buy?: ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("You have added " + quantity + " " + item + "(s) to your cart.");
        System.out.println("The total cost is: " + currency + total);

        scanner.close();
    }
    
}
