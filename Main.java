import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a nound (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter another adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo");
        System.out.println("In an exhitbit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and it was " + verb1 + ".");

        scanner.close();


    }
    
}
