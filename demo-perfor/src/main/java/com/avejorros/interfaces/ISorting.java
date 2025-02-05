package com.avejorros.interfaces;

public interface ISorting<T extends Comparable<T>> {
  void sort(T[] arr);
}
