import java.io.*;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            System.out.println("Признак конца ввода строки - слово 'стоп'");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("writetext.txt"))) {
                do {
                    str = br.readLine();
                    bw.write(str);}
                    while (!(str = br.readLine()).equals("стоп")) ;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
