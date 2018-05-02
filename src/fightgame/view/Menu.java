package fightgame.view;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fightgame.model.Damager;
import fightgame.model.Healer;
import fightgame.model.Tank;

public class Menu extends JFrame implements ActionListener {

	// declaring all the objects needed to create the menu
	private JButton healer;
	private JButton damager;
	private JButton tank;
	private JLabel texteChoix;
	private JLabel imageHealer;
	private JLabel imageDamager;
	private JLabel imageTank;
	private JPanel panHealer;
	private JPanel panDamager;
	private JPanel panTank;

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
		imageHealer = new JLabel(new ImageIcon("healer.png"));
		imageDamager = new JLabel(new ImageIcon("orc_lord.png"));
		imageTank = new JLabel(new ImageIcon("tauren.png"));
		healer = new JButton("Choose Healer");
		damager = new JButton("Choose Damager");
		tank = new JButton("Choose Tank");

		// setting the text of the JLabel
		texteChoix.setText("Choose the class you want to fight with : ");

		// setting the coordinate and the dimensions of each elements of the game menu
		texteChoix.setBounds(300, 100, 300, 100);
		healer.setBounds(100, 450, 200, 100);
		damager.setBounds(300, 450, 200, 100);
		tank.setBounds(500, 450, 200, 100);
		panHealer.setBounds(100, 250, 200, 200);
		panDamager.setBounds(300, 250, 200, 200);
		panTank.setBounds(500, 250, 200, 200);

		// adding the images in the panels
		panHealer.add(imageHealer);
		panDamager.add(imageDamager);
		panTank.add(imageTank);

		// adding the buttons, the label and the panels
		this.add(healer);
		this.add(damager);
		this.add(tank);
		this.add(texteChoix);
		this.add(panHealer);
		this.add(panDamager);
		this.add(panTank);

		// implementing an action listener on each button
		healer.addActionListener(this);
		damager.addActionListener(this);
		tank.addActionListener(this);

		// last parameters of the window : resizable, close operation and visibility
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	// method which contain the code after an action event on a jbutton
	@Override
	public void actionPerformed(ActionEvent event) {

		// if we click on healer we create a healer
		if (event.getSource() == healer) {
			Healer p1Healer = new Healer();
		}

		// if we click on damager we create a damager
		if (event.getSource() == damager) {
			Damager p1Damager = new Damager();
		}

		// if we click on tank we create a tank
		if (event.getSource() == tank) {
			Tank p1Tank = new Tank();
		}
	}
}
