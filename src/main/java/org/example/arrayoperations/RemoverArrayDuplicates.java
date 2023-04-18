package org.example.arrayoperations;


public class RemoverArrayDuplicates {

    public int[] removeDuplicates(int[] array) {
        int[] tmpArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            if (notFindElementArray(tmpArray, array[i])) {
                tmpArray[j++] = array[i];
            }
        }
        int[] finishedArray = new int[j];
        System.arraycopy(tmpArray, 0, finishedArray, 0, j);
        return finishedArray;
    }

    private boolean notFindElementArray(int[] array, int element) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == element) {
                return false;
            }
        }
        return true;
    }

}
