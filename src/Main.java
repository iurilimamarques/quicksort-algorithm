import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 2, 20, 17, 55, 1, 62, 15, 27, 15};
        sortArray(arr, 0, (arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sortArray(arr, low, (pi - 1));
            sortArray(arr, (pi + 1), high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int i = (low - 1);
        int pivot = arr[high];

        for (int j = low; j <= (high - 1); j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }
        }
        swap(arr, high, (i + 1));
        return (i + 1);
    }

    static void swap(int[] arr, int j, int i) {
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

}
