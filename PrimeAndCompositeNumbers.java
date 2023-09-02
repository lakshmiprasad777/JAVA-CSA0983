import java.util.Scanner;
public class PrimeAndCompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = scanner.nextInt();
        System.out.print("Enter the end range: ");
        int endRange = scanner.nextInt();
        System.out.println("Prime Numbers in the range " + startRange + " to " + endRange + ":");
        for (int num = startRange; num <= endRange; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nComposite Numbers in the range " + startRange + " to " + endRange + ":");
        for (int num = startRange; num <= endRange; num++) {
            if (!isPrime(num) && num > 1) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
