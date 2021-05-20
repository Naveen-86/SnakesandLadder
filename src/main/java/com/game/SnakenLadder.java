package com.game;

import java.util.Random;

public class SnakenLadder {

    public static void main(String[] args) {

        final int START_POSITION = 0;
        System.out.println("You are at position : " + START_POSITION);
        final int NO_PLAY = 0;
        final int LADDER = 1;
        final int SNAKE = 2;
        int position = 0;

        System.out.println("Rolling Dice" );

        Random o = new Random();
        int option = o.nextInt(3);

        Random r = new Random();
        int dice_Roll = r.nextInt(6)+1;

        switch(option) {

            case NO_PLAY:
                System.out.println("Sorry,no play!");
                break;
            case LADDER:
                position += dice_Roll;
                System.out.println("Yahoo,you got ladder!");
                break;
            case SNAKE:
                position -= dice_Roll;
                System.out.println("hiss,snake bite!");
                break;
        }
        System.out.println("After Rolling dice You are at position : " + position);
    }

}
