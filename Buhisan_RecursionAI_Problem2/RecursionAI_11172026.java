/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursionai_11172026;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RecursionAI_11172026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.print("How many grades? ");
        int size = input.nextInt();

        int[] grades = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }
        System.out.print("Enter passing mark: ");
        int passingMark = input.nextInt();

        System.out.println("Passing (Loop): " + countPassing(grades, passingMark));
        System.out.println("Passing (Recursive): " + countPassingRecursive(grades, passingMark, 0));

        input.close();
    }
    // Part A. Loop

    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }
        return count;
    }

// Part B: Recursion
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index == grades.length) {
            return 0;
        }

        int add = 0;
        if (grades[index] >= passingMark) {
            add = 1;
        }

        return add + countPassingRecursive(grades, passingMark, index + 1);
    }
}
//1. What does each recursive call do to index, and why must it change? The recursive call adds 1 to the index every time the method is called. It needs to change in order to reach the end of the array, because if not it will just check the same grade over and over until the system crash.
//2. What happens if you delete the base case entirely? There will be nothing to stop the code anymore, therefore it will surpass the set index and will crash the system.


//DISCALIMER ASSISTED BY AI: