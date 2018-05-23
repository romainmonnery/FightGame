package fightgame.controller;
import fightgame.model.Character;

public class FightMecanics {
		
	//Method which set the correct amount of hp after an attack
	public void attack(Character attacker, Character target) {
		target.setHp(target.getHp() - attacker.getAp());
	}
	
	public void block(Character blocker) {
		blocker.setHp(blocker.getHp()); 
	}
	
	
}