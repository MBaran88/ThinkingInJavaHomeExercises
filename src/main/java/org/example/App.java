package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        AutoboxingExample autoboxingExampleChar = new AutoboxingExample();
//        AutoboxingExample.CharAutoboxing();
//        AutoboxingExample.IntegerAutoboxing();
//        AutoboxingExample.BooleanAutoboxing();
//        AutoboxingExample.ByteAutoboxing();

//        ScannerController scannerController = new ScannerController();
//        scannerController.InputScanner();
        AllTheColorsOfRainbow allTheColorsOfRainbow = new AllTheColorsOfRainbow();
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a number that represents your color: ");
        Integer pickedColor = sc.nextInt();
        Integer alteredColor = AllTheColorsOfRainbow.changeTheHueOfTheColor(pickedColor);
        System.out.println(alteredColor);
    }
}
