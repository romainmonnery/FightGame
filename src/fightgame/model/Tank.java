package fightgame.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Tank extends Character {

	//Final and static attributes which are specific to a tank character
	private static final int HEALTHPOINT = 5;
	private static final int ATTACKPOWER = 1;
	private int hp;

	//Constructor : create a healer character with tank's caracteristics and read the tank's image
	public Tank() {
		super(HEALTHPOINT, ATTACKPOWER);
		
		bImage = new ArrayList();
		hp = HEALTHPOINT;
		
		try {
			image = ImageIO.read(new File("tauren.png"));
			bImage.add(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Getting the image of a tank character
	@Override
	public ArrayList<Image> getImage() {
		return this.bImage;
	}
	
	//Getting current hp of a character
	public int getHp() {
		return this.hp;
	}
	
	//Getting the attack power of a character
	public int getAp() {
		return this.ATTACKPOWER;
	}

}
