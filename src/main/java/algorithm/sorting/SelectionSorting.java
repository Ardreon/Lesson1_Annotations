package algorithm.sorting;

public class SelectionSorting {

    public void selectionSorting(int[] array) {
        for (int index1 = 0; index1 < array.length; index1++) {
            int min = array[index1];
            int minindex = index1;
            for (int j = index1 + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minindex = j;
                }
            }
            int swap = array[index1];
            array[index1] = min;
            array[minindex] = swap;
        }
    }
}
