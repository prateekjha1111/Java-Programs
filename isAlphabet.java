import java.util.Scanner;
public class isAlphabet {
    public static boolean isAlphabetOrNot(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        else {
           return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.print(isAlphabetOrNot(ch));
        sc.close();
    }
}
