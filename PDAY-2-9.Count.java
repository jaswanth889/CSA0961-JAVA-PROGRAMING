import java.util.Arrays;
class king
{
public static void countFreq(int arr[], int n)
{
    boolean visited[] = new boolean[n]; 
    Arrays.fill(visited, false);
    for (int i = 0; i < n; i++) {
        if (visited[i] == true)
            continue;
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + "   |   " + count);
    }
}
public static void main(String []args)
{
    int arr[] = new int[]{ 1, 2, 8, 3, 2, 2, 2, 5, 1};
    int n = arr.length;
    countFreq(arr, n);
}
}
