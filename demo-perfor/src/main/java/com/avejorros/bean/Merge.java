package com.avejorros.bean;

import com.avejorros.interfaces.ISorting;

public class Merge<T extends Comparable<T>>
    implements ISorting<T> {

  @SuppressWarnings("unchecked")
  @Override
  public void sort(T[] arr) {
    if (arr.length < 2) {
      return;
    }
    int mid = arr.length / 2;
    T[] left = (T[]) new Comparable[mid];
    T[] right = (T[]) new Comparable[arr.length - mid];

    System.arraycopy(arr, 0, left, 0, mid);
    System.arraycopy(arr, mid, right, 0, arr.length - mid);

    sort(left);
    sort(right);
    merge(arr, left, right);
  }

  private void merge(T[] array, T[] left, T[] right) {
    int i = 0, j = 0, k = 0;
    while (i < left.length && j < right.length) {
      if (left[i].compareTo(right[j]) <= 0) {
        array[k++] = left[i++];
      } else {
        array[k++] = right[j++];
      }
    }
    while (i < left.length) {
      array[k++] = left[i++];
    }
    while (j < right.length) {
      array[k++] = right[j++];
    }
  }
}
