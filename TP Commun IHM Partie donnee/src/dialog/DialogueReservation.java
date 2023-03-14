package dialog;

import java.awt.EventQueue;

import presentation.JFrameReservation;

public class DialogueReservation {
	
	private String date;
	private String time;
	private String numPersons;
	private int numTable;
	
	private JFrameReservation presentationReservation;
	
	
	public void initDialog() {
		//Create presentation frame
		presentationReservation = new JFrameReservation();
		//Associate dialogue to presentation
		presentationReservation.setDialogue(this);
		//Initialize and enable presentation frame
		presentationReservation.initPresentation();
		presentationReservation.setVisible(true);
		
	}
	
	
	public void handleDateSelectedEvent(String date) {
		this.date = date;
		presentationReservation.enableTime();
	}
	
	public void handleTimeSelectedEvent(String time) {
		//TODO
	}
	
	public void handleNumofPersonsSelectedEvent(String numPersons) {
		//TODO
	}
	
	public void handleTableSelectedEvent(int numTable) {
		//TODO
	}
	
	public void handleCancelEvent() {
		
	}
	
	public void handleValidateEvent() {
		//Display confirmation window using JOptionPane
		presentationReservation.enableValidationInformation(date, time, numPersons,numTable);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//Create dialogReservation
		DialogueReservation dialogReservation = new DialogueReservation();
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dialogReservation.initDialog();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
}
