/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
import java.util.Scanner;

public class P3Q1 {

    //todo:: write a method to calculate and return average
    public static double calculateAvg(int [] score) {
        int total = 0;

        for(int x: score)
           total += x;

        return (double)total/score.length;
    }

    public static int calculateAboveEqual(int []score, double avg){
        int count=0;

        for(int x: score){
            if(x >= avg)
               count++;
        }

        return count;
    }

     public static int calculateBelow(int []score, double avg){
        int count=0;

        for(int x: score){
            if(x < avg)
               count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int number = scan.nextInt();

        int []score = new int[number];

        for(int i=0; i<number; i++){
            System.out.print("Score " + (i+1) + " : ");
            score[i]=scan.nextInt();
        }


       double avg = calculateAvg(score);
       int aboveEqualCount  = calculateAboveEqual(score, avg);

       System.out.println("Results");
       System.out.println("=======");

       System.out.printf("Average : %5.2f\n", avg);
       System.out.printf("Number of scores above or equal to the average is  : %d\n", aboveEqualCount);
       System.out.printf("Number of scores below the average is : %d\n", calculateBelow(score, avg) ); 


    }

}
