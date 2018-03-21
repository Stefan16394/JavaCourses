package L15_Files_and_Streams_Lab;

import java.io.*;
import java.util.Scanner;

public class P03_Copy_Bytes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String path = "C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\input.txt";
        String output="C:\\Users\\Stefan-PC\\Desktop\\Stefko.txt";

        try (InputStream in = new FileInputStream(path);
             OutputStream out = new FileOutputStream(output)) {
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (oneByte == 10 || oneByte == 32) {
                    out.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++)
                        out.write(digits.charAt(i));
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
