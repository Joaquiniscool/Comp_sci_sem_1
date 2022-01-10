import java.util.Scanner;
import java.util.Random;

class starter {
	 public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();
        System.out.print("Ayo Foo pick a numba 1 - 1000: ");
        final int nextInt = scanner.nextInt();
        final int nextInt2 = random.nextInt(1000);
        if (nextInt == nextInt2) {
        System.out.println("Nice Numba");
        }
	}
}