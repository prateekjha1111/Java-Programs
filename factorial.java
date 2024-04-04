import java.util.Scanner;
public class factorial {
    public static long findFactorial (long n) {
        long mul = 1;
        while (n != 0) {
            mul *= n;
            n--;
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        System.out.print(findFactorial(num));
        sc.close();
    }
}
