/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aiforlearning_11172026;

import java.util.Scanner;

/**
 *
 * @author BUHISAN_CPE113
 */
public class AIForLearning_11172026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the total Score");
       int scoretotal = input.nextInt();
       
       System.out.println("Enter your score");
       int StudentScore = input.nextInt();
       
       double avg = computerAverage(scoretotal, StudentScore);
       System.out.printf("You're average is: %.2f ",avg);
        // Ai for learning
        // HOW AI HELPS YOU LEARN FASTER
        // 1. EXPLAIN CONCEPTS
        
        // 2. ACT AS YOUR TUTOR
        
        // 3. DEBUG YOUR OWN CODE
        
        // 4. GENERATE PRACTIICE 
        
        // 5. TEST YOUR UNDERSTANDING
        
        //--------------------------------
        
        // 1. lEARN
        // 2. THINK
        // 3. CODE
        // 4. DEBUG
        // 5. VERIFY
        // 6. EXPLAIN
        
    }
    public static double computerAverage(int total, int count){
        if (count <=0){
            return 0.0;
        }
        
        return (double) total / count;
        
    }
    
    
}
