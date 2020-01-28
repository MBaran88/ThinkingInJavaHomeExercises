package org.example;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    static void CharAutoboxing() {
        char C = 'c';
        Character ch = new Character(C);
        System.out.println("char autoboxing " + ch);

        Character dd = 'd';
        char D = dd;
        System.out.println("char unboxing " + D);
    }

    static void IntegerAutoboxing() {
        List<Integer> li = new ArrayList<>();
        for (int j = 0; j < 50; j += 2) {
            li.add(j);
        }
        System.out.println(li);
    }

    static void BooleanAutoboxing() {
        boolean i = false;
        Boolean I = i;

        if (I == false) {
            System.out.println("Boolean autoboxing works");
        } else {
            System.out.println("Boolean autoboxing does not work");
        }
    }

    static void ByteAutoboxing() {
        byte b = 0;
        Byte B = b;
        System.out.println("If byte autoboxing works then this should be 0 ---> " + B);

    }
}
