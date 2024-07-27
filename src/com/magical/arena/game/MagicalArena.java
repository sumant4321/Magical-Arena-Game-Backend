package com.magical.arena.game;

import java.util.Scanner;

public class MagicalArena {

	public static void main(String[] args) {
		Scanner scanner = null;
		int playerHealth=0;
		int playerStrength=0;
		int playerAttack=0;
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("**********Start Game ************");
			System.out.println("Enter the details of two player in sequential manner.Let's go.......");
			System.out.print("Enter the First Player Name:");
			String firstName = scanner.nextLine();
			System.out.print("Enter the Second Player Name:");
			String secondName = scanner.nextLine();
			playerHealth = playerDetailsValidation(scanner, firstName,"Health");
			playerStrength = playerDetailsValidation(scanner, firstName,"Strength");
			playerAttack = playerDetailsValidation(scanner, firstName,"Attack");
			PlayerDetails playerDetails1 = new PlayerDetails(firstName,playerHealth, playerStrength, playerAttack);
			playerHealth = playerDetailsValidation(scanner, secondName,"Health");
			playerStrength = playerDetailsValidation(scanner, secondName,"Strength");
			playerAttack = playerDetailsValidation(scanner, secondName,"Attack");
			PlayerDetails playerDetails2 = new PlayerDetails(secondName,playerHealth, playerStrength, playerAttack);
			Game game = new Game(playerDetails1, playerDetails2);
			game.start();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
            if (scanner != null) {
            	scanner.close();
            }
		}
	}

	private static int playerDetailsValidation(Scanner scanner, String name,String definedAttribute) {
		int number=0;
		while (true) {
            System.out.print("Please enter "+ definedAttribute +"(+ve) of Player("+name+"): ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number!");
                scanner.next();
                System.out.print("Please enter a positive integer: ");
            }
            number = scanner.nextInt();
            if (number > 0) {
                break;
            } else {
                System.out.println("The number must be positive!");
            }
        }
		return number;
	}

}
