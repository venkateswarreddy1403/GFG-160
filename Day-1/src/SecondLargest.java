import java.util.*;
public class SecondLargest {
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j < largest && j > secondLargest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getSecondLargest(arr));
    }
}
