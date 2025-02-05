package com.avejorros.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateNumber {
  public static void randomNumbers(String fileName, int max) {
    Random random = new Random();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
      for (int i = 0; i < max; i++) {
        writer.write(String.valueOf(random.nextInt(10000)));
        writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace(System.out);
    }
  }
  
  public static Integer[] getNumbers(String fileName){
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                         .map(Integer::parseInt)
                         .toArray(Integer[]::new);
        } catch (IOException e) {
            e.printStackTrace(System.out);
            return new Integer[0];
        }
  }
}
