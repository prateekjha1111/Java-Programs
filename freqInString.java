import java.util.Scanner;
public class freqInString {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String str = sc.nextLine();
     System.out.print("Enter a character: ");
     char ch = sc.next().charAt(0);

     int frequency = 0;
     for (int i = 0; i < str.length(); i++){
        if (ch == str.charAt(i)){
            frequency++;
        }
     }

     System.out.print("Frequency of "+ch+" in the given string is "+frequency);
     sc.close();
   } 
}
