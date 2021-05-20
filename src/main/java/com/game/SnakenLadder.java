package com.game;

import java.util.Random;

public class SnakenLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snakes and ladders game");

        final int START_POSITION = 0;
        System.out.println("You are at position : " + START_POSITION);

        System.out.println("Rolling Dice" );

        Random dice_Roll = new Random();

        int position = dice_Roll.nextInt(6)+1;

        System.out.println("After Rolling dice You are at position : " + position);

    }
}
