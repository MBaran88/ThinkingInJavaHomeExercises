package Chapter4Excersises;

import static Chapter4Excersises.VampireNumbers.findVampireNumbers;

public class ExNine {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            switch (i) {
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Five");
//                    break;
//                default:
//                    System.out.println("default");
//            }
//        }
//        Fiboclass fibonacciCount = new Fiboclass();
//        fibonacciCount.fiboCount(10);
//        System.out.println(fibonacciCount.fiboCount(10));
        VampireNumbers vampireNumbers = new VampireNumbers();
        System.out.println(findVampireNumbers(100, 0));
    }
}
