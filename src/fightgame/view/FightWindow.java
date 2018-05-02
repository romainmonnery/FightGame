package fightgame.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import fightgame.model.Damager;
import fightgame.model.Healer;

public class FightWindow extends JFrame {

	public FightWindow(String character) {
		this.setTitle("FightGame");
		this.setSize(1500, 1000);
		this.setLayout(null);
		
		if(character == "Healer") {
			
		}
		
		if(character == "Damager") {
			
		}
		
		if(character == "Tank") {
			
		}
		
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
