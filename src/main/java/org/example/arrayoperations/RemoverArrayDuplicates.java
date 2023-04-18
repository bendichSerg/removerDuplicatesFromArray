package org.example.arrayoperations;


public class RemoverArrayDuplicates {

    public int[] removeDuplicates(int[] array) {
        int lastFinishedIndex = array.length - 1;
        int tmpElement;

        for (int i = 0; i < lastFinishedIndex; ++i) {
            for (int j = i + 1; j < lastFinishedIndex + 1; ++j) {
                if (array[i] == array[j]) {
                    tmpElement = array[j];
                    array[j] = array[lastFinishedIndex];
                    array[lastFinishedIndex--] = tmpElement;
                }
            }
        }

        int[] finishedArray = new int[lastFinishedIndex + 1];
        System.arraycopy(array, 0, finishedArray, 0, lastFinishedIndex + 1);
        return finishedArray;
    }

}
