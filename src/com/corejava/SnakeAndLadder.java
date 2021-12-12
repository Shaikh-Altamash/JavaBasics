package com.corejava;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int dieRollNumber = 0;
        int playerPosition = 0;
        int maxPosition = 100;

        while(playerPosition < maxPosition){
            double rollDie = Math.floor((Math.random()*10)%6+1);
            System.out.println( "the roll die is = "+rollDie);
            double check = Math.floor((Math.random()*10)%3);
            dieRollNumber++;
            switch ((int)check){
                case 0:
                    System.out.println("no play");
                    System.out.println("current position  = " + playerPosition );
                    break;

                case 1:
                    System.out.println("ladder " + rollDie);
                    if(playerPosition + rollDie >100) {
                        playerPosition += 0;
                        System.out.println("current position  = " + playerPosition );

                    }
                    else {
                        playerPosition += rollDie;
                        System.out.println("current position  = " + playerPosition );

                    }
                    break;
                case 2:
                    System.out.println("snake "+ rollDie);
                    if(playerPosition - rollDie <= 0){
                        playerPosition = 0;
                        System.out.println("current position  = " +  playerPosition);

                    }
                    else {
                        playerPosition -= rollDie;
                        System.out.println("current position  = " +  playerPosition);
                    }
                    break;
            }
        }
        System.out.println("congratulation you won the game , attempts taken = " +dieRollNumber);
    }
}
