package com.magical.arena.game;

import java.util.Random;

public class Game {
	PlayerDetails playerDetails1;
	PlayerDetails playerDetails2;
    Random random = new Random();

    public Game(PlayerDetails playerDetails1, PlayerDetails playerDetails2) {
		this.playerDetails1 = playerDetails1;
		this.playerDetails2 = playerDetails2;
	}

	public void start() {
		//Choosing attacker and defender based on health -> Player with lower health attacks first at the start of a match
    	PlayerDetails attacker = playerDetails1.getPlayerHealth() <= playerDetails2.getPlayerHealth() ? playerDetails1 : playerDetails2;
    	PlayerDetails defender = attacker == playerDetails1 ? playerDetails2 : playerDetails1;

        while (playerDetails1.isPlayerAlive() && playerDetails2.isPlayerAlive()) {
            int attackRoll = rollDice();
            int defendRoll = rollDice();
            int attackDamage = attacker.getPlayerAttack() * attackRoll;
            int defendStrength = defender.getPlayerStrength() * defendRoll;
            int damage = Math.max(0, attackDamage - defendStrength);
            defender.setPlayerHealth(defender.getPlayerHealth()-damage);

            System.out.println((attacker == playerDetails1 ? "Player("+playerDetails1.getPlayerName()+")" : "Player("+playerDetails2.getPlayerName()+")") + " attacks with roll " + attackRoll +
                    ", Player(" + (defender == playerDetails1 ? playerDetails1.getPlayerName()+")" : playerDetails2.getPlayerName()+")") + " defends with roll " + defendRoll +
                    ". Damage: " + damage + ". Health left: " + defender.getPlayerHealth());

            // Switch roles
            PlayerDetails temp = attacker;
            attacker = defender;
            defender = temp;
        }
        System.out.println("Game Over! " + (playerDetails1.isPlayerAlive() ? "Player("+playerDetails1.getPlayerName()+") wins!" : "Player("+playerDetails2.getPlayerName()+") wins!"));
    }

    public int rollDice() {
        return random.nextInt(6) + 1;
    }
}
