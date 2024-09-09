package de.telran.algoritms_hw_3_recursia;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number 1..10_   ");
        int n= scanner.nextInt();
        System.out.println("Факториал числа_"+n+ " итеративным способом равен: "+ factorial(n));
        System.out.println("Факториал числа_"+n+ " рекурсивным способом равен: "+ factorialRecurs(n));

    }
    public static long factorial(int n){
        long fact = 1;
        for (int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }

    public static long factorialRecurs(int n){
            if(n==1) {
                return 1;
            }
            long factor = n * factorialRecurs(n-1);
            return factor;
        }

}
