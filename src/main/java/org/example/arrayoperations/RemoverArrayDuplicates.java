package org.example.arrayoperations;


import java.sql.Array;
import java.util.Arrays;

public class RemoverArrayDuplicates {

    public int[] removeDuplicates(int[] array) {
        Arrays.sort(array);
        int finishedLen = 1;
        int i = 0;
        for (int j = 1; j < array.length; ++j) {
            if (array[i] != array[j]) {
                array[++i] = array[j];
                finishedLen++;
            }
        }

        return Arrays.copyOf(array, finishedLen);
    }

}
