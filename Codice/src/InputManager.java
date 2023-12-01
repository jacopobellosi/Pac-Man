/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.*;

//Gestisce l'input dell'utente, come le pressioni dei tasti o i movimenti del mouse.
public class InputManager implements ActionListener, KeyListener {

	Timer t = new Timer(10,this);
	Player p = new Player(10,10,10,10,1,1);
	
	public InputManager() {

		t.start();
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void paint(Graphics g) {
		g.drawRect(10,10,10,10);
		System.out.println("OK ciao");
		g.clearRect(0, 0, 0, 0 );
		p.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
			case KeyEvent.VK_D:
				p.setDx(1);
				break;
			case KeyEvent.VK_S:
				p.setDy(1);
				break;
			case KeyEvent.VK_A:
				p.setDx(-1);
				break;
			case KeyEvent.VK_W:
				p.setDy(-1);
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		p.tick();
		repain();
	}


	private void repain() {
		// TODO Auto-generated method stub
		
	}


}