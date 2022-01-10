import java.util.Scanner;

class starter
{
    public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name?");
        final String nextLine = scanner.nextLine();
        System.out.println("What is your title?");
        final String nextLine2 = scanner.nextLine();
        System.out.println("Wizard, Warrior, or Rogue? ");
        final String nextLine3 = scanner.nextLine();
        if (nextLine3.equals("Warrior") || nextLine3.equals("warrior")) {
            System.out.println("you chose warrior, who cares!");
        }
        else if (nextLine3.equals("Wizard") || nextLine3.equals("wizard")) {
            System.out.println("You chose wizard,your too much of a wimp to do close combat!!");
        }
        else if (nextLine3.equals("Rogue") || nextLine3.equals("rogue")) {
            System.out.println("You've chosen the Rogue, your mom is Rouge >:) ");
        }
        else {
            System.out.println("You did not chose a role. what a loser.");
        }
        System.out.println("");
        System.out.println("You have 25 skill points to spend on  the following things: Strength, Dexterity, Intelligence, Constitution, and Charisma.");
        final int n = 25;
        System.out.println("");
        System.out.print("for strength (1-10): ");
        int n2 = scanner.nextInt();
        int n3;
        if (n2 > n || n2 > 10) {
            System.out.print("Input a smaller value From 1-10 IDIOT ");
            n2 = scanner.nextInt();
            n3 = n - n2;
        }
        else {
            n3 = n - n2;
        }
        //System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, n3));
        System.out.println("");
        System.out.print(" for dexterity (1-10): ");
        int n4 = scanner.nextInt();
        int n5;
        if (n4 > n3 || n4 > 10) {
            System.out.print("YOU ALREADY DID THIS IDIOT PICK (1-10): ");
            n4 = scanner.nextInt();
            n5 = n3 - n4;
        }
        else {
            n5 = n3 - n4;
        }
        //System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, n5));
        System.out.println("");
        System.out.print(" for intelligence (1-10): ");
        int n6 = scanner.nextInt();
        int n7;
        if (n6 > n5 || n6 > 10) {
            System.out.print("SMALLER NUMBER OR I WILL FRENCH BRAID YOUR SPINAL CORD ");
            n6 = scanner.nextInt();
            n7 = n5 - n6;
        }
        else {
            n7 = n5 - n6;
        }
        //System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, n7));
        System.out.println("");
        System.out.print("Constitution (1-10): ");
        int n8 = scanner.nextInt();
        int n9;
        if (n8 > n7 || n8 > 10) {
            System.out.print("please put a smaller number, im begging you ");
            n8 = scanner.nextInt();
            n9 = n7 - n8;
        }
        else {
            n9 = n7 - n8;
        }
        System.out.println("");
        System.out.print("for charisma (1-10): ");
        int n10 = scanner.nextInt();
        int n11;
        if (n10 > n9 || n10 > 10) {
            System.out.print("Smaller NUMBER YOU IDIOT ");
            n10 = scanner.nextInt();
            n11 = n9 - n10;
        }
        else {
            n11 = n9 - n10;
        }
        System.out.println("");
        if (n11 > 0) {
            //System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, n11));
            System.out.println("");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        
    }
}
