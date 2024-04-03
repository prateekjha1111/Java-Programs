import java.util.Scanner;
public class multiplyTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two floating-point numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float result = num1 * num2;
        System.out.print("Product of "+num1+" & "+num2+" is "+result);
        sc.close();
    }
}
