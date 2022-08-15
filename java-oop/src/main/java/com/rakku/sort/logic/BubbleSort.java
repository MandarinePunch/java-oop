package com.rakku.sort.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> result = new ArrayList<>(list);
        int size = result.size();

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if(result.get(j).compareTo(result.get(j + 1)) > 0){
                    T temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                }
            }
        }

        return result;
    }
}
