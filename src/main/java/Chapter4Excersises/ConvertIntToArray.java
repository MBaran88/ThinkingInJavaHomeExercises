package Chapter4Excersises;

public class ConvertIntToArray {
    static int[] Int_to_array(int n) {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while (n != 0) {
            arr[len - j - 1] = n % 10;
            n = n / 10;
            j++;
        }
        return arr;
    }
}
