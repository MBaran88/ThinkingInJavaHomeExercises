package Chapter4Excersises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VampireNumbers {
    public static int findVampireNumbers(Integer maxRange, Integer minRange) {
//        int totalRange  = maxRange - minRange +1;
        Random rand = new Random();
        List<Integer> vampireListInt = new ArrayList<Integer>();
        for (int i = 0; i <= 0; i++) {
//            int randomNum1 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
//            int randomNum2 = minRange + rand.nextInt((maxRange - minRange) / 2) * 2;
            int randomNum1 = 21;
            int randomNum2 = 60;
            int product = randomNum1 * randomNum2;
            ConvertIntToArray convertIntToArray = new ConvertIntToArray();
            int[] ProductArray = ConvertIntToArray.Int_to_array(product);
            int concatenateOperands = Integer.parseInt(Integer.toString(randomNum1) + Integer.toString(randomNum2));
            int[] operandsArray = ConvertIntToArray.Int_to_array(concatenateOperands);
            Arrays.sort(ProductArray);
            Arrays.sort(operandsArray);
            if ()
//            char[] productCharArray = ("" + product).toCharArray();
//            char[] randomsCharArray = ("" + randomNum1 + randomNum2).toCharArray();
//            Arrays.sort(productCharArray);
//            Arrays.sort(randomsCharArray);
//            if (productCharArray)
//            char[] tableToCompare = new char[productCharArray.length];
//            for (char j = 0; j < productCharArray.length; j++) {
//                char foo = Array.getChar(productCharArray, j);
//                for (int k = 0; k < randomsCharArray.length; k++) {
//                    char foo2 = Array.getChar(randomsCharArray, k);
//                    if (foo == foo2) {
//                        tableToCompare = ("" + foo2).toCharArray();
//                        System.out.println(tableToCompare);
//                    }
//                }
//            }
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
