package HW_24_09_20;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\AUTO\\practice\\src\\F1\\test.txt");
        Writer name = new FileWriter(file, true);
        PrintWriter print = new PrintWriter(name);
        print.print("here is some data");
        print.close();

        FileReader read = new FileReader(file);
        Scanner scan = new Scanner(read);
        String st = scan.nextLine();
        System.out.println(st);


        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }
}
