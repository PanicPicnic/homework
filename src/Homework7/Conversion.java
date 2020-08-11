package Homework7;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input money value");
        double money = sc.nextDouble();
        System.out.println("Input conversion rate");
        double rate = sc.nextDouble();
        System.out.println("Your amount is " + conversion(money,rate));
    }
    public static double conversion(double money,double rate) {
        while (!(money > 0 && rate > 0)) {
            System.out.println("input correct value");
            Scanner sc = new Scanner(System.in);
            System.out.println("Input money value");
            money = sc.nextDouble();
            System.out.println("Input conversion rate");
            rate = sc.nextDouble();
        }return money * rate;
    }

}
