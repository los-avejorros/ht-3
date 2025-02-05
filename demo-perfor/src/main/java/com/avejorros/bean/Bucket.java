package com.avejorros.bean;

import java.util.ArrayList;
import java.util.Collections;

import com.avejorros.interfaces.ISorting;

public class Bucket<T extends Comparable<T>>
    implements ISorting<T> {

  @SuppressWarnings("unchecked")
  @Override
  public void sort(T[] arr) {
    if (arr.length == 0)
      return;

    ArrayList<T>[] buckets = new ArrayList[10];
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new ArrayList<>();
    }

    for (T value : arr) {
      int bucketIndex = (value.hashCode() % 10 + 10) % 10; // Ensure the index is positive
      buckets[bucketIndex].add(value);
    }

    int index = 0;
    for (ArrayList<T> bucket : buckets) {
      Collections.sort(bucket);
      for (T value : bucket) {
        arr[index++] = value;
      }
    }
  }

}
