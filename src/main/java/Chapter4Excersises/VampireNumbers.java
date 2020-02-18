package Chapter4Excersises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VampireNumbers {
    public static int findVampireNumbers(Integer maxRange, Integer minRange) {
//        int totalRange  = maxRange - minRange +1;
        Random rand = new Random();
        List<Integer> vampireListInt = new ArrayList<Integer>();
        for (int i = 0; i <= 50; i++) {
//            int randomNum1 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
//            int randomNum2 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
            int randomNum1 = 21;
            int randomNum2 = 60;
            int product = randomNum1 * randomNum2;
            char[] productCharArray = ("" + product).toCharArray();
            char[] randomsCharArray = ("" + randomNum1 + randomNum2).toCharArray();
            for (char j = 0; j < productCharArray.length; j++) {
                char foo = Array.getChar(productCharArray, j);
                for (int k = 0; k < randomsCharArray.length; k++) {
                    char foo2 = Array.getChar(randomsCharArray, k);
                    if (foo == foo2) {
                        System.out.println(foo + foo2);
                    }
                }
            }
//            System.out.println("product array" + productCharArray);
//            System.out.println("randoms array " + randomsCharArray);
//            if (productToString.equals(randomsToString)) {
//                System.out.println("Found the pair!! --> " + product + " = " + randomNum1 + " + " + randomNum2);
        }
//            else {
//                System.out.println(product + " = " + randomNum1 + " * " + randomNum2 + " not a pair!!");
//            }
//        }
        return maxRange;
    }
}
