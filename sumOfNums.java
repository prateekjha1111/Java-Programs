import java.util.Scanner;
public class sumOfNums {
    public static int findSum (int n) {
        int sum = 0;
        while (n != 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print(findSum(num));
        sc.close();
    }
}
