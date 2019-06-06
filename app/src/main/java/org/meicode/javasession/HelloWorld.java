package org.meicode.javasession;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello " + name + ", good afternoon");
        System.out.println("Shall we begin?");
        String answer = scanner.next();
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Shall we begin?");
            answer = scanner.next();
        }

        Random random = new Random();
        int x = random.nextInt(20)+1;
        System.out.println("Please guess a number: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            if (timesTried >=4) {
                shouldFinish = true;
                hasWon = false;
                continue;
            }

            if (x == userInput) {
                hasWon = true;
                shouldFinish = true;
                timesTried++;
            }else if (userInput <x) {
                System.out.println("Guess higher");
                userInput = scanner.nextInt();
                timesTried++;
            }else {
                System.out.println("Guess lower");
                userInput = scanner.nextInt();
                timesTried++;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations, You have guessed the number in " + timesTried + " time");
        }else {
            System.out.println("Game over!");
            System.out.println("The number was " + x);
        }

        /**
         * Challenge: Create a guess me game
         * Receive the user's name
         * say some greeting to the user
         * ask the user to start the game
         * make a random number and save it in an integer called x
         * if input is greater than x, tell the user to guess smaller
         * if input is less than x, tell the user to guess higher
         * if input is equal to x, say congratulations to the user for his/her winning
         * make a rule that the user could only guess up to 5 times
         * if it's 5 or more then show a game over message
         */
    }
}
