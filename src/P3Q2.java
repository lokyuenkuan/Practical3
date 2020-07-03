/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
public class P3Q2 {
    public static void main(String[] args){
        int []list = {1, 2, 4, 5, 10, 100, 2, -22};
        System.out.println(getSmallest(list));
    }
    public static int getSmallest(int []number){
        int smallest = number[0], smallestIdx = 0;
        for(int i = 1; i < number.length; i++){
            if(smallest > number[i])
            {
                smallest = number[i];
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }
}
