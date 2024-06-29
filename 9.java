import java.io.*;
import java.util.*;
class GOAT{
    public static void main(String[] args)
    {
        int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum sum in Subarray "
                           +Sum(a));
    }
    static int Sum(int a[])
    {
        int size = a.length;
        int far = 0, sum= 0,i;
        for(i= 0;i<size;i++) {
            sum = sum + a[i];
            if (far < sum){
                far = sum;
		}
            if(sum<0){
	        sum = 0;
		}
        }
        return far;
    }
}
