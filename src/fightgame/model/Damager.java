package fightgame.model;

import java.awt.Image;

public class Damager extends Character{

	//Final and static attributes which are specific to a damager character
	private static final int HEALTHPOINT = 3;
	private static final int ATTACKPOWER = 2;

	//Constructor : create a healer character with damager's caracteristics
	public Damager() {
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
