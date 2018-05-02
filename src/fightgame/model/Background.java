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
	
	public Background(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void getImage() {
		
		ArrayList bImage = new ArrayList();
		Image img;
		
		try {
			img = ImageIO.read(new File("BackgroundImage.gif"));
			bImage.add(img);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
