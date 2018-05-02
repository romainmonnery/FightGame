package fightgame.view;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fightgame.model.Damager;
import fightgame.model.Healer;
import fightgame.model.Tank;

public class Menu extends JFrame implements ActionListener {

	// declaring all the objects needed to create the menu

	private JLabel texteChoix;
	private JLabel texteHealer;
	private JLabel texteDamager;
	private JLabel texteTank;
	private JLabel imageHealer;
	private JLabel imageDamager;
	private JLabel imageTank;
	private JLabel textePlayer;
	private JLabel texteIA;
	private JPanel panHealer;
	private JPanel panDamager;
	private JPanel panTank;
	private JComboBox choicePlayer;
	private JComboBox choiceIA;
	private JButton validate;

	// constructor of the game menu
	public Menu() {

		// setting title, size and layout of the window
		this.setTitle("Game Menu");
		this.setSize(800, 800);
		this.setLayout(null);

		// instantiating all the objects used in the menu
		panHealer = new JPanel();
		panDamager = new JPanel();
		panTank = new JPanel();
		texteChoix = new JLabel();
		texteHealer = new JLabel();
		texteDamager = new JLabel();
		texteTank = new JLabel();
		imageHealer = new JLabel(new ImageIcon("healer.png"));
		imageDamager = new JLabel(new ImageIcon("orc_lord.png"));
		imageTank = new JLabel(new ImageIcon("tauren.png"));
		textePlayer = new JLabel();
		texteIA = new JLabel();
		choicePlayer = new JComboBox();
		choiceIA = new JComboBox();
		validate = new JButton("Validate choice");

		// setting the combo boxes
		choicePlayer.setPreferredSize(new Dimension(100, 20));
		choiceIA.setPreferredSize(new Dimension(100, 20));
		choicePlayer.addItem("Healer");
		choicePlayer.addItem("Damager");
		choicePlayer.addItem("Tank");
		choiceIA.addItem("Healer");
		choiceIA.addItem("Damager");
		choiceIA.addItem("Tank");

		// setting the text of the JLabels
		texteChoix.setText("Choose the class you want to fight with : ");
		texteHealer.setText("Healer : ");
		texteDamager.setText("Damager : ");
		texteTank.setText("Tank : ");
		textePlayer.setText("Choose your class : ");
		texteIA.setText("Choose IA's class : ");

		// setting the coordinate and the dimensions of each elements of the game menu
		texteChoix.setBounds(300, 100, 300, 100);
		texteHealer.setBounds(100, 200, 100, 100);
		texteDamager.setBounds(300, 200, 100, 100);
		texteTank.setBounds(500, 200, 100, 100);
		textePlayer.setBounds(100, 550, 200, 100);
		texteIA.setBounds(350, 550, 200, 100);
		panHealer.setBounds(100, 250, 200, 200);
		panDamager.setBounds(300, 250, 200, 200);
		panTank.setBounds(500, 250, 200, 200);
		choicePlayer.setBounds(235, 590, 100, 20);
		choiceIA.setBounds(475, 590, 100, 20);
		validate.setBounds(315, 635, 150, 50);

		// adding the images in the panels
		panHealer.add(imageHealer);
		panDamager.add(imageDamager);
		panTank.add(imageTank);

		// adding the buttons, the label and the panels
		this.add(texteChoix);
		this.add(texteHealer);
		this.add(texteDamager);
		this.add(texteTank);
		this.add(textePlayer);
		this.add(texteIA);
		this.add(panHealer);
		this.add(panDamager);
		this.add(panTank);
		this.add(choicePlayer);
		this.add(choiceIA);
		this.add(validate);

		// adding Action Listeners
		choicePlayer.addActionListener(this);
		choiceIA.addActionListener(this);
		validate.addActionListener(this);

		// last parameters of the window : resizable, close operation and visibility
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	//method which containts action to when the JButton is clicked
	@Override
	public void actionPerformed(ActionEvent e) {
	
		// if the JButton is clicked
		if (e.getSource() == validate) {
			//if the player is a healer class
			if (choicePlayer.getSelectedItem() == "Healer") {
				//if IA is a healer class
				if (choiceIA.getSelectedItem() == "Healer") {
					FightWindow w = new FightWindow("Healer", "Healer");
					this.dispose();
				//if IA is a damager class
				} else if (choiceIA.getSelectedItem() == "Damager") {
					FightWindow w = new FightWindow("Healer", "Damager");
					this.dispose();
				//if IA is a tank class
				} else if (choiceIA.getSelectedItem() == "Tank") {
					FightWindow w = new FightWindow("Healer", "Tank");
					this.dispose();
				}
			}
			//if the player is a damager class
			if (choicePlayer.getSelectedItem() == "Damager") {
				//if IA is a healer class
				if (choiceIA.getSelectedItem() == "Healer") {
					FightWindow w = new FightWindow("Damager", "Healer");
					this.dispose();
				//if IA is a damager class
				} else if (choiceIA.getSelectedItem() == "Damager") {
					FightWindow w = new FightWindow("Damager", "Damager");
					this.dispose();
				//if IA is a tank class
				} else if (choiceIA.getSelectedItem() == "Tank") {
					FightWindow w = new FightWindow("Damager", "Tank");
					this.dispose();
				}
			}
			//if the player is a tank class
			if (choicePlayer.getSelectedItem() == "Tank") {
				//if IA is a healer class
				if (choiceIA.getSelectedItem() == "Healer") {
					FightWindow w = new FightWindow("Tank", "Healer");
					this.dispose();
				//if IA is a damager class
				} else if (choiceIA.getSelectedItem() == "Damager") {
					FightWindow w = new FightWindow("Tank", "Damager");
					this.dispose();
				//if IA is a tank class
				} else if (choiceIA.getSelectedItem() == "Tank") {
					FightWindow w = new FightWindow("Tank", "Tank");
					this.dispose();
				}
			}
		}

	}
}
