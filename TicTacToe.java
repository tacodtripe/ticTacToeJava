package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		 Scanner entry = new Scanner(System.in);
	        int holder = 0, moves = 1;
	        Character lastPlayer = 'X';
	        Character[] gameBoard = new Character[9];
	        boolean playing = true;
	    	for(int i = 0; i < gameBoard.length ; i++) {
	        	gameBoard[i] = new Character('_');
	        }
	        do {
	        	holder = 0;
	        	if(moves%2==0) {
	        		lastPlayer = new Character('O');
	        	} else {
	        		lastPlayer = new Character('X');
	        	}
	            System.out.println("\n---1-2-3---");
	            for(int a = 0; a < 3 ; a++){
	                System.out.print((a + 1) + "| ");
	                for(int i = 0; i < 3; i++) {
	                    System.out.print(gameBoard[holder] + " ");
	                    holder++;
	                }
	                 System.out.print("|\n");
	            }
	            System.out.println("-----------");
	            int nextRow = 0, nextColumn = 0;
	            boolean coordinateBoolean = true;
	            do {
	            	try {
	            		System.out.println(lastPlayer.toString() + " enter the row:");
	            		nextRow = entry.nextInt();
	            		System.out.println(lastPlayer.toString() + " enter the colum:");
	            		nextColumn = entry.nextInt();
	            		if(nextRow > 3 || nextRow < 1 || nextColumn > 3 || nextRow < 1) {
	            			System.out.println("Coordinates should be from 1 to 3!");
	            		} else {
	            			switch(nextRow) {
	            			case 1:
	            				nextColumn -= 1;
	            				break;
	            			case 2:
	            				nextColumn += 2;
	            				break;
	            			case 3:
	            				nextColumn += 5;
	            				break;
	            			}
	            			Character target = new Character(gameBoard[nextColumn]);
	            			if(target.equals(new Character('_')) ) {
	            				gameBoard[nextColumn] = lastPlayer;
	            				coordinateBoolean = false;
	            			} else {
	            				System.out.println("This cell is occupied! Choose another one!");
	            			}
	            		}
	            	} catch(InputMismatchException err) {
	            		entry = new Scanner(System.in);
	            		System.out.println("You should enter numbers!");
	            	}
	            } while (coordinateBoolean);
	            moves++;
	            if(gameBoard[0].equals(lastPlayer) && gameBoard[1].equals(lastPlayer) && gameBoard[2].equals(lastPlayer) ||
	            		gameBoard[3].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[5].equals(lastPlayer) ||
	            		gameBoard[6].equals(lastPlayer) && gameBoard[7].equals(lastPlayer) && gameBoard[8].equals(lastPlayer)) {
	            	holder = 0;
		            System.out.println("\n---1-2-3---");
		            for(int a = 0; a < 3 ; a++){
		                System.out.print((a + 1) + "| ");
		                for(int i = 0; i < 3; i++) {
		                    System.out.print(gameBoard[holder] + " ");
		                    holder++;
		                }
		                 System.out.print("|\n");
		            }
		            System.out.println("-----------");
	            	System.out.println(lastPlayer + " wins");
	            	playing = false;
	            	break;
	            } else if(gameBoard[0].equals(lastPlayer) && gameBoard[3].equals(lastPlayer) && gameBoard[6].equals(lastPlayer) ||
	            		gameBoard[1].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[7].equals(lastPlayer) ||
	            		gameBoard[2].equals(lastPlayer) && gameBoard[5].equals(lastPlayer) && gameBoard[8].equals(lastPlayer)) {
	            	holder = 0;
		            System.out.println("\n---1-2-3---");
		            for(int a = 0; a < 3 ; a++){
		                System.out.print((a + 1) + "| ");
		                for(int i = 0; i < 3; i++) {
		                    System.out.print(gameBoard[holder] + " ");
		                    holder++;
		                }
		                 System.out.print("|\n");
		            }
		            System.out.println("-----------");
	            	System.out.println(lastPlayer + " wins");
	            	playing = false;
	            	break;
	            } else if(gameBoard[0].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[8].equals(lastPlayer) ||
	            		gameBoard[2].equals(lastPlayer) && gameBoard[4].equals(lastPlayer) && gameBoard[6].equals(lastPlayer)) {
	            	holder = 0;
		            System.out.println("\n---1-2-3---");
		            for(int a = 0; a < 3 ; a++){
		                System.out.print((a + 1) + "| ");
		                for(int i = 0; i < 3; i++) {
		                    System.out.print(gameBoard[holder] + " ");
		                    holder++;
		                }
		                 System.out.print("|\n");
		            }
		            System.out.println("-----------");
	            	System.out.println(lastPlayer + " wins");
	            	playing = false;
	            	break;
	            }
	            if (moves == 10) {
	            	holder = 0;
		            System.out.println("\n---1-2-3---");
		            for(int a = 0; a < 3 ; a++){
		                System.out.print((a + 1) + "| ");
		                for(int i = 0; i < 3; i++) {
		                    System.out.print(gameBoard[holder] + " ");
		                    holder++;
		                }
		                 System.out.print("|\n");
		            }
		            System.out.println("-----------");
	            	System.out.println("Draw");
	            	playing = false;
	            }
	        } while(playing);
	        entry.close();
	}
}
