import java.util.Scanner;
public class gcd {
    public static int findGcd (int a, int b){
        int r = 1;
        while (r != 0) {
            r = b % a;
            b = a;
            if (r == 0) return a;
            else a = r;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(findGcd(num1, num2));
        sc.close();
    }
}
