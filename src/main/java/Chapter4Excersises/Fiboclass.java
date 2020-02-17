package Chapter4Excersises;

import java.util.ArrayList;
import java.util.List;

public class Fiboclass {
    List<Integer> fiboCount(Integer fiboDigit) {
        List<Integer> fiboList = new ArrayList<Integer>(fiboDigit);
        for (int i = 0; i < fiboDigit; i++) {
//            fiboList.add(i);
//            int x = fiboList.get(i);
            int x = i;
            if (x <= 1) {
                x = 1;
                fiboList.add(x);
            } else {
                x = x - 1 + x - 2;
                fiboList.add(x);
            }

        }
        return fiboList;
    }
}