package ch12_stream;

import java.io.*;
import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\" ;
        String filename = pathname + "jumsu.txt" ;
        Scanner scan = null;
        try {
            scan = new Scanner(
                    new BufferedReader(
                            new FileReader(filename)));

            while (scan.hasNext()) {
                //scan.next() : 해당 스캐너로부터 토큰을 읽어 들인다.
                System.out.println(scan.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
