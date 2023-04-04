package com.Bridgelabz;

public class BubbleSort {
    public static void main(String[] args) {

        int [] numbers = {4,7,3,2,0,1,8,9,0,5};
        int swap;

        for(int i=0 ; i<numbers.length;i++){
            for(int j = i+1 ; j<numbers.length ;j++){
                if(numbers[i] > numbers[j]){
                    swap = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
        System.out.println("Bubble sort = ");
        for(int  i=1; i<numbers.length;i++){
            System.out.print(numbers[i]+" ,");
        }
    }
}