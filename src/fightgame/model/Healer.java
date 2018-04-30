package fightgame.model;

import java.awt.Image;

public class Healer extends Character{
	
	//Final and static attributes which are specific to a healer character
	private static final int HEALTHPOINT = 4;
	private static final int ATTACKPOWER = 1;

	//Constructor : create a healer character with healers's caracteristics
	public Healer() {
		super(HEALTHPOINT, ATTACKPOWER);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attack() {
		
		
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
