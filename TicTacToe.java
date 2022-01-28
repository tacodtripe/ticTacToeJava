package com;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		System.out.print("Enter cells:");
        Scanner entry = new Scanner(System.in);
        char[] c = "_OOOO_X_X".toCharArray();
        int holder = 0;
        Character lastPlayer = new Character('X');
        Character[] gameBoard = new Character[9];
        
        for(int i = 0; i < gameBoard.length ; i++) {
        	gameBoard[i] = new Character('i');
        }
        
        System.out.print(c);
        System.out.println("\n---------");
        for(int a = 0; a < 3 ; a++){
            System.out.print("| ");
            for(int i = 0; i < 3; i++) {
                System.out.print(c[holder] + " ");
                holder++;
            }
             System.out.print("|\n");
        }
        System.out.println("---------");
        
        int xCount = 0;
        int oCount = 0;
        for(Character car: c) {
        	if(car.equals('X')) {
        		xCount++;
        	} else if(car.equals('O')) {
        		oCount++;
        	}
        }
        int gameEnds = 0;
        for(int i = 0 ; i < gameBoard.length ; i++) {
        	gameBoard[i] = c[i];
        }
    	if(gameBoard[0].equals(gameBoard[1]) && gameBoard[1].equals(gameBoard[2])){
    		gameEnds++;
    	}
    	if(gameBoard[3].equals(gameBoard[4]) && gameBoard[4].equals(gameBoard[5])) {
    		gameEnds++;
    	}
    	if(gameBoard[6].equals(gameBoard[7]) && gameBoard[7].equals(gameBoard[8])) {
    		gameEnds++;
    	}
    	if(gameBoard[0].equals(gameBoard[3]) && gameBoard[3].equals(gameBoard[6])) {
    		gameEnds++;
    	}
    	if(gameBoard[1].equals(gameBoard[4]) && gameBoard[4].equals(gameBoard[7])) {
    		gameEnds++;
    	}
    	if(gameBoard[2].equals(gameBoard[5]) && gameBoard[5].equals(gameBoard[8])) {
    		gameEnds++;
    	}
    	if(gameBoard[0].equals(gameBoard[4]) && gameBoard[4].equals(gameBoard[8])) {
    		gameEnds++;
    	}
    	if(gameBoard[2].equals(gameBoard[4]) && gameBoard[4].equals(gameBoard[6])) {
    		gameEnds++;
    	}
        if(gameEnds > 1 || Math.abs((double)(xCount - oCount)) >= 2) {
        	System.out.println("Impossible");
        } else {
        	 boolean draw = true, notFinished = false;
             for(int i = 0 ; i < gameBoard.length ; i++) {
             	lastPlayer = c[i];
             	if(gameBoard[0].equals(lastPlayer) && gameBoard[1].equals(lastPlayer) && gameBoard[2].equals(lastPlayer) ||
             	   gameBoard[3].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[5].equals(lastPlayer) ||
             	   gameBoard[6].equals(lastPlayer) && gameBoard[7].equals(lastPlayer) && gameBoard[8].equals(lastPlayer)) {
             		System.out.println(lastPlayer + " wins");
             		draw = false;
             		break;
             	} else if(gameBoard[0].equals(lastPlayer) && gameBoard[3].equals(lastPlayer) && gameBoard[6].equals(lastPlayer) ||
             			gameBoard[1].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[7].equals(lastPlayer) ||
             			gameBoard[2].equals(lastPlayer) && gameBoard[5].equals(lastPlayer) && gameBoard[8].equals(lastPlayer)) {
             		System.out.println(lastPlayer + " wins");
             		draw = false;
             		break;
             	} else if(gameBoard[0].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[8].equals(lastPlayer) ||
             			gameBoard[2].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[6].equals(lastPlayer)) {
             		System.out.println(lastPlayer + " wins");
             		draw = false;
             		break;
             	}
             	
             	if(i==7) {
             		for(Character car: gameBoard) {
             			if(car.equals(new Character('_'))) {
             				notFinished = true;
             			}
             		}
             	}
             }
             if(notFinished) {
             	System.out.println("Game not finished");
             } else if (draw) {
             	System.out.println("Draw");
             }
        }
        entry.close();
	}
}
