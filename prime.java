import java.util.Scanner;
public class prime {
    public static boolean isPrime (int n) {
        if (n < 2) return false;
        
        boolean flag = true;
        int i = 2;
        while (i <= n/2) {
            if (n % i == 0) {
                return flag = false;
            }
            i++;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print(isPrime(num));
        sc.close();
    }
}
