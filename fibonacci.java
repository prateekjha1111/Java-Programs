import java.util.Scanner;
public class fibonacci {
    public static void printFiboSeries (int n){
        int t1 = 0, t2 = 1, nextTerm = 0;

        if (n == 1) System.out.print(0);
        else if (n == 2) System.out.print(0 +", "+1);

        else {
            System.out.print(0 +", "+1);
            int i = 3;
            while (i <= n) {
                nextTerm = t1 + t2;
                t1 = t2;
                t2 = nextTerm;

                System.out.print(", "); // chalo extra comma bhi hata diya hahahaha, look in the output \\
                System.out.print(nextTerm);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Seies-->");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printFiboSeries(n);
        sc.close();
    }
}
