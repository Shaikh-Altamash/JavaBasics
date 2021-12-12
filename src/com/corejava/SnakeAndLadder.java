package com.corejava;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int dieRollNumber = 0;
        int playerPosition = 0;
        int maxPosition = 100;
        int computerPosition = 0;
        int computerRollDie = 0;
        int playerRollDie = 0;

        while (playerPosition < maxPosition && computerPosition < maxPosition) {
            double rollDie = Math.floor((Math.random() * 10) % 6 + 1);
            System.out.println("the roll die is = " + rollDie);
            double check = Math.floor((Math.random() * 10) % 3);
            dieRollNumber++;
            if (dieRollNumber % 2 == 0) {
                playerRollDie++;
                switch ((int) check) {
                    case 0:
                        System.out.println("no play");
                        System.out.println("current position for player  = " + playerPosition);
                        break;

                    case 1:
                        System.out.println("ladder " + rollDie);
                        if (playerPosition + rollDie > 100) {
                            playerPosition += 0;
                            System.out.println("current position for player  = " + playerPosition);

                        } else {
                            playerPosition += rollDie;
                            System.out.println("current position for player = " + playerPosition);

                        }
                        break;
                    case 2:
                        System.out.println("snake " + rollDie);
                        if (playerPosition - rollDie <= 0) {
                            playerPosition = 0;
                            System.out.println("current position for player = " + playerPosition);

                        } else {
                            playerPosition -= rollDie;
                            System.out.println("current position for player = " + playerPosition);
                        }
                        break;
                }
            }
            else{
                computerRollDie++;
                switch ((int) check) {
                    case 0:
                        System.out.println("no play");
                        System.out.println("current position for computer  = " + computerPosition);
                        break;

                    case 1:
                        System.out.println("ladder " + rollDie);
                        if (computerPosition + rollDie > 100) {
                            computerPosition += 0;
                            System.out.println("current position for computer = " + computerPosition);

                        } else {
                            computerPosition += rollDie;
                            System.out.println("current position for computer = " + computerPosition);

                        }
                        break;
                    case 2:
                        System.out.println("snake " + rollDie);
                        if (computerPosition - rollDie <= 0) {
                            computerPosition = 0;
                            System.out.println("current position for computer  = " + playerPosition);

                        } else {
                            computerPosition -= rollDie;
                            System.out.println("current position for computer  = " + computerPosition);
                        }
                        break;
                }
            }
            if(computerPosition == 100){
                System.out.println("You lost the game your current position = " + playerPosition + " Computer's position is = "+computerPosition);
                System.out.println("Total roll die taken by computer = "+ computerRollDie + " Total roll die taken by you "+ playerRollDie);
            }
            else {
                System.out.println("You won the game your current position = " + playerPosition + " Computer's position is = "+computerPosition);
                System.out.println("Total roll die taken by computer = "+ computerRollDie + " Total roll die taken by you "+ playerRollDie);

            }

        }
    }
}