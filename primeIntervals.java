import java.util.Scanner;
public class primeIntervals {
    public static void printPrimes(int low, int high) {
        for (int num = low + 1; num < high; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }

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
        System.out.print("Enter lower limit & upper limit: ");
        int l = sc.nextInt();
        int h = sc.nextInt();

        printPrimes(l, h);
        sc.close();
    }
}
