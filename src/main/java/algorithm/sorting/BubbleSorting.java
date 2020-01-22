package algorithm.sorting;

public class BubbleSorting {
    public void bubbleSorting(int[] array) {
        int swap;
        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = index1; index2 < array.length; index2++) {
                if (array[index1] > array[index2]) {
                    swap = array[index1];
                    array[index1] = array[index2];
                    array[index2] = swap;
                }
            }
        }

    }


}
