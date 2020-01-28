package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class ScannerController {
    public void InputScanner() {
        ArrayList<String> stringArray = new ArrayList<>(3);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Type your next arg");
            String nextArg = scanner.nextLine();
            stringArray.add(nextArg);
        }
        System.out.println("Your argument list is: " + stringArray);
    }
}
