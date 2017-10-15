package AnotherWayArraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] n = new int[2][3];
        System.out.println("Row 1");
        System.out.println("Enter Number");
        n[0][0] = s.nextInt();
        System.out.println("Enter Number");
        n[0][1] = s.nextInt();
        System.out.println("Enter Number");
        n[0][2] = s.nextInt();

        System.out.println("Row 2");
        System.out.println("Enter Number");
        n[1][0] = s.nextInt();
        System.out.println("Enter Number");
        n[1][1] = s.nextInt();
        System.out.println("Enter Number");
        n[1][2] = s.nextInt();
        System.out.println("Data Table");
        SortingArray(n);
    }

    public static void SortingArray(int[][] n) {
        for (int[] d : n) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
