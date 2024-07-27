package com.magical.arena.game.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.magical.arena.game.Game;
import com.magical.arena.game.PlayerDetails;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    PlayerDetails player1;
    PlayerDetails player2;
    Game game;
    
    //Testing methods that use randomness can be challenging because the output is not deterministic. 
    //For example, you can test that the rollDice method always returns a number between 1 and 6.

    @BeforeEach
    public void setup() {  
    player1 = new PlayerDetails("Player 1", 10, 2, 2);
    player2 = new PlayerDetails("Player 2", 10, 2, 2);
    game = new Game(player1, player2);
    }

    @Test
    public void testRollDice() {
        int roll = game.rollDice();
        assertTrue(roll >= 1 && roll <= 6);
    }

  //Testing methods that use randomness can be challenging because the output is not deterministic. 
    @Test
    public void testStart_Player1Wins() {
        player1.setPlayerHealth(10);
        player1.setPlayerAttack(2);
        player1.setPlayerStrength(2);
        player2.setPlayerHealth(5);
        player2.setPlayerAttack(2);
        player2.setPlayerStrength(2);

        game.start();

        assertTrue(player1.isPlayerAlive());
        assertFalse(player2.isPlayerAlive());
    }

  //Testing methods that use randomness can be challenging because the output is not deterministic. 
    
    @Test
    public void testStart_Player2Wins() {
        player1.setPlayerHealth(5);
        player1.setPlayerAttack(2);
        player1.setPlayerStrength(2);
        player2.setPlayerHealth(10);
        player2.setPlayerAttack(2);
        player2.setPlayerStrength(2);

        game.start();

        assertFalse(player1.isPlayerAlive());
        assertTrue(player2.isPlayerAlive());
    }

  //Testing methods that use randomness can be challenging because the output is not deterministic. 
    @Test
    public void testStart_Draw() {
        player1.setPlayerHealth(5);
        player1.setPlayerAttack(2);
        player1.setPlayerStrength(2);
        player2.setPlayerHealth(5);
        player2.setPlayerAttack(2);
        player2.setPlayerStrength(2);

        game.start();

        assertFalse(player1.isPlayerAlive());
        assertFalse(player2.isPlayerAlive());
    }
}