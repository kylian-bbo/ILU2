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
		this.time = time;
		presentationReservation.enableNumofPersons();
		
	}
	
	public void handleNumofPersonsSelectedEvent(String numPersons) {
		this.numPersons = numPersons;
		presentationReservation.enableTableMap();
	}
	
	public void handleTableSelectedEvent(int numTable) {
		numTable++;
		this.numTable = numTable;
		presentationReservation.enableValidation();
	}
		
	public void handleCancelEvent() {
		this.date = null;
		this.time = null;
		this.numPersons = null;
		this.numTable = 0;
		presentationReservation.initPresentation();
	}
	
	public void handleValidateEvent() {
		//Display confirmation window using JOptionPane
		presentationReservation.enableValidationInformation(date, time, numPersons, numTable);
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
