package Chapter4Excersises;

public class FibonacciCount {
    static int FibonacciCountMethod(Integer input) {

        int f[] = new int[input];
        for (int i = 0; i < f.length; i++) {
            if (f[i] <= 1) {
                return f[i];
            } else {
                return f[i] - 1 + f[i] - 2;
            }
        }
        return f[input];
    }
}
