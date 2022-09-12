public class ModifiedInsertionSort {
    public static int[] insertionSort(int[] a) {

        // sorting even positions in ascending order
        for( int i = 2; i < a.length; i = i + 2) {
            int evenKey = a[i];
            int j = i - 2;
            while (j > -1 && evenKey < a[j] && j + 2 < a.length) {
                a[j + 2] = a[j];
                j = j - 2;
                a[j + 2] = evenKey;
            }
        }

        // sorting odd positions in descending order
        for (int i = 3; i < a.length; i = i + 2) {
            int oddKey = a[i];
            int j = i - 2;
            while (j > 0 && oddKey > a[j] && j + 2 < a.length) {
                a[j + 2] = a[j];
                j = j - 2;
                a[j + 2] = oddKey;
            }
        }
        return a;
    }
}
