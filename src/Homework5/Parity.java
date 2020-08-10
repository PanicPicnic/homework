package Homework5;

public class Parity {
    public static void main(String[] args) {
        int num = 13;
        if ((num & 1) != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }}
