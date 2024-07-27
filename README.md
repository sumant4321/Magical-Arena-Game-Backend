# Magical Arena Game

## 1.Overview
In an arena match, two players take turns attacking. The attacker rolls attack dice and the defender rolls defense dice. 
The attacker's damage is their attack value times the dice roll, and the defender's damage reduction is their strength times the dice roll. 
Any excess damage reduces the defender's health. 
The game ends when a player's health reaches zero. The player with lower health attacks first at the start.


## 2.Result of the Magical Arena Game

**********Start Game ************

Enter the details of two player in sequential manner.Let's go.......

Enter the First Player Name:A

Enter the Second Player Name:B

Please enter Health(+ve) of Player(A): 50

Please enter Strength(+ve) of Player(A): 5

Please enter Attack(+ve) of Player(A): 10

Please enter Health(+ve) of Player(B): 100

Please enter Strength(+ve) of Player(B): 10

Please enter Attack(+ve) of Player(B): 5

Player(A) attacks with roll 6, Player(B) defends with roll 6. Damage: 0. Health left: 100

Player(B) attacks with roll 6, Player(A) defends with roll 1. Damage: 25. Health left: 25

Player(A) attacks with roll 1, Player(B) defends with roll 3. Damage: 0. Health left: 100

Player(B) attacks with roll 1, Player(A) defends with roll 1. Damage: 0. Health left: 25

Player(A) attacks with roll 3, Player(B) defends with roll 4. Damage: 0. Health left: 100

Player(B) attacks with roll 5, Player(A) defends with roll 5. Damage: 0. Health left: 25

Player(A) attacks with roll 6, Player(B) defends with roll 2. Damage: 40. Health left: 60

Player(B) attacks with roll 2, Player(A) defends with roll 6. Damage: 0. Health left: 25

Player(A) attacks with roll 2, Player(B) defends with roll 4. Damage: 0. Health left: 60

Player(B) attacks with roll 6, Player(A) defends with roll 5. Damage: 5. Health left: 20

Player(A) attacks with roll 3, Player(B) defends with roll 5. Damage: 0. Health left: 60

Player(B) attacks with roll 4, Player(A) defends with roll 4. Damage: 0. Health left: 20

Player(A) attacks with roll 6, Player(B) defends with roll 5. Damage: 10. Health left: 50

Player(B) attacks with roll 3, Player(A) defends with roll 5. Damage: 0. Health left: 20

Player(A) attacks with roll 4, Player(B) defends with roll 1. Damage: 30. Health left: 20

Player(B) attacks with roll 6, Player(A) defends with roll 2. Damage: 20. Health left: 0

Game Over! Player(B) wins!


## 3.Test Cases is also added in the repository in package com.magical.arena.game.test of class name GameTest.java

## 4.How to Run the Game:-
   ` 1) Import the provided repository in eclipse IDE and set the run (or debug) configururation with class name MagicalArena.java(contains main method()).`
   
   ` 2) Go to the run dropdown and select the MagicalArena. `
   
   ` 3.User Input will be like the below :- `
   
      ` **********Start Game ************`
      
      ` Enter the details of two player in sequential manner.Let's go.......`
      
      ` Enter the First Player Name:A`
      
      ` Enter the Second Player Name:B`
      
      ` Please enter Health(+ve) of Player(A): 50`
      
      ` Please enter Strength(+ve) of Player(A): 5`
      
      ` Please enter Attack(+ve) of Player(A): 10`
      
      ` Please enter Health(+ve) of Player(B): 100`
      
      ` Please enter Strength(+ve) of Player(B): 10`
      
      ` Please enter Attack(+ve) of Player(B): 5 `
	
## 5.TO Run the test cases 
  `1)Right click on the provided Test cases file (GameTest.java)`
  
  `2)click on run as(or debug as) Junit test.`
  
  `3)Note:- Testing methods that use randomness can be challenging because the output is not deterministic. For example, you can test that the rollDice method always returns a number between 1 and 6.`
  
