/** Manipulating Arrays  **********************************************/
/*	Your name: Sarah
		Class block: 	G block			Date Started: 10/1 ??
		Lab Number: Lab 2
		Title: Manipulating Arrays
		Purpose: To gain proficiency implementing one-dimensional built-in arrays.
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
    
    System.out.print("\nSmallest element first: ");

    System.out.print("\narray positions:");
    for (var i = 0; i < revisedArray.length; i++){
      for (var x = 0; x<4-customMath.countLength(i);x++){
        System.out.print(" ");
      }
      System.out.print(" "+i);
    }

    System.out.print("\narray entries:  ");

    for (var i = 0; i < revisedArray.length; i++){
      for (var x = 0; x<4-customMath.countLength(revisedArray[i]);x++){
        System.out.print(" ");
      }
      System.out.print(" "+revisedArray[i]);
    }

    System.out.print("\n\n");

    return revisedArray;
  }

  public int[] copyArray(int[] arrayFrom){
    int[] arrayTo = new int[arrayFrom.length];

    for (var i = 0; i<arrayFrom.length;i++){
      arrayTo[i]=arrayFrom[i];
    }

    return arrayTo;
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

  public int[] rotate(int[] array, int steps){
    int[] revisedArray = new int[array.length];
    for (var i = 0; i < array.length; i++){
      int newLocation = i+steps;
      do{
        if (newLocation>=array.length){
        newLocation=-1*(array.length-newLocation);
        }
        if (newLocation<0){
          newLocation= array.length+newLocation;
        }
      }while((newLocation>=array.length)||(newLocation<0));
      
      revisedArray[newLocation]=array[i];
    }

    System.out.print("\nrotated array ");

    System.out.print("\narray positions:");
    for (var i = 0; i < revisedArray.length; i++){
      for (var x = 0; x<4-customMath.countLength(i);x++){
        System.out.print(" ");
      }
      System.out.print(" "+i);
    }

    System.out.print("\narray entries:  ");

    for (var i = 0; i < revisedArray.length; i++){
      for (var x = 0; x<4-customMath.countLength(revisedArray[i]);x++){
        System.out.print(" ");
      }
      System.out.print(" "+revisedArray[i]);
    }

    System.out.print("\n\n");

    return revisedArray;
  }

  public int[] delete(int[] array){
    int revisedArrayLength = 0;
    int nextSlot=0;
    for (var i = 0;i<array.length; i++){
      if(array[i]!=0){
        revisedArrayLength++;
      }
    }

    int[] revisedArray = new int[revisedArrayLength];

    for (var i = 0;i<array.length; i++){
      if(array[i]!=0){
        revisedArray[nextSlot]=array[i];
        nextSlot++;
      }
    }

    return revisedArray;
  }
}