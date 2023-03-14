package presentation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;

import com.github.lgooddatepicker.components.DatePicker;

import dialog.DialogueReservation;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;


public class JFrameReservation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelDateTime;
	private JLabel lblChooseDate;
	private JLabel lblChooseTime;
	private JPanel panelNumofPersons;
	private JLabel lblNumofPersons;
	private DatePicker datePicker;
	private JPanel panelTable;
	private JLabel lblTableMap;
	private JButton btnValidate;
	private JPanel panelConfirmCancel;
	private DialogueReservation dialogueReservation;


	/**
	 * Create the frame.
	 */
	public JFrameReservation() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrameReservation.class.getResource("/resources/Plan_tables.JPG")));
		setTitle("R\u00E9servez une table");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panelDateTime = new JPanel();
		
		panelNumofPersons = new JPanel();
		
		panelTable = new JPanel();
		
		panelConfirmCancel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panelConfirmCancel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panelTable, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panelNumofPersons, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panelDateTime, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelDateTime, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelNumofPersons, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelTable, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panelConfirmCancel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		lblTableMap = new JLabel("");
		lblTableMap.setIcon(new ImageIcon(JFrameReservation.class.getResource("/resources/Plan_tables.JPG")));
		GroupLayout gl_panelTable = new GroupLayout(panelTable);
		gl_panelTable.setHorizontalGroup(
			gl_panelTable.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTable.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTableMap, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
					.addGap(145))
		);
		gl_panelTable.setVerticalGroup(
			gl_panelTable.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTable.createSequentialGroup()
					.addGap(57)
					.addComponent(lblTableMap, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelTable.setLayout(gl_panelTable);
		
		btnValidate = new JButton("Valider");
		btnValidate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panelConfirmCancel = new GroupLayout(panelConfirmCancel);
		gl_panelConfirmCancel.setHorizontalGroup(
			gl_panelConfirmCancel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelConfirmCancel.createSequentialGroup()
					.addContainerGap(269, Short.MAX_VALUE)
					.addComponent(btnValidate)
					.addGap(109))
		);
		gl_panelConfirmCancel.setVerticalGroup(
			gl_panelConfirmCancel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelConfirmCancel.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(btnValidate, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelConfirmCancel.setLayout(gl_panelConfirmCancel);
		
		lblNumofPersons = new JLabel("2. Indiquez le nombre de personnes");
		lblNumofPersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panelNumofPersons = new GroupLayout(panelNumofPersons);
		gl_panelNumofPersons.setHorizontalGroup(
			gl_panelNumofPersons.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelNumofPersons.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNumofPersons, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panelNumofPersons.setVerticalGroup(
			gl_panelNumofPersons.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelNumofPersons.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNumofPersons, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(73))
		);
		panelNumofPersons.setLayout(gl_panelNumofPersons);
		
		lblChooseDate = new JLabel("1. Choisissez la date");
		lblChooseDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblChooseTime = new JLabel("et l'heure");
		lblChooseTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		datePicker = new DatePicker();
		datePicker.addDateChangeListener(new DateChangeListener() {
			public void dateChanged(DateChangeEvent arg0) {
				do_datePicker_dateChanged(arg0);
			}
		});
		GroupLayout gl_panelDateTime = new GroupLayout(panelDateTime);
		gl_panelDateTime.setHorizontalGroup(
			gl_panelDateTime.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDateTime.createSequentialGroup()
					.addGroup(gl_panelDateTime.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDateTime.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panelDateTime.createParallelGroup(Alignment.LEADING)
								.addComponent(lblChooseDate, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelDateTime.createSequentialGroup()
									.addGap(148)
									.addComponent(lblChooseTime, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panelDateTime.createSequentialGroup()
							.addGap(103)
							.addComponent(datePicker, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
					.addGap(129))
		);
		gl_panelDateTime.setVerticalGroup(
			gl_panelDateTime.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDateTime.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelDateTime.createParallelGroup(Alignment.LEADING)
						.addComponent(lblChooseDate, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChooseTime, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(datePicker, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(3))
		);
		panelDateTime.setLayout(gl_panelDateTime);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	public void initPresentation() {
		lblChooseDate.setEnabled(true);
		datePicker.setEnabled(true);
		lblChooseTime.setEnabled(false);
		
		lblNumofPersons.setEnabled(false);
		
		
		lblTableMap.setEnabled(false);
		
		btnValidate.setEnabled(false);
		
		System.out.println("InitPresentation done");
	}
	
	public void enableTime() {
		
		
	}
	
	public void enableNumofPersons() {
		lblNumofPersons.setEnabled(true);
		
	}
	
	public void enableTableMap() {
		
		lblTableMap.setEnabled(true);
		
	}
	
	
	
	public void enableValidationInformation(String date, String time, String numPersons, int numTable) {
		
	}
	
	
//Record reference to Dialogue
	
	public void setDialogue(DialogueReservation dialogReservation) {
		dialogueReservation = dialogReservation;
	}
	
	protected void do_datePicker_dateChanged(DateChangeEvent arg0) {
		//TODO
	}
}
