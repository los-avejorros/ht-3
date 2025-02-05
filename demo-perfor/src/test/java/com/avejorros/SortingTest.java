package com.avejorros;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.avejorros.bean.Bucket;
import com.avejorros.bean.Insertion;
import com.avejorros.bean.Merge;
import com.avejorros.bean.Quick;
import com.avejorros.bean.Radix;
import com.avejorros.interfaces.ISorting;

public class SortingTest {
  @Test
  public void testInsertionSort() {
    ISorting<Integer> sorter = new Insertion<>();
    Integer[] input = { 5, 2, 9, 1, 5, 6 };
    Integer[] expected = { 1, 2, 5, 5, 6, 9 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void testMergeSort() {
    ISorting<Integer> sorter = new Merge<>();
    Integer[] input = { 5, 2, 9, 1, 5, 6 };
    Integer[] expected = { 1, 2, 5, 5, 6, 9 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void testQuickSort() {
    ISorting<Integer> sorter = new Quick<>();
    Integer[] input = { 5, 2, 9, 1, 5, 6 };
    Integer[] expected = { 1, 2, 5, 5, 6, 9 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void testRadixSort() {
    ISorting<Integer> sorter = new Radix();
    Integer[] input = { 170, 45, 75, 90, 802, 24, 2, 66 };
    Integer[] expected = { 2, 24, 45, 66, 75, 90, 170, 802 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void testBucketSort() {
    ISorting<Integer> sorter = new Bucket<>();
    Integer[] input = { 5, 2, 9, 1, 5, 6 };
    Integer[] expected = { 1, 2, 5, 5, 6, 9 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  // Prueba para un arreglo vacío
  @Test
  public void testEmptyArray() {
    ISorting<Integer> sorter = new Insertion<>();
    Integer[] input = {};
    Integer[] expected = {};
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  // Prueba para un arreglo con un solo elemento
  @Test
  public void testSingleElementArray() {
    ISorting<Integer> sorter = new Insertion<>();
    Integer[] input = { 42 };
    Integer[] expected = { 42 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  // Prueba para un arreglo ya ordenado
  @Test
  public void testAlreadySortedArray() {
    ISorting<Integer> sorter = new Insertion<>();
    Integer[] input = { 1, 2, 3, 4, 5 };
    Integer[] expected = { 1, 2, 3, 4, 5 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }

  // Prueba para un arreglo con elementos duplicados
  @Test
  public void testArrayWithDuplicates() {
    ISorting<Integer> sorter = new Insertion<>();
    Integer[] input = { 3, 1, 2, 3, 1 };
    Integer[] expected = { 1, 1, 2, 3, 3 };
    sorter.sort(input);
    assertArrayEquals(expected, input);
  }
}
