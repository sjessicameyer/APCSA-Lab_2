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
        arrayFunctions.display(arraySample);
      } 
      else if (choice == 2) {
        boolean continueCycle = true;
        int searchResult=-1;
        do{
          searchResult = arrayFunctions.search(arraySample, getInput.integerSample("\nWhat entry? "));

          if (searchResult==-1){
            System.out.println("status: not found");
          }else{
            System.out.println("status: found at position "+searchResult);
          }

          if (getInput.integerSample("another search (yes(1)/no(0))? ")==0){
            continueCycle=false;
          }
          
        }while(continueCycle);
        System.out.print("\n");
      } 
      else if (choice == 3) {
        arraySample=arrayFunctions.smallest(arraySample);
      } 
      else if (choice == 4) {
        boolean continueCycle=true;
        do{
          arraySample=arrayFunctions.rotate(arraySample,getInput.integerSample("\nhow many steps? "));
          
          if (getInput.integerSample("rotate again? (yes(1)/no(0))? ")==0){
            continueCycle=false;
          }
          
        }while(continueCycle);
      } 
      else if (choice == 5) {
        arrayFunctions.display(arrayFunctions.delete(arraySample));
      }
      else if (choice ==0){
        
      }
      else{
       throw new IndexOutOfBoundsException("The menu option "+choice+" does not exist.");
      }
      
    } while (choice != 0);
    System.out.println("Thank you for using my program");
  }
  
}