import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Affichage extends JPanel
{
	private Carte carte;
	private Room wildForest = new Room("à la foret sauvage");
	private Room zoo = new Room("au zoo");
	private Room casinoClub = new Room("au casino");
	private Room satanFightArena = new Room("à l'arène finale " +
            "de combat de Satan");
	private Room bikersClub = new Room("au club des motards");
	private Room circus = new Room("au cirque");
	private Room frankLeBargeLab = new Room("au Laboratoire de FrankLeBarge");
	private Room airplane = new Room("à l'aéroport");
	private Room bar = new Room("au bar");
	private Room shaolineDojo = new Room("au monastère Shaolin");
	private Room ferryBoat = new Room("au ferryBoat");

	public Affichage(Carte crt)
	{
		this.carte = crt;
	}

	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		
		Font f = new Font("Arial Narrow", Font.ITALIC, 15);
		g.setFont(f);
		
		g.setColor(Color.lightGray); // couleur du fond
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.white);
		
		switch(carte.currentRoom.getDescription()) {
			case "à la foret sauvage" :
				g.fillRect(50, 50, 130, 97);
				g.fillRect(100, 147, 30, 4);
				g.fillRect(180, 85, 5, 27);
				g.setColor(Color.black);
				g.drawString("Foret sauvage", 55, 65);
				wildForest.visible = true;
				break;
			case "au zoo" :
				g.fillRect(50, 151, 130, 97);
				g.fillRect(100, 147, 30, 4);
				g.fillRect(180, 186, 5, 27);
				g.setColor(Color.black);
				g.drawString("Zoo", 55, 166);
				zoo.visible = true;
				break;
			case "au casino" :
				g.fillRect(50, 252, 130, 97);
				g.fillRect(100, 349, 30, 4);
				g.fillRect(180, 287, 5, 27);
				g.setColor(Color.black);
				g.drawString("Casino", 55, 267);
				casinoClub.visible = true;
				break;
			case "à l'arène finale de combat de Satan" :
				g.fillRect(50, 353, 130, 97);
				g.fillRect(100, 349, 30, 4);
				g.fillRect(180, 388, 5, 27);
				g.setColor(Color.black);
				g.drawString("L'arène finale", 55, 368);
				satanFightArena.visible = true;
				break;
			case "au club des motards" :
				g.fillRect(185, 50, 130, 97);
				g.fillRect(180, 85, 5, 27);
				g.fillRect(315, 85, 5, 27);
				g.setColor(Color.black);
				g.drawString("Club des motards", 190, 65);
				bikersClub.visible = true;
				break;
			case "au cirque" :
				g.fillRect(185, 151, 130, 97);
				g.fillRect(180, 186, 5, 27);
				g.fillRect(315, 186, 5, 27);
				g.fillRect(235, 248, 30, 4);
				g.setColor(Color.black);
				g.drawString("Cirque", 190, 166);
				circus.visible = true;
				break;
			case "au Laboratoire de FrankLeBarge" :
				g.fillRect(185, 252, 130, 97);
				g.fillRect(180, 287, 5, 27);
				g.fillRect(315, 287, 5, 27);
				g.fillRect(235, 248, 30, 4);
				g.fillRect(235, 349, 30, 4);
				g.setColor(Color.black);
				g.drawString("Laboratoire", 190, 267);
				frankLeBargeLab.visible = true;
				break;
			case "à l'aéroport" :
				g.fillRect(185, 353, 130, 97);
				g.fillRect(180, 388, 5, 27);
				g.fillRect(235, 349, 30, 4);
				g.setColor(Color.black);
				g.drawString("Aéroport", 190, 368);
				airplane.visible = true;
				break;
			case "au bar" :
				g.fillRect(320, 50, 130, 97);
				g.fillRect(315, 85, 5, 27);
				g.fillRect(370, 147, 30, 4);
				g.setColor(Color.black);
				g.drawString("Bar", 325, 65);
				bar.visible = true;
				break;
			case "au monastère Shaolin" :
				g.fillRect(320, 151, 130, 97);
				g.fillRect(315, 186, 5, 27);
				g.fillRect(370, 147, 30, 4);
				g.setColor(Color.black);
				g.drawString("Monastère Shaolin", 325, 166);
				shaolineDojo.visible = true;
				break;
			case "au ferryBoat" :	
				g.fillRect(320, 252, 130, 97);
				g.fillRect(315, 287, 5, 27);
				g.setColor(Color.black);
				g.drawString("ferryBoat", 325, 267);
				ferryBoat.visible = true;
				break;
		}
		
		if (wildForest.visible == true) {
			g.setColor(Color.white);
			g.fillRect(50, 50, 130, 97);
			g.fillRect(100, 147, 30, 4);
			g.fillRect(180, 85, 5, 27);
			g.setColor(Color.black);
			g.drawString("Foret sauvage", 55, 65);
		}
		if (zoo.visible == true) {
			g.setColor(Color.white);
			g.fillRect(50, 151, 130, 97);
			g.fillRect(100, 147, 30, 4);
			g.fillRect(180, 186, 5, 27);
			g.setColor(Color.black);
			g.drawString("Zoo", 55, 166);
		}
		if (casinoClub.visible == true) {
			g.setColor(Color.white);
			g.fillRect(50, 252, 130, 97);
			g.fillRect(100, 349, 30, 4);
			g.fillRect(180, 287, 5, 27);
			g.setColor(Color.black);
			g.drawString("Casino", 55, 267);
		}
		if (satanFightArena.visible == true) {
			g.setColor(Color.white);
			g.fillRect(50, 353, 130, 97);
			g.fillRect(100, 349, 30, 4);
			g.fillRect(180, 388, 5, 27);
			g.setColor(Color.black);
			g.drawString("L'arène finale", 55, 368);
		}
		if (bikersClub.visible == true) {
			g.setColor(Color.white);
			g.fillRect(185, 50, 130, 97);
			g.fillRect(180, 85, 5, 27);
			g.fillRect(315, 85, 5, 27);
			g.setColor(Color.black);
			g.drawString("Club des motards", 190, 65);
		}
		if (circus.visible == true) {
			g.setColor(Color.white);
			g.fillRect(185, 151, 130, 97);
			g.fillRect(180, 186, 5, 27);
			g.fillRect(315, 186, 5, 27);
			g.fillRect(235, 248, 30, 4);
			g.setColor(Color.black);
			g.drawString("Cirque", 190, 166);
		}
		if (frankLeBargeLab.visible == true) {
			g.setColor(Color.white);
			g.fillRect(185, 252, 130, 97);
			g.fillRect(180, 287, 5, 27);
			g.fillRect(315, 287, 5, 27);
			g.fillRect(235, 248, 30, 4);
			g.fillRect(235, 349, 30, 4);
			g.setColor(Color.black);
			g.drawString("Laboratoire", 190, 267);
		}
		if (airplane.visible == true) {
			g.setColor(Color.white);
			g.fillRect(185, 353, 130, 97);
			g.fillRect(180, 388, 5, 27);
			g.fillRect(235, 349, 30, 4);
			g.setColor(Color.black);
			g.drawString("Aéroport", 190, 368);
		}
		if (bar.visible == true) {
			g.setColor(Color.white);
			g.fillRect(320, 50, 130, 97);
			g.fillRect(315, 85, 5, 27);
			g.fillRect(370, 147, 30, 4);
			g.setColor(Color.black);
			g.drawString("Bar", 325, 65);
		}
		if (shaolineDojo.visible == true) {
			g.setColor(Color.white);
			g.fillRect(320, 151, 130, 97);
			g.fillRect(315, 186, 5, 27);
			g.fillRect(370, 147, 30, 4);
			g.setColor(Color.black);
			g.drawString("Monastère Shaolin", 325, 166);
		}
		if (ferryBoat.visible == true) {
			g.setColor(Color.white);
			g.fillRect(320, 252, 130, 97);
			g.fillRect(315, 287, 5, 27);
			g.setColor(Color.black);
			g.drawString("ferryBoat", 325, 267);
		}
		
		g.setColor(Color.red);
		 
		switch(carte.currentRoom.getDescription()) {
			case "à la foret sauvage" :
				g.fillRect(100, 85, 30, 29);
				break;
			case "au zoo" :
				g.fillRect(100, 186, 30, 29);
				break;
			case "au casino" :
				g.fillRect(100, 287, 30, 29);
				break;
			case "à l'arène finale de combat de Satan" :
				g.fillRect(100, 388, 30, 29);
				break;
			case "au club des motards" :
				g.fillRect(235, 85, 30, 29);
				break;
			case "au cirque" :
				g.fillRect(235, 186, 30, 29);
				break;
			case "au Laboratoire de FrankLeBarge" :
				g.fillRect(235, 287, 30, 29);
				break;
			case "à l'aéroport" :
				g.fillRect(235, 388, 30, 29);
				break;
			case "au bar" :
				g.fillRect(370, 85, 30, 29);
				break;
			case "au monastère Shaolin" :
				g.fillRect(370, 186, 30, 29);
				break;
			case "au ferryBoat" :	
				g.fillRect(370, 287, 30, 29);
				break;
		}
		repaint();
	}
	
	public void afficherCarte() {
	    JFrame fenetre = new JFrame("Affichage de la carte");
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Affichage dessin = new Affichage(this.carte);
	    dessin.setPreferredSize(new Dimension(500,500));
	    fenetre.setContentPane(dessin);
	    fenetre.pack();
	    fenetre.setFocusableWindowState(false);
	    fenetre.setVisible(true);
	    fenetre.setAlwaysOnTop(true);
	}

}