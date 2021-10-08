/** Heading  **********************************************/
/*	Your name:
		Class block: 				Date Started:
		Lab Number:
		Title:
		Purpose:
*/

import java.util.Scanner;

public class Lab_2{
  getInput getInput = new getInput();
  customMath customMath = new customMath();
  
  public Lab_2(){

    
  }

  public int[] smallest(int[] array){
    int smallestItemPosition=0;

    for (int i=0; i<array.length; i++){
      if (array[i]<array[smallestItemPosition]){
        smallestItemPosition=i;
      }
    }

    int[] revisedArray = new int[0];
    revisedArray= copyArray(array);
    revisedArray[0]=array[smallestItemPosition];
    revisedArray[smallestItemPosition]=array[0];

    return revisedArray;
  }

  public int[] copyArray(int[] copyFrom){
    int[copyFrom.length] copyTo= new int[copyFrom.length]
    for (var i = 0; i<copyFrom.length; i++){
      copyTo[i]=copyFrom[i];
    }
  }

  public int search(int[] array, int entry){
    for (int i=0; i<array.length; i++){
      if (entry==array[i]){
        return i;
      }
    }
    return -1;
  }

  public int[] createArray(){
    int arrayLength = getInput.integerSample("How many numbers would you like to enter: ");
    int[] sampleArray = new int[arrayLength];
    System.out.println("");
    for (int i = 0; i < arrayLength; i++){
      sampleArray[i] = getInput.integerSample("Please enter position "+i+": ");
    }
    System.out.println("");
    return sampleArray;
  }

  public void display(int[] array){
    System.out.print("\nsize of array: "+array.length);

    System.out.print("\narray positions:");
    for (var i = 0; i < array.length; i++){
      for (var x = 0; x<4-customMath.countLength(i);x++){
        System.out.print(" ");
      }
      System.out.print(" "+i);
    }

    System.out.print("\narray entries:  ");

    for (var i = 0; i < array.length; i++){
      for (var x = 0; x<4-customMath.countLength(array[i]);x++){
        System.out.print(" ");
      }
      System.out.print(" "+array[i]);
    }

    System.out.print("\n\n");
  }
}