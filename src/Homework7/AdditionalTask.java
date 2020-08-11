package Homework7;
import java.util.Scanner;

public class AdditionalTask {

    public static int sum (int number) {
        int sum=0, n;
        while (number!=0){
            n = number%10;
            sum = sum +n;
            number = number/10;
        }
    return sum;
    }

    public static String reverse (String number) {
        return new StringBuilder(number).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(sum(123456));
    }
    }
