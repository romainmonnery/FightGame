package fightgame.model;

import java.awt.Image;

public interface IArea {

	//Interface created for the class Background : here are the two methods used by this class
	
	//Method which return the dimensions of the image used in backgroud for the game
	public Dimension getDimension();
	
	//method which return the image chosen to be the background of the game
	public Image getImage();
}
