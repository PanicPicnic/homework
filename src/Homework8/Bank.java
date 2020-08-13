package Homework8;
import java.util.Scanner;

public class Bank {
    static void cred(int sum, int credit){
        Scanner sc = new Scanner(System.in);
        if (sum==credit){
            System.out.println("credit fully payed");
    }else if(sum>credit) {
            sum=sum-credit;
            System.out.println("Credit fully payed with "+sum+" extra");
        }else {
            System.out.println("Pay "+(credit-sum)+" more");
            int income = sc.nextInt();
            cred(income,credit-sum);
        }

        }

    public static void main(String[] args) {
        cred(100,400);
    }
}
