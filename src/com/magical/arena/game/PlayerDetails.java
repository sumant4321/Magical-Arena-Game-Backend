package com.magical.arena.game;

public class PlayerDetails {
	//Every Player is defined by a health attribute, strength attribute and an attack attribute.
	private String playerName;
	private int playerHealth;
	private int playerStrength;
	private int playerAttack;
    
	public PlayerDetails(String playerName,int playerHealth, int playerStrength, int playerAttack) {
		this.playerHealth = playerHealth;
		this.playerStrength = playerStrength;
		this.playerAttack = playerAttack;
		this.playerName = playerName;
	}
	//checking player is alive , when health must be greater than 0
	public boolean isPlayerAlive() {
        return playerHealth > 0;
    }
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerHealth() {
		return playerHealth;
	}
	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}
	public int getPlayerStrength() {
		return playerStrength;
	}
	public void setPlayerStrength(int playerStrength) {
		this.playerStrength = playerStrength;
	}
	public int getPlayerAttack() {
		return playerAttack;
	}
	public void setPlayerAttack(int playerAttack) {
		this.playerAttack = playerAttack;
	}
	
}
