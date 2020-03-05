public class FirstNElements {
    public static int[] take(int[] arr, int n) {
        int[] array = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                array[i] = arr[i];
            }
            return array;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return arr;
    }
}