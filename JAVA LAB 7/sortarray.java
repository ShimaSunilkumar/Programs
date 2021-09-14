import java.util.Arrays;
import java.util.Scanner;

public class sortarray {
    public static void main(String args[]) {
        int n,j;
        String temp;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        n = reader.nextInt();
        System.out.print("Enter values: ");

        String[] array = new String[n];
        for(int i = 0;i < n;i++)
        {
            array[i] = reader.next();
        }
        for (int i = 0; i < n; i++) {
            for ( j = i + 1; j < n; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order:");
        for ( int i = 0; i <n ; i++)
        {
            System.out.print(array[i] + ", ");
        }
    }
}
