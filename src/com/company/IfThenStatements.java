package com.company;

public class IfThenStatements {

    public static void main(String[] args) {
        // simple example of if/else statement
        boolean isAlien = true;
        if (!isAlien)
            System.out.println("It is not an alien");
        else {
            System.out.println("It is an alien!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        // can do same thing as &&(and operator) with or(||) and it will run because topScore is less than 100, only one condition has to be true.
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }


    }
}
