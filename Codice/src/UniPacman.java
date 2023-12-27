/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.*;

//Gestisce la logica di gioco, inclusi il movimento dei personaggi, le collisioni e le interazioni di gioco.
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
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		livello.setupGame();
		livello.StartGameThread();
	}
	
	
	/*
	 * public void init() {
	 
		setLayout( new GridLayout(1,1,0,0));
		setLocationRelativeTo(null);
		InputManager s = new InputManager();
		setVisible(true);
		
	}
	*/

	
	
	
}