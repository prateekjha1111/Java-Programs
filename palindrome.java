import java.util.Scanner;
public class palindrome {
    public static int reverseNumber (int n) {
        int result = 0, r = 0;
        while (n != 0) {
            r = n % 10;
            result = result * 10 + r;
            n /= 10;
        }
    return result;
}
    public static boolean isPalindrome (int num) {
        if (num == reverseNumber(num)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print(isPalindrome(num));
        sc.close();
    }
}
