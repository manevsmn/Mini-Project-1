/*
Mini Project 1
Group #1: Martin Manevski, Jamie Schaffer, Nicholas Warren, Mariam Bahassi
Date: 2/16/2021
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:"); 
    
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");
    
    playGame(randomNum, userNum);
  }

  static void playGame(int theRandomNum, int theUserNum){
    Scanner s2 = new Scanner(System.in);
    int numTries = 0;
    int userGuess;

    System.out.println("Please guess a number between 0 and " + theUserNum); userGuess = s2.nextInt();
    numTries++;

    while (userGuess != theRandomNum) {      
      if (userGuess > theRandomNum) {System.out.println("Guess lower!");
      numTries++;}

      else if(userGuess < theRandomNum) {System.out.println("Guess higher!");
      numTries++;}
      
      System.out.println("Enter your new guess: "); userGuess = s2.nextInt();}

      System.out.println("Great, you win! It took you " + numTries + " tries.");
  }
}