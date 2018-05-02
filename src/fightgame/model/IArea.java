package fightgame.model;

import java.awt.Image;

public interface IArea {

	//Interface created for the class Background : here are the method used by this class
		
	//method which returns the image chosen to be the background of the game
	public Image getImage();
	
	//method which returns the width of the background image
	public int getWidth();
	
	//method which returns the height of the background image
	public int getHeight();
}
