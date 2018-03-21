package P05_security_system;

import P05_security_system.SecurityManager;

public class Main {
    public static void main(String[] args) {
        SecurityManager sm=new SecurityManager(new KeyCardCheck(new ScannerUI()),new PinCodeCheck(new ScannerUI()));
        sm.check();

    }
}
