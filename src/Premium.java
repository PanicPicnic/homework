import java.util.Scanner;
public class Premium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bonus= 0, netSalary = 100, workTime=sc.nextDouble();
        System.out.println("Input you work experience");
        if (workTime<5){
            System.out.println("no bonus for you");
        }else if (workTime<10){
            bonus=netSalary*0.15;
            System.out.println("your new salary is " + netSalary + "+" + bonus + " bonus");
        }else if (workTime<15){
            bonus=netSalary*0.25;
            System.out.println("your new salary is " + netSalary + "+" + bonus + " bonus");
        }else if(workTime<20){
            bonus=netSalary*0.35;
            System.out.println("your new salary is " + netSalary + "+" + bonus + " bonus");
        }else if (workTime<25){
            bonus=netSalary*0.45;
            System.out.println("your new salary is " + netSalary + "+" + bonus + " bonus");
        }else{
            bonus=netSalary*0.5;
            System.out.println("your new salary is " + netSalary + "+" + bonus + " bonus");
        }

    }
}
