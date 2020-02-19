package Chapter4Excersises;

import java.util.Arrays;
import java.util.Random;

public class VampireNumbers {
    public static void findVampireNumbers(Integer maxRange, Integer minRange) {
        Random rand = new Random();
        for (int i = 0; i <= 10000; i++) {
            int randomNum1 = rand.nextInt(maxRange - minRange) + minRange;
            int randomNum2 = rand.nextInt(maxRange - minRange) + minRange;
//            int randomNum1 = 21;
//            int randomNum2 = 60;
            int product = randomNum1 * randomNum2;
            ConvertIntToArray convertIntToArray = new ConvertIntToArray();
            int[] ProductArray = ConvertIntToArray.Int_to_array(product);
            int concatenateOperands = Integer.parseInt(Integer.toString(randomNum1) + Integer.toString(randomNum2));
            int[] operandsArray = ConvertIntToArray.Int_to_array(concatenateOperands);
            Arrays.sort(ProductArray);
            Arrays.sort(operandsArray);
            boolean result = Arrays.equals(ProductArray, operandsArray);
            if (result) {
                System.out.println("Found pair!! " + product + " = " + " " + randomNum1 + " + " + randomNum2);
            }
        }
    }
}
