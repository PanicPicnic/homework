package HW_24_09_20;
import java.io.*;
import java.util.Scanner;

public class NameToNum {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\AUTO\\practice\\src\\F1\\test.txt");
        Writer name = new FileWriter(file, true);
        PrintWriter print = new PrintWriter(name);
        print.print("qwerty");
        print.close();

        FileReader read = new FileReader(file);
        Scanner scan = new Scanner(read);
        String st = scan.nextLine();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            char x = st.charAt(i);
            int c = (int)x;
            System.out.println(c);
            count += c;
        }
        System.out.println("\nSum all numbers is: " + count);

//        Clear file
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }

}

