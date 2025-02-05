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

        // GENERAR Y OBTENER LOS NUMEROS ALEATORIOS
        GenerateNumber.randomNumbers(file, max);
        Integer[] nums = GenerateNumber.getNumbers(file);

        Integer[] arr_nums_1 = nums.clone();
        Integer[] arr_nums_2 = nums.clone();
        Integer[] arr_nums_3 = nums.clone();
        Integer[] arr_nums_4 = nums.clone();
        Integer[] arr_nums_5 = nums.clone();

        // LLAMAR METODOS DE ORDENAMIENTO
        ISorting<Integer> insertion = new Insertion<>();
        ISorting<Integer> merge = new Merge<>();
        ISorting<Integer> quick = new Quick<>();
        ISorting<Integer> radix = new Radix();
        ISorting<Integer> bucket = new Bucket<>();

        // SORTING
        insertion.sort(arr_nums_1);
        System.out.println("Sorted by INSERTION SORT");

        merge.sort(arr_nums_2);
        System.out.println("Sorted by MERGE SORT");

        quick.sort(arr_nums_3);
        System.out.println("Sorted by QUICK SORT");

        radix.sort(arr_nums_4);
        System.out.println("Sorted by RADIX SORT");

        bucket.sort(arr_nums_5);
        System.out.println("Sorted by BUCKET SORT");

    }
}
