package com.game;

import java.util.Random;

public class SnakenLadder {

    public static void main(String[] args) {

        // constants
        final int START_POSITION = 0;
        System.out.println("You are at position : " + START_POSITION);
        final int WINNING_POSITION = 100;
        final int NO_PLAY = 0;
        final int LADDER = 1;
        final int SNAKE = 2;
        //Variables
        int position = 0;
        int noOfdieRolls = 0;
        System.out.println("Rolling Dice" );

        while(position != WINNING_POSITION) {

            noOfdieRolls++;
            Random o = new Random();
            int option = o.nextInt(3);

            Random r = new Random();
            int dice_Roll = r.nextInt(6)+1;

            switch(option) {

                case NO_PLAY:
                    System.out.println("Sorry,no play!");
                    break;
                case LADDER:
                    if (position + dice_Roll <= WINNING_POSITION ) {
                        position += dice_Roll;
                    }
                    System.out.println("Yahoo,you got ladder!");
                    break;
                case SNAKE:
                    if (position - dice_Roll >= 0) {
                        position -= dice_Roll;
                        System.out.println("hiss,snake bite!");
                    } else {
                        position = 0;
                    }
                    break;
            }
            System.out.println("After Rolling dice You are at position : " + position);
        }
        System.out.println("Number of times Die rolled : " + noOfdieRolls);
        System.out.println("HURRAY!,You are win");
    }
}
