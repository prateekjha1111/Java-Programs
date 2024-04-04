import java.util.Scanner;
public class multiplicationTable {
    public static void findTable (int n) {
        int i = 1, mul = n;
        while (i <= 10) {
            mul *= i;
            System.out.printf("%d * %d = %d",n, i, mul );
            System.out.println();
            i++;
            mul = n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        findTable(num);
        sc.close();
    }
}
