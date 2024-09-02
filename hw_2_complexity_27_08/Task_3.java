package de.telran.algoritms_hw.hw_2_complexity_27_08;

import java.util.Scanner;

// Task_3
//START
//READ number n
//number a = 0
//        FOR i = 0, i < n, i + 1
//        FOR j = n, j > i, j - 1
//a = a + i + j
//        END
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите число от 1 до 25:_");
        int n= scanner.nextInt();
        int a=0;
        for (int i=0; i<n;i++ ){  // O(n)
            for (int j=n; j>i; j-- ){ // O(n/2)
                a=a+i+j;
            }
        }
        System.out.println(a);
    }  // (Tsum) = O (n * n/2)= O(n^2)
}
