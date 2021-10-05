import java.util.Scanner;

public class menu {

  getInput getInput = new getInput();
  Lab_2 arrayFunctions = new Lab_2();
  
  public menu() {

    runMenu();
  }

  public void runMenu() {
    System.out.println("Welcome to Manipulating Arrays!\n");
    
    int[] arraySample = new int[0];
    arraySample = arrayFunctions.createArray();

    int choice = 0;
    do {
      System.out.println("Please Choose a method:");
      System.out.println("1. Display");
      System.out.println("2. Search");
      System.out.println("3. Smallest");
      System.out.println("4. Rotate");
      System.out.println("5. Delete");
      System.out.println("0. Quit");

      choice = getInput.integerSample("");

      if (choice == 1) {
        
      } 
      else if (choice == 2) {
        
      } 
      else if (choice == 3) {
        
      } 
      else if (choice == 4) {
        
      } 
      else if (choice == 5) {
        
      }
      else if (choice == 0) {
        
      }
      
    } while (choice != 0);
    
  }

}