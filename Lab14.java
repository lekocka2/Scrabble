/*
 * Logan Kocka
 * Lab 14
 * Scrabble
 */

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Lab14 {
  
  public static void main(String[] args) throws FileNotFoundException, IOException {
    String[] other = new String[187632];
    File Lab14 = new File("scrambled.txt");
    Scanner input = new Scanner(Lab14);
    int i = 0;
    while(input.hasNextLine()){
      other[i] =input.nextLine();
       i++;
    }

    selectionSort(other);
    System.out.println(other[1]);
    System.out.println(other[other.length-1]);
    System.out.println(other[499]);
    

    FileWriter output = new FileWriter("sorted.txt");
    for(String a : other){
      output.write(a + "\n");
    }
    output.close();
  }
  public static void selectionSort(String[] array){ 
    for(int i= 0; i < array.length; i++){ 
      int min = i; 
      for(int j = i+1; j < array.length; j++){ 
        //For every item after i, check for a new min. 
        if(array[min].compareTo(array[j]) > 0){ 
          min = j; 
        } 
      } 
      if(min != i){ 
        //Swap Elements! 
        swap(array, i, min); 
      } 
    } 
  }
  public static void swap(String[] array, int a, int b){ 
    String temp = array[a]; 
    array[a] = array[b]; 
    array[b] = temp; 
  }
}
