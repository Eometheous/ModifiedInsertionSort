

public class Main {
    public static void main(String[] args) {
        int[] a = {7, 10, 11, 3, 6, 9, 2, 13, 0};
        a = ModifiedInsertionSort.insertionSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
