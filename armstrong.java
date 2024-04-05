import java.util.*;
public class armstrong {
    public static boolean isArmstrong (int n) {
        int originalNum = n;
        boolean flag;
        int result = 0;
        int exp = countDigits(originalNum);

        while (n != 0) {
            result = result + (int)Math.pow(n % 10, exp);
            n /= 10;
        }

        if (result == originalNum) {
            flag = true;
        }
        else flag = false;
        return flag;
    }

    public static int countDigits (int n){
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print(isArmstrong(num));
        sc.close();
    }
}
