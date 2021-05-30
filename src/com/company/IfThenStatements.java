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

        int topScore = 81;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 80;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
