/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursionai2_11172026;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RecursionAI2_11172026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int result = factorial(num);
        System.out.println("Factorial: " + result);

        input.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
        
        // THINK FIRST:
        //1. Hand-trace factorial(4) with the AI's code. What does it return, and why? It returns 0, because the return is set to 0 when it should be set to 1 (Anything multiplied by 0 is 0).
        //2. Which single line is wrong, and what should it return instead? The line that is wrong is "return 0;" it should return 1 instead.
    }
}
//  1. Why did one wrong return make every result wrong? Returning 0, makes everything multiplied to 0 thus turning every answer to 0.
// 2. Stretch: what happens for factorial(-2) with your corrected code, and why? My code crashed, because every time the recursion is triggered the return automatically subracts 1 from -2 thus never truly reaching the number 0 in order for it to stop re-occuring.
