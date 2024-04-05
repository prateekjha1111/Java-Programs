import java.util.Scanner;
public class numOfVowsAndCons {
    public static void countVowsAndCons (String str){
        str = str.replaceAll("[^a-zA-Z]", "").toUpperCase();
        int freqVowels = 0, freqConso = 0;
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                freqVowels++;
            }
            else freqConso++;
            i++;
        }
        System.out.print("Number of vowels is "+freqVowels+" & number of consonants is "+freqConso);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        countVowsAndCons(str);
        sc.close();
    }
}
