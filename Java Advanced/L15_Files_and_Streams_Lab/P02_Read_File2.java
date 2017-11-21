package L15_Files_and_Streams_Lab;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P02_Read_File2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String path = "C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\input.txt";
        String output="C:\\Users\\Stefan-PC\\Desktop\\Stefko.txt";
        List<Character> punct=new ArrayList<>();
        Collections.addAll(punct,',','.','?','!');
        try (InputStream in = new FileInputStream(path);
             OutputStream out = new FileOutputStream(output)) {
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (!punct.contains((char)oneByte)) {
                    out.write(oneByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
