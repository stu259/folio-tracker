package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import api.IModel;
import gui.IFrame;

public class Refresh implements ActionListener{
	
	private IModel model;
	private IFrame frame;
	
	public Refresh(IFrame f, IModel m){
		frame = f;
		model = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread msg = new Thread(new Runnable(){

			@Override
			public void run() {
				frame.showMessage(null, "Refreshed");
			}
			
		});
		msg.start();
		
		model.refresh(frame.getCurrentTab().getName());
		
		
	}
}