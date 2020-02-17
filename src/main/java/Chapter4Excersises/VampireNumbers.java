package Chapter4Excersises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VampireNumbers {
    public static int findVampireNumbers(Integer maxRange, Integer minRange) {
//        int totalRange  = maxRange - minRange +1;
        Random rand = new Random();
        List<Integer> vampireListInt = new ArrayList<Integer>();
        for (int i = 0; i <= 1000; i++) {
//            int randomNum1 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
//            int randomNum2 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
            int randomNum1 = 21;
            int randomNum2 = 60;
            int product = randomNum1 * randomNum2;
            String productToString = Integer.toString(product);
            String randomsToString = Integer.toString(randomNum1) + Integer.toString(randomNum2);
            if (productToString.equals(randomsToString)) {
                System.out.println("Found the pair!! --> " + product + " = " + randomNum1 + " + " + randomNum2);
            }
//            else {
//                System.out.println(product + " = " + randomNum1 + " * " + randomNum2 + " not a pair!!");
//            }
        }
        return maxRange;
    }
}
