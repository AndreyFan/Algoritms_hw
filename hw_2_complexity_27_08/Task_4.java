package de.telran.algoritms_hw.hw_2_complexity_27_08;

import java.util.Scanner;
//Реализовать на java и просчитать временную сложность задач:
//
//START
//READ number n
//        numbers a = 0, i = n
//WHILE i > 0
//a = a + i
//        i = i / 2
//END

public class Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число от 1 до 25:_");  // O(1)
        int n = scanner.nextInt();  // O(1)
        int a = 0;              // O(1)
        int i = n;             // O(1)

        while (i > 0) {  // O(log n)
            a = a + i;  // O(1)
            i = i / 2;
        }

        System.out.println(a);   // O(1)
    }  // (Tsum) =  O(log n)
}

