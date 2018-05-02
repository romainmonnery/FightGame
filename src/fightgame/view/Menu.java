package fightgame.view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener{

	private JButton healer = new JButton("Healer");
	private JButton damager = new JButton("Damager");
	private JButton tank = new JButton("Tank");
	private JLabel texteChoix = new JLabel();
	private JPanel panel = new JPanel();
	private BufferedImage imageHealer;
	private BufferedImage imageDamager;
	private BufferedImage imageTank;
	
	public Menu() {
		this.setTitle("Game Menu");
		this.setSize(800,800);
		
		this.add(healer);
		this.add(damager);
		this.add(tank);
		
		healer.setBounds(100, 650, 200, 100);
		damager.setBounds(300, 650, 200, 100);
		tank.setBounds(500, 650, 200, 100);
		
		healer.addActionListener(this);
		damager.addActionListener(this);
		tank.addActionListener(this);
		
		try {
			imageHealer = ImageIO.read(new File("healer.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			imageDamager = ImageIO.read(new File("orc_lord.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			imageTank = ImageIO.read(new File("tauren.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		panel.paintComponents(g);
		g.drawImage(imageHealer, 100, 450, null);
		g.drawImage(imageDamager, 300, 450, null);
		g.drawImage(imageTank, 500, 450, null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
