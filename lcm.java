import java.util.Scanner;
public class lcm {
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

        int LCM = (num1 * num2)/findGcd(num1, num2);
        System.out.println("LCM is "+LCM);
        sc.close();
    }
}
