import java.util.Scanner;
public class addTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.printf("Sum of %d & %d is %d.", num1, num2, sum);
        sc.close();
    }
}
