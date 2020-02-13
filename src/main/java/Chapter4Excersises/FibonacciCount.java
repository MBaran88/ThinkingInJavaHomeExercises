package Chapter4Excersises;

public class FibonacciCount {
    static int FibonacciCountMethod(Integer input) {

        int f[] = new int[input];
        for (int i = 0; i < f.length; i++) {
            if (i <= 1) {
                return i;
            } else {
                return i - 1 + i - 2;
            }
        }
        return f[input];
    }
}
