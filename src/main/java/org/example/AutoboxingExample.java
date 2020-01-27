package org.example;

public class AutoboxingExample {
    static void CharAutoboxing() {
        char C = 'c';
        Character ch = new Character(C);
        System.out.println("char autoboxing " + ch);

        Character dd = 'd';
        char D = dd;
        System.out.println("char unboxing " + D);
    }
}
