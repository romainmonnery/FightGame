package fightgame.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Damager extends Character {

	// Final and static attributes which are specific to a damager character
	private static final int HEALTHPOINT = 3;
	private static final int ATTACKPOWER = 2;
	private int hp;

	// Constructor : create a healer character with damager's caracteristics and
	// read the damager's image
	public Damager() {
		super(HEALTHPOINT, ATTACKPOWER);

		bImage = new ArrayList();
		hp = HEALTHPOINT;

		try {
			image = ImageIO.read(new File("orc_lord.png"));
			bImage.add(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Getting the image of a damager character
	@Override
	public ArrayList<Image> getImage() {
		return this.bImage;
	}

	// Getting current hp of a character
	public int getHp() {
		return this.hp;
	}

	// Getting the attack power of a character
	public int getAp() {
		return this.ATTACKPOWER;
	}

	//Method which calculates the amount of damage dealt by an attack of a damagr character
	public void attackDamager() {
		this.hp = this.getHp() - this.getAp();

	}
}
