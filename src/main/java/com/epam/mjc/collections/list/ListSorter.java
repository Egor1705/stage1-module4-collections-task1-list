package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

            Collections.sort(sourceList, new ListComparator());


    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
if(Math.abs(Integer.parseInt(a))==Math.abs(Integer.parseInt(b))){
    return -1;
}

        return Math.abs(Integer.parseInt(a)) - Math.abs(Integer.parseInt(b));
    }
}
