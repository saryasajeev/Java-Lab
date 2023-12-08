/************************************** 
 * File 	  : QuickSortDemo.java
 * Description: QuickSort
 * Author	  : Sarya Sajeev
 * Version	  : 1.0
 * Date		  : 05/12/2023
 **************************************/
package PACK1;
import java.util.Scanner;
public class QuickSortDemo {
    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(String[] a, int l, int h) {
        String pivot = a[l]; 
        int i = l;
        for (int j = l+ 1; j <= h; j++) {
            if (a[j].compareTo(pivot) < 0) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, l, i); 
        return i;
    }

    public static void quickSort(String[] a, int l, int h) {
        if (l < h) {
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot - 1);
            quickSort(a, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int lim = sc.nextInt();
        sc.nextLine(); 

        String[] strings = new String[lim];
        System.out.println("Enter the strings:");
        for (int i = 0; i < lim; i++) {
            strings[i] = sc.nextLine();
        }

        quickSort(strings, 0, lim- 1);

        System.out.print("Sorted strings : ");
        for (int i = 0; i < lim; i++) {
            System.out.print(strings[i]+"  ");
        }
    }
}
