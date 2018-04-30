package fightgame.model;

import java.awt.Image;

public class Tank extends Character {

	//Final and static attributes which are specific to a tank character
	private static final int HEALTHPOINT = 5;
	private static final int ATTACKPOWER = 1;

	//Constructor : create a healer character with tank's caracteristics
	public Tank() {
		super(HEALTHPOINT, ATTACKPOWER);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void block() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void specialPower() {
		// TODO Auto-generated method stub
		
	}
}
