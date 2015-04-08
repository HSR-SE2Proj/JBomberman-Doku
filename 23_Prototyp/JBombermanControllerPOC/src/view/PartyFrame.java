package view;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.ActionListener;

import application.controller;

public class PartyFrame extends JFrame implements Observer {
	
	private controller cont;
	
	public PartyFrame(controller cont) {
		this.cont  = cont;
		cont.addObserver(this);
		JPanel panel = new JPanel();
		JButton button = new JButton("Start Game");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont.startGame();
				setVisible(false);
			}
		});
		panel.add(button);
		add(panel);
		pack();
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		String message = (String) arg1;
		if(message.compareTo("finished") == 0) {
			this.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		PartyFrame pf = new PartyFrame(new controller());
		pf.setVisible(true);
	}
}
