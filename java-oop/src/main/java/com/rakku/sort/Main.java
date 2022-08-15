package com.rakku.sort;

import com.rakku.sort.logic.BubbleSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> bubbleSort = new BubbleSort<>();

        System.out.println("정렬 결과 : " + bubbleSort.sort(Arrays.asList(args)));
    }
}
