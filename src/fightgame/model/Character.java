package fightgame.model;

import java.awt.Image;
import java.util.ArrayList;

public abstract class Character {

	// Attributes that are the main caracteristics of each character
	protected int healthPoint;
	protected int attackPower;
	// Here a the attributes used to read the image and stock it
	protected Image image;
	protected ArrayList<Image> bImage;

	// Constructor of a character with specific hps and attack power
	public Character(int healthPoint, int attackPower) {
		this.healthPoint = healthPoint;
		this.attackPower = attackPower;
	}

	// Abstract method that is available for each character

	// Getting the image of a specific character
	public abstract ArrayList<Image> getImage();

}
