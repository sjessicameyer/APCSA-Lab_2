//Add functions to file: getInput getInput = new getInput();
import java.util.Scanner;

public class getInput{

  private Scanner input;

  public getInput(){
  }

  public int integerSample(String prompt){
    input = new Scanner(System.in);
    int inputNumber = 0;
    System.out.print(prompt);
    inputNumber = input.nextInt();
    return inputNumber;
  }

  public double doubleSample(String prompt){
    input = new Scanner(System.in);
    double inputNumber = 0.0;
    System.out.print(prompt);
    inputNumber = input.nextDouble();
    return inputNumber;
  }

  public String stringSample(String prompt){
    input = new Scanner(System.in);
    String inputWord = "";
    System.out.print(prompt);
    inputWord = input.next();
    return inputWord;
  }

  public char characterSample(String prompt){
    input = new Scanner(System.in);
    char inputCharacter = ' ';
    System.out.print(prompt);
    inputCharacter = input.next().charAt(0);
    return inputCharacter;
  }

  public String stringLineSample(String prompt){
    input = new Scanner(System.in);
    String inputWords = "";
    System.out.print(prompt);
    inputWords = input.nextLine();
    return inputWords;
  }
}