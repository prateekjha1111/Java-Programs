import java.util.Scanner;
public class printInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Entered num is "+num);
        sc.close();
    }
}
