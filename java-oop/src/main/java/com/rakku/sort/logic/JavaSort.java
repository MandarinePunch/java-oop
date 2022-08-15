package com.rakku.sort.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>>{

    public List<T> sort(List<T> list){
        List<T> result = new ArrayList<>();
        Collections.sort(result);

        return  result;
    }
}
