import java.util.Arrays;

public class LarioAndMuigiPipeProblem {
    public static void main(String[] args) {

        int[] numbers = {4,6,9,12};
        int n = numbers.length;
        int l = numbers[n-1] - numbers[0] + 1;
        int[] arr = new int[l];
        int j = 0;

        for (int i = numbers[0]; i <= numbers[n-1]; i++) {
            arr[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
