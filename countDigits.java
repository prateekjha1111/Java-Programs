import java.util.Scanner;
public class countDigits {
    public static int countNumberOfDigits (int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print(countNumberOfDigits(num));
        sc.close();
    }
}
