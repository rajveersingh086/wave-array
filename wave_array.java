package geeks.array;
public class wave_array {
    public static void convertToWave(int n, int[] arr) {
         for (int i = 0; i < n - 1; i += 2) {
            // Swap the current element with the next one
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
