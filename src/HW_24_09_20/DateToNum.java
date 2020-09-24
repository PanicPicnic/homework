package HW_24_09_20;

import java.io.*;
import java.util.Scanner;

public class DateToNum {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\AUTO\\practice\\src\\F1\\test.txt");
        Writer name = new FileWriter(file, true);
        PrintWriter print = new PrintWriter(name);
        print.print(java.time.LocalDate.now());
        print.close();

        FileReader read = new FileReader(file);
        Scanner scan = new Scanner(read);
        String st = scan.nextLine();
        st = st.replaceAll("\\W", "");
        int sum =0;
        for (int i = 0; i < st.length(); i++) {
            char x = st.charAt(i);
            int val = Integer.parseInt(String.valueOf(x));
            sum+=val;
        }System.out.println(new StringBuilder().append("Sum of Numbers in current date ").append(java.time.LocalDate.now()).append(" is - ").append(sum));

        //        Clear file
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }
}
