package de.telran.algoritms_hw.hw_2_complexity_27_08;

//    task #2
//
//    START
//    READ number n
//    numbers i = 0, j = 0, a = 0
//    FOR i = n/2, i <= n; i + 1
//    FOR j = 2, j <= n, j * 2
//    a = a + n / 2
//    END
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число от 1 до 25:_"); //  cost = 1 times = 1
        int n = scanner.nextInt();  //  cost = 1 times = 1
        int a = 0;                   //  cost = 1 times = 1

        for (int i = n / 2; i <= n; i++) {   //  cost = 3 times = n/2
            for (int j = 2; j <= n; j =j*2) {
                a = a + n / 2;     //  cost = 4 times = log n
            }
        }
        System.out.println(a);  //  cost = 1 times =1
    }    // (Tsum) = 1+1+1+3*(n/2)* 4* log n =3+ 3n/2 *4 log n =O(n log n)
}
