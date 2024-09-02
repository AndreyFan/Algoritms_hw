package de.telran.algoritms_hw.hw_2_complexity_27_08;


import java.util.Scanner;
//    task #1
//
//    START
//    READ number n
//    IF n == 1 THEN return
//    FOR i = 1, i <= n, i + 1
//    FOR j = 1; j <= n, j + 1
//    print "*"
//    BREAK
//            END

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число от 1 до 25:_");  //  cost = 1 times = 1
        int n = scanner.nextInt();  //  cost = 1 times = 1
        System.out.println();
        if (n == 1) {             // cost = 1 times = 1
            return;
        }

        for (int i = 1; i <= n; i++) {   // cost = 3 times = n + 1
            for (int j = 1; j <= n; j++) {  // cost = 3 times = 1
                System.out.print("*");  // cost = 1 times = 1
                break;
            }
        }  // (Tsum) = 1+1+1+5*(n)=5n+3=O(n)
    }
}


