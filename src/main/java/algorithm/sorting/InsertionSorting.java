package algorithm.sorting;

public class InsertionSorting {

    public void insertionSorting(int[] array) {
        for (int index1 = 1; index1 < array.length; index1++) {
            int caretka = array[index1];
            int index2 = index1 - 1;
            while (index2 >= 0 && caretka < array[index2]) {
                array[index2 + 1] = array[index2];
                index2 = index2 - 1;
            }
            array[index2 + 1] = caretka;
        }
    }
}
