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

import fightgame.controller.Difficulty;
import fightgame.model.Background;
import fightgame.model.Damager;
import fightgame.model.Healer;

public class FightWindow extends JFrame {

	private JPanel bPanel;
	private JPanel panHealer;
	private JPanel panDamager;
	private JPanel panTank;
	private JLabel bImage;
	private JLabel imageHealer;
	private JLabel imageTank;
	private JLabel imageDamager;
	Difficulty r = Difficulty.RANDOM;
	Difficulty e = Difficulty.EASY;
	Difficulty d = Difficulty.HARD;

	public FightWindow(String player, String IA, String difficulty) {
		this.setTitle("FightGame");
		this.setSize(1500, 1000);
		this.setLayout(null);

		bPanel = new JPanel();
		panHealer = new JPanel();
		panDamager = new JPanel();
		panTank = new JPanel();
		bImage = new JLabel(new ImageIcon("BackgroundImage.gif"));
		imageHealer = new JLabel(new ImageIcon("healer.png"));
		imageDamager = new JLabel(new ImageIcon("orc_lord.png"));
		imageTank = new JLabel(new ImageIcon("tauren.png"));

		bPanel.setBounds(0, 0, 1500, 1000);

		bPanel.add(bImage);
		panHealer.add(imageHealer);
		panDamager.add(imageDamager);
		panTank.add(imageTank);

		this.add(bPanel);
		this.add(panHealer);
		this.add(panDamager);
		this.add(panTank);

		if (player == "Healer") {
			switch (IA) {
			case "Healer":
				switch (difficulty) {
				case "Random":
					break;
				case "Easy":
					break;
				case "Difficult":
					break;
				default :
					break;
				}
				break;
			case "Damager":
				switch (difficulty) {
				case "Random":
					break;
				case "Easy":
					break;
				case "Difficult":
					break;
				}
				break;
			case "Tank":
				switch (difficulty) {
				case "Random":
					break;
				case "Easy":
					break;
				case "Difficult":
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
					break;
				case "Easy":
					break;
				case "Difficult":
					break;
				default :
					break;
				}
				break;
			case "Damager":
				switch (difficulty) {
				case "Random":
					break;
				case "Easy":
					break;
				case "Difficult":
					break;
				default :
					break;
				}
				break;
			case "Tank":
				switch (difficulty) {
				case "Random":
					break;
				case "Easy":
					break;
				case "Difficult":
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
					break;
				case "Easy":
					break;
				case "Difficult":
					break;
				default :
					break;
				}
				break;
			case "Damager":
				switch (difficulty) {
				case "Random":
					break;
				case "Easy":
					break;
				case "Difficult":
					break;
				default :
					break;
				}
				break;
			case "Tank":
				switch (difficulty) {
				case "Random":
					break;
				case "Easy":
					break;
				case "Difficult":
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
