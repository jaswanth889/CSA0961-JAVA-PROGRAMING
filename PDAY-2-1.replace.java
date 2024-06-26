import java.util.*;
class king{
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        String result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("The string without vowels is: " + result);
    }
}