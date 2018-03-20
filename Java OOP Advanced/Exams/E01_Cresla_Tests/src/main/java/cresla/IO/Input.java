package cresla.IO;

import cresla.interfaces.InputReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Input implements InputReader {
    private BufferedReader sc;

    public Input(BufferedReader sc) {
        this.sc = sc;
    }

    @Override
    public String readLine() {
        try {
            return sc.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
