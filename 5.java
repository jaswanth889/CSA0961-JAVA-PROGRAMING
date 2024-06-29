import java.util.Scanner;
class GOAT{
    public static void main(String[] args) {
        int size=5,h=3;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < h; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == h- 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}