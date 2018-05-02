package fightgame.view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fightgame.model.Background;
import fightgame.model.Damager;
import fightgame.model.Healer;

public class FightWindow extends JFrame {

	private JPanel bPanel;
	private JLabel bImage;
	
	public FightWindow(String player, String IA) {
		this.setTitle("FightGame");
		this.setSize(1500, 1000);
		this.setLayout(null);
		
		bPanel = new JPanel();
		bImage = new JLabel(new ImageIcon("BackgroundImage.gif"));
		
		bPanel.setBounds(0, 0, 1500, 1000);
		
		bPanel.add(bImage);
		
		this.add(bPanel);
		
		if (player == "Healer") {
			switch (IA) {
			case "Healer":
				break;
			case "Damager":
				break;
			case "Tank":
				break;
			default:
				break;
			}
		}

		if (player == "Damager") {
			switch (IA) {
			case "Healer":
				break;
			case "Damager":
				break;
			case "Tank":
				break;
			default:
				break;
			}
		}

		if (player == "Tank") {
			switch (IA) {
			case "Healer":
				break;
			case "Damager":
				break;
			case "Tank":
				break;
			default:
				break;
			}
		}

		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		this.setVisible(true);
	}
	
}
