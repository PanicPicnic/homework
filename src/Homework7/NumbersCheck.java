package Homework7;

public class NumbersCheck {

static void posNeg (int num){
    if (num>0){
        System.out.println("value is positive");
    }else if (num<0){
        System.out.println("value is negative");
    }else{
        System.out.println("Value is 0");
    }
}
static void simple(int num){
    for (int i=2; i<=num; i++) {
        for (int j=2; j<i;j++) {
            if (i%j==0) {
                break;
            }else if (i==num){
                System.out.print(num + " is prime ");
                break;
            }

        }
    }
    System.out.println(num + " is not prime");
}

static void divider (int num){
    if (num%2==0 && num%3==0 && num%5==0 && num%6==0 && num%9==0){
        System.out.println("You got the number");
    }else{
        System.out.println("at least 1 is missing");
    }
}


    public static void main(String[] args) {
        divider(91);
    }





}
