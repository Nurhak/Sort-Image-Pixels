package com.gtu.nurhak;

import java.util.Comparator;

/************************************************************************
 * Created by Nurhak ALTIN
 * Name of the Project: HW05
 * Package: com.gtu.nurhak  
 * TimeStamp: 08/Apr/2019 23:15
 ************************************************************************/


public class CompHeap implements Comparator<Integer> {

    public int compare(Integer left, Integer right){
        return Integer.compare(right,left);
    }
}
