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
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import fightgame.controller.Difficulty;
import fightgame.model.Damager;
import fightgame.model.Healer;
import fightgame.model.Tank;
import fightgame.model.Character;

public class FightWindow extends JFrame {

	private JPanel bPanel;;
	private JLabel bImage;
	private JLabel imagePHealer;
	private JLabel imagePTank;
	private JLabel imagePDamager;
	private JLabel imageIAHealer;
	private JLabel imageIATank;
	private JLabel imageIADamager;
	private JLayeredPane jlp;
	private JPanel c1;
	private JPanel c2;
	Difficulty r = Difficulty.RANDOM;
	Difficulty e = Difficulty.EASY;
	Difficulty d = Difficulty.HARD;
	Character[] players; 

	public FightWindow(String player, String IA, String difficulty) {
		this.setTitle("FightGame");
		this.setSize(1500, 1000);
		this.setLayout(null);
		this.players = new Character[2];

		bPanel = new JPanel();
		c1 = new JPanel();
		c2 = new JPanel();
		bImage = new JLabel(new ImageIcon("BackgroundImage.gif"));
		imagePHealer = new JLabel(new ImageIcon("healer.png"));
		imagePDamager = new JLabel(new ImageIcon("orc_lord.png"));
		imagePTank = new JLabel(new ImageIcon("tauren.png"));
		imageIAHealer = new JLabel(new ImageIcon("healer.png"));
		imageIADamager = new JLabel(new ImageIcon("orc_lord.png"));
		imageIATank = new JLabel(new ImageIcon("tauren.png"));
		//jlp = new JLayeredPane()
		
		if (player == "Healer") {
			switch (IA) {
			case "Healer":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Healer();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Healer();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Healer();
					break;
				default :
					break;
				}
				break;
			case "Damager":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Damager();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Damager();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Damager();
					break;
				}
				break;
			case "Tank":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Tank();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Tank();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePHealer);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Healer();
					players[1] = new Tank();
					break;
				}
				break;
			default:
				break;
			}
		}

		if (player == "Damager") {
			switch (IA) {
			case "Healer":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Healer();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Healer();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Healer();
					break;
				default :
					break;
				}
				break;
			case "Damager":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Damager();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Damager();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Damager();
					break;
				default :
					break;
				}
				break;
			case "Tank":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Tank();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Tank();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePDamager);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Damager();
					players[1] = new Tank();
					break;
				default :
					break;
				}
				break;
			default:
				break;
			}
		}

		if (player == "Tank") {
			switch (IA) {
			case "Healer":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Healer();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Healer();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIAHealer);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Healer();
					break;
				default :
					break;
				}
				break;
			case "Damager":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Damager();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Damager();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIADamager);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Damager();
					break;
				default :
					break;
				}
				break;
			case "Tank":
				switch (difficulty) {
				case "Random":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Tank();
					break;
				case "Easy":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Tank();
					break;
				case "Difficult":
					bPanel.add(bImage);
					bPanel.setOpaque(false);
					c1.setOpaque(false);
					c2.setOpaque(false);
					c1.add(imagePTank);
					c2.add(imageIATank);
					c1.setBounds(330, 730, 200, 200);
					c2.setBounds(1100, 730, 200, 200);
					bPanel.setBounds(0, 0, 1500, 1000);
					this.add(c1);
					this.add(c2);
					this.add(bPanel);
					players[0] = new Tank();
					players[1] = new Tank();
					break;
				default :
					break;
				}
				break;
			default:
				break;
			}
		}

		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		;
		this.setVisible(true);
	}
}
