package Chapter4Excersises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VampireNumbers {
    public static int findVampireNumbers(Integer maxRange, Integer minRange) {
//        int totalRange  = maxRange - minRange +1;
        Random rand = new Random();
        List<Integer> vampireListInt = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            int randomNum1 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
            int randomNum2 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
            int foo1 = 21;
            int foo2 = 60;
            int product = randomNum1 * randomNum2;
            if (Integer.toString(product).equals(Integer.toString(randomNum1) + Integer.toString(randomNum2))) {
                System.out.println("Found the pair!! --> " + product + " = " + randomNum1 + " + " + randomNum2);
            } else {
                System.out.println(product + " = " + randomNum1 + " * " + randomNum2 + " not a pair!!");
            }
        }
        return maxRange;
    }
}
