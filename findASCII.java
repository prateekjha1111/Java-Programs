import java.util.Scanner;
public class findASCII {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a character: ");
     char ch = sc.next().charAt(0);
     int asciiValue = (int)ch;
     System.out.print("ASCCI value of "+ch+" is "+asciiValue);
     sc.close();
   } 
}
