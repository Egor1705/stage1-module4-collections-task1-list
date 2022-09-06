package com.epam.mjc.collections.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newList = new ArrayList<>();
        int index = 0;
        String element = null;
       for(String s:sourceList){

         //  index = sourceList.indexOf(s);
           if(sourceList.indexOf(s)==2){
               newList.add(s);
               newList.add(s);

           }


        }

        return newList;
    }
}
