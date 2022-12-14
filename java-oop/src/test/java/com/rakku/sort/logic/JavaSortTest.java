package com.rakku.sort.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    
    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void test() {
        //given
        BubbleSort<Integer> javaSort = new BubbleSort<>();

        //when
        List<Integer> actual = javaSort.sort(List.of(3, 2, 5, 4, 1));

        //then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}