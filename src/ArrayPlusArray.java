public class ArrayPlusArray {
    public static void main(String[] args) {

        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println(arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        System.out.println(arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;
        for (int i : arr1) {
            result += i;
        }
        for (int i : arr2) {
            result += i;
        }
        return result;
    }
}
