import java.util.*;
class GOAT{
    public static int count(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int[] a = new int[26];
	int i,index,count=0;
        for(i=0;i<n;i++){
            index = s.charAt(i) - 'a'; 
            a[index] = 1;
        } 
        for (i = 0; i < 26; i++) { 
            if (a[i] == 1) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        String sc;
	sc = s.nextLine();
        System.out.println(count(sc));
    }
}