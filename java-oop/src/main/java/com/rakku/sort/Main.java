package com.rakku.sort;

import com.rakku.sort.logic.BubbleSort;
import com.rakku.sort.logic.JavaSort;
import com.rakku.sort.logic.Sort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("정렬 결과 : " + sort.sort(Arrays.asList(args)));
    }
}
