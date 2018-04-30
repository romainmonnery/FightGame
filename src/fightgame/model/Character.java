package fightgame.model;

import java.awt.Image;

public abstract class Character {
	
	//Attributes that are the main caracteristics of each character
	protected int healthPoint;
	protected int attackPower;

	//Constructor of a character with specific hps and attack power
	public Character(int healthPoint, int attackPower) {
		this.healthPoint=healthPoint;
		this.attackPower=attackPower;
	}
	
	//Abstracts methods that are available for each character
	
	//Getting the image of a specific character
	public abstract Image getImage();
	
	//The action of attacking made by a character
	//The damage made depends of the character chosen
	public abstract void attack();
	
	//The action of blocking made by a character
	//Blocing an attack reduces of 1 the opponents's next attack
	public abstract void block();
	
	//The action of activating a character's special power
	//The special power is specific for each character
	public abstract void specialPower();
}
