import java.util.Scanner;

class starter
{
    public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println(" You wanna be a wizard, warrior, or rogue? ");
        final String nextLine = scanner.nextLine();
        if (nextLine.equals("Warrior") || nextLine.equals("warrior")) {
            System.out.println("You chose warrior");
        }
        else if (nextLine.equals("Wizard") || nextLine.equals("wizard")) {
            System.out.println("You chose the wizard");
        }
        else if (nextLine.equals("Rogue") || nextLine.equals("rogue")) {
            System.out.println("You chose the rouge");
        }
    }
}
