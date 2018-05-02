package fightgame.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Healer extends Character{
	
	//Final and static attributes which are specific to a healer character
	private static final int HEALTHPOINT = 4;
	private static final int ATTACKPOWER = 1;

	//Constructor : create a healer character with healers's caracteristics and read the healer's image
	public Healer() {
		super(HEALTHPOINT, ATTACKPOWER);
		
		bImage = new ArrayList();
		
		try {
			image = ImageIO.read(new File("healer.png"));
			bImage.add(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Getting the image of a healer character
	@Override
	public ArrayList<Image> getImage() {
		return this.bImage;
	}
	
}
