import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Task17 {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            System.out.println("Признак конца ввода строки - слово 'стоп'");
            try (FileWriter fw = new FileWriter("C:\\test\\writetest.txt")) {
                do {
                    System.out.print(":");
                    str = br.readLine();
                    if (str.compareTo("стоп") == 0) break;
                    str = str + "\r\n";
                    fw.write(str);
                }
                while (str.compareTo("стоп") != 0);
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
