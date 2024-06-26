import java.util.*;
class king {
    public static int rev(int n) {
        int rev = 0,rem;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
    public static boolean isPal(int n) {
        return n == rev(n);
    }
    public static void add(int n) {
        int k = 0,rev;
        while (!isPal(n)) {
            rev = rev(n);
            n = n + rev;
        }
        System.out.println("Palindrome obtained: " + n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        add(n);
    }
}
