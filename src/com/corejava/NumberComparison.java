package com.corejava;

import java.util.ArrayList;
import java.util.Collections;

public class NumberComparison {
    public static void main(String[] args) {
        double secondLargest = 0;
        double secondSmallest = 0;
        double largest = 0;
        double smallest = 999;
        ArrayList<Double> arrayList = new ArrayList();
        for (int i = 0  ; i < 10 ; i++){
            double floor = Math.floor(Math.random() * 10);
            arrayList.add(floor);
        }
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}