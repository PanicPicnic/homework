package Homework7;
import java.util.Scanner;

public class Arithmetics {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first value");
        Double a = sc.nextDouble();
        System.out.println("input second value");
        Double b = sc.nextDouble();
        System.out.println("input action");
        String action = sc.next();
        if (action.equals("+") || action.equals("plus") || action.equals("add")) {
            System.out.println("sum of " + a + " + " + b + " = " + add(a, b));
        }else if (action.equals("-") || action.equals("minus") || action.equals("sub")){
            System.out.println("sub of " + a + " - " + b + " = " + sub(a, b));
        }else if (action.equals("*") || action.equals("umnojit") || action.equals("mul")){
            System.out.println("multiplication of " + a + " * " + b + " = " + mul(a, b));
        }else if (action.equals("/") || action.equals("delit") || action.equals("div")){
            System.out.println("division of " + a + " / " + b + " = " + div(a, b));
        }
    }
    public static double add(double a, double b) {
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul (double a, double b){
        return a*b;
    }
    public static double div (double a, double b){
        while (a == 0 || b == 0) {
            System.out.println("can't divide by 0. try again");
            Scanner sc = new Scanner(System.in);
            System.out.println("Input first value");
            a=sc.nextDouble();
            System.out.println("input second value");
            b=sc.nextDouble();
        } return a / b;

    }

}
