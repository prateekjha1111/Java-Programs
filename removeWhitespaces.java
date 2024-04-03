import java.util.Scanner;
public class removeWhitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String ans = str.replaceAll("\\s", "");
        System.out.print("String after removing all whitespaces is "+ans);
        sc.close();
    }
}
