/*
* This code has been generated by the Rebel: a code generator for modern Java.

*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
/**
	 * Classe iniziale del gioco
	 * @author Bellosi Jacopo, Lara longhi, Poloni Luca
	 * BENVENUTI IN UNIPACMAN! BUON DIVERTIMENTO!
	 */
package controller;

import javax.swing.*;

public class UniPacman  {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setLocation(200, 200);
		window.setTitle("Pac-Man");
		
		GameEngine livello = new GameEngine();
		window.add(livello);
		window.pack();
		ImageIcon img = new ImageIcon("/pacman/logo.jpeg"); 
		window.setIconImage(img.getImage());   
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		//set up
		livello.setupGame();
		livello.startGameThread();
	}
	

}