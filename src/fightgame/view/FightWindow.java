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
	private JLabel player1Hp;
	private JLabel player2Hp;
	private JLayeredPane jlp;
	private JPanel c1;
	private JPanel c2;
	private JPanel bdv1;
	private JPanel bdv2;
	private JButton attack;
	private JButton block;
	private JButton special;
	Difficulty r = Difficulty.RANDOM;
	Difficulty e = Difficulty.EASY;
	Difficulty d = Difficulty.HARD;
	Character[] players; 

	public FightWindow(String player, String IA, String difficulty) {
		this.setTitle("FightGame");
		this.setSize(1900, 1000);
		this.setLayout(null);
		this.players = new Character[2];

		bPanel = new JPanel();
		c1 = new JPanel();
		c2 = new JPanel();
		bdv1 = new JPanel();
		bdv2 = new JPanel();
		bImage = new JLabel(new ImageIcon("BackgroundImage.gif"));
		imagePHealer = new JLabel(new ImageIcon("healer.png"));
		imagePDamager = new JLabel(new ImageIcon("orc_lord.png"));
		imagePTank = new JLabel(new ImageIcon("tauren.png"));
		imageIAHealer = new JLabel(new ImageIcon("healer.png"));
		imageIADamager = new JLabel(new ImageIcon("orc_lord.png"));
		imageIATank = new JLabel(new ImageIcon("tauren.png"));
		attack = new JButton("Attack");
		block = new JButton("Block");
		special = new JButton("Special Attack");
		
		//Coordinates of the buttons
		attack.setBounds(1500, 5, 400, 333);
		block.setBounds(1500, 333, 400, 333);
		special.setBounds(1500, 666, 400, 334);
		
		//Adding the buttons
		this.add(attack);
		this.add(block);
		this.add(special);
		
		if (player == "Healer") {
			switch (IA) {
			case "Healer":
				switch (difficulty) {
				case "Random":
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
					player1Hp = new JLabel(new ImageIcon("bdvmax.png"));
					player2Hp = new JLabel(new ImageIcon("bdvmax.png"));
					bdv1.add(player1Hp);
					bdv2.add(player2Hp);
					bdv1.setOpaque(false);
					bdv2.setOpaque(false);
					bdv1.setBounds(200, 300, 377, 68);
					bdv2.setBounds(1000, 300, 377, 68);
					this.add(bdv1);
					this.add(bdv2);
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
