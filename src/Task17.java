import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Task17 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            System.out.println("Признак конца ввода строки - слово 'стоп'");
            try (FileWriter fw = new FileWriter("C:\\test\\writetest.txt")) {
                do {
                    str = br.readLine();
                    str = str+"\r\n";
                    fw.write(str);}
                while (!(str = br.readLine()).equals("стоп")) ;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
