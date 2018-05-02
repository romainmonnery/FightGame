package fightgame.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Background {
	
	//attributes which specify the proportions in pixels of the background image
	private int width = 336;
	private int height = 800;
	//Image and Arraylist that will contain the image file
	private Image image;
	private ArrayList<Image> bImage;
	
	//constructor which builds the area with the dimensions of the picture and then read and stock the picture 
	//in an ArrayList 
	public Background(int width, int height) {
		this.width = width;
		this.height = height;
		
		bImage = new ArrayList();
		
		try {
			image = ImageIO.read(new File("BackgroundImage.gif"));
			bImage.add(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//getter which returns the ArrayList containing the background image
	public ArrayList<Image> getImage() {
		return this.bImage;
	}
}
