public class swapTwoNums {
    public static void main(String[] args) {
        int n1 = 12, n2 = 24;
        System.out.println("Before swapping n1 = "+n1+" & n2 = "+n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.print("After swapping n1 = "+n1+" & n2 = "+n2);
    }
}
