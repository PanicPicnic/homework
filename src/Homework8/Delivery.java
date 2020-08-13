package Homework8;

public class Delivery {
    public static int delivery(int N){
        if (N==1){
            return 1;
        }else {
            return N*delivery(--N);

        }
    }

    public static void main(String[] args) {
        System.out.println(delivery(5));
    }
}
