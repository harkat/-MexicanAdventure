import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Affichage extends JPanel
{
	private Carte carte;

	public Affichage(Carte crt)
	{
		this.carte = crt;
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.white);
		g.fillRect(50, 50, 400, 400);
		g.setColor(Color.lightGray);
		g.fillRect(180, 50, 5, 400);
		g.fillRect(315, 50, 5, 400);
		g.fillRect(50, 147, 400, 4);
		g.fillRect(50, 248, 400, 4);
		g.fillRect(50, 349, 400, 4);
		g.fillRect(315, 349, 135, 101);
		g.setColor(Color.white);
		g.fillRect(100, 147, 30, 4);
		g.fillRect(370, 147, 30, 4);
		g.fillRect(235, 248, 30, 4);
		g.fillRect(100, 349, 30, 4);
		g.fillRect(235, 349, 30, 4);
		g.fillRect(180, 85, 5, 29);
		g.fillRect(315, 85, 5, 29);
		g.fillRect(180, 186, 5, 29);
		g.fillRect(315, 186, 5, 29);
		g.fillRect(180, 287, 5, 29);
		g.fillRect(315, 287, 5, 29);
		g.fillRect(180, 388, 5, 29);
		
		g.setColor(Color.black);
		Font f = new Font("Arial Narrow", Font.ITALIC, 15);
		g.setFont(f);
		g.drawString("Foret sauvage", 55, 65);
		g.drawString("Club des motards", 190, 65);
		g.drawString("Bar", 325, 65);
		
		g.drawString("Zoo", 55, 166);
		g.drawString("Cirque", 190, 166);
		g.drawString("Monastère Shaolin", 325, 166);
		
		g.drawString("Casino", 55, 267);
		g.drawString("Laboratoire", 190, 267);
		g.drawString("ferryBoat", 325, 267);
		
		g.drawString("L'arène finale", 55, 368);
		g.drawString("Aéroport", 190, 368);
		
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
	    JFrame fenetre = new JFrame("Affichage de carte");
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Affichage dessin = new Affichage(this.carte);
	    dessin.setPreferredSize(new Dimension(500,500));
	    fenetre.setContentPane(dessin);
	    fenetre.pack();
	    dessin.requestFocusInWindow();
	    fenetre.setVisible(true);
	}

}