import java.util.Scanner;
public class factors {
    public static void printFactors (int n){
        int i = 1;
        while (i <= n/2) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println(n); // one factor is the number itself.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printFactors(num);
        sc.close();
    }
}
