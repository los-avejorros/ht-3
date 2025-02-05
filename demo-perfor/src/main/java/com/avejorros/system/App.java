package com.avejorros.system;

import com.avejorros.bean.Bucket;
import com.avejorros.bean.Insertion;
import com.avejorros.bean.Merge;
import com.avejorros.bean.Quick;
import com.avejorros.bean.Radix;
import com.avejorros.controller.GenerateNumber;
import com.avejorros.interfaces.ISorting;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String file = "random.text";
        int max = 3000;
        long startTime;
        long endTime;

        GenerateNumber.randomNumbers(file, max);
        Integer[] nums = GenerateNumber.getNumbers(file);

        ISorting<Integer> insertion = new Insertion<>();
        startTime = System.nanoTime();
        Integer[] arr_nums_1 = nums.clone();
        insertion.sort(arr_nums_1);
        endTime = System.nanoTime();
        System.out.println("Sorted by INSERTION SORT");
        System.out.println("Insertion Sort took: " + ((endTime - startTime) / (1 * Math.pow(10, -6))) + " ms");

        Integer[] arr_nums_2 = nums.clone();
        startTime = System.nanoTime();
        ISorting<Integer> merge = new Merge<>();
        merge.sort(arr_nums_2);
        endTime = System.nanoTime();
        System.out.println("Sorted by MERGE SORT");
        System.out.println("Merge Sort took: " + ((endTime - startTime) / (1 * Math.pow(10, -6))) + " ms");

        Integer[] arr_nums_3 = nums.clone();
        startTime = System.nanoTime();
        ISorting<Integer> quick = new Quick<>();
        quick.sort(arr_nums_3);
        endTime = System.nanoTime();
        System.out.println("Sorted by QUICK SORT");
        System.out.println("Quick Sort took: " + ((endTime - startTime) / (1 * Math.pow(10, -6))) + " ms");

        Integer[] arr_nums_4 = nums.clone();
        startTime = System.nanoTime();
        ISorting<Integer> radix = new Radix();
        radix.sort(arr_nums_4);
        endTime = System.nanoTime();
        System.out.println("Sorted by RADIX SORT");
        System.out.println("Radix Sort took: " + ((endTime - startTime) / (1 * Math.pow(10, -6))) + " ms");

        Integer[] arr_nums_5 = nums.clone();
        startTime = System.nanoTime();
        ISorting<Integer> bucket = new Bucket<>();
        bucket.sort(arr_nums_5);
        endTime = System.nanoTime();
        System.out.println("Sorted by BUCKET SORT");
        System.out.println("Bucket Sort took: " + ((endTime - startTime) / (1 * Math.pow(10, -6))) + " ms");

    }
}
