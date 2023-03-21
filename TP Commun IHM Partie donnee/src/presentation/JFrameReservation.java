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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;


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
	private JLabel lblTableMap2;
	private JButton btnValidate;
	private JPanel panelConfirmCancel;
	private DialogueReservation dialogueReservation;
	private JComboBox timeComboBox;
	private JLabel lblTableMap;
	private JButton btnCancel;
	private JComboBox NumofPersonsComboBox;
	private JList TableList;
	private JDesktopPane desktopPane;


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
		
		lblTableMap2 = new JLabel("");
		lblTableMap2.setEnabled(false);
		lblTableMap2.setIcon(new ImageIcon(JFrameReservation.class.getResource("/resources/Plan_tables.JPG")));
		
		lblTableMap = new JLabel("3. Choisissez votre table");
		lblTableMap.setEnabled(false);
		lblTableMap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		TableList = new JList();
		TableList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				do_TableList_valueChanged(e);
			}
		});
		TableList.setEnabled(false);
		TableList.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TableList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		desktopPane = new JDesktopPane();
		GroupLayout gl_panelTable = new GroupLayout(panelTable);
		gl_panelTable.setHorizontalGroup(
			gl_panelTable.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTable.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelTable.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelTable.createSequentialGroup()
							.addGroup(gl_panelTable.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelTable.createSequentialGroup()
									.addComponent(lblTableMap2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(25)
									.addComponent(TableList, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addGap(20))
								.addComponent(lblTableMap))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panelTable.createSequentialGroup()
							.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addGap(225))))
		);
		gl_panelTable.setVerticalGroup(
			gl_panelTable.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTable.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTableMap)
					.addGap(13)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelTable.createParallelGroup(Alignment.LEADING)
						.addComponent(TableList, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
						.addComponent(lblTableMap2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panelTable.setLayout(gl_panelTable);
		
		btnValidate = new JButton("Valider");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnValidate_actionPerformed(e);
			}
		});
		btnValidate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnCancel = new JButton("Annuler");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		GroupLayout gl_panelConfirmCancel = new GroupLayout(panelConfirmCancel);
		gl_panelConfirmCancel.setHorizontalGroup(
			gl_panelConfirmCancel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelConfirmCancel.createSequentialGroup()
					.addContainerGap(285, Short.MAX_VALUE)
					.addComponent(btnValidate, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancel)
					.addContainerGap())
		);
		gl_panelConfirmCancel.setVerticalGroup(
			gl_panelConfirmCancel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelConfirmCancel.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addGroup(gl_panelConfirmCancel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnValidate, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panelConfirmCancel.setLayout(gl_panelConfirmCancel);
		
		lblNumofPersons = new JLabel("2. Indiquez le nombre de personnes");
		lblNumofPersons.setEnabled(false);
		lblNumofPersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		NumofPersonsComboBox = new JComboBox();
		NumofPersonsComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_NumofPersonsComboBox_actionPerformed(e);
			}
		});
		NumofPersonsComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		NumofPersonsComboBox.setEnabled(false);
		GroupLayout gl_panelNumofPersons = new GroupLayout(panelNumofPersons);
		gl_panelNumofPersons.setHorizontalGroup(
			gl_panelNumofPersons.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelNumofPersons.createSequentialGroup()
					.addGroup(gl_panelNumofPersons.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelNumofPersons.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNumofPersons, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelNumofPersons.createSequentialGroup()
							.addGap(105)
							.addComponent(NumofPersonsComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panelNumofPersons.setVerticalGroup(
			gl_panelNumofPersons.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelNumofPersons.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNumofPersons, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(NumofPersonsComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		panelNumofPersons.setLayout(gl_panelNumofPersons);
		
		lblChooseDate = new JLabel("1. Choisissez la date");
		lblChooseDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblChooseTime = new JLabel("et l'heure");
		lblChooseTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		datePicker = new DatePicker();
		datePicker.getComponentToggleCalendarButton().setText("\uD83D\uDCC5");
		datePicker.getComponentToggleCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_datePickerComponentToggleCalendarButton_actionPerformed(e);
			}
		});
		datePicker.addDateChangeListener(new DateChangeListener() {
			public void dateChanged(DateChangeEvent arg0) {
				do_datePicker_dateChanged(arg0);
			}
		});
		
		timeComboBox = new JComboBox();
		timeComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_timeComboBox_actionPerformed(e);
			}
		});
		timeComboBox.setEnabled(false);
		timeComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "12h00", "12h30", "13h00", "19h30", "20h00", "20h30"}));
		timeComboBox.setMaximumRowCount(5);
		
		GroupLayout gl_panelDateTime = new GroupLayout(panelDateTime);
		gl_panelDateTime.setHorizontalGroup(
			gl_panelDateTime.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelDateTime.createSequentialGroup()
					.addContainerGap(51, Short.MAX_VALUE)
					.addGroup(gl_panelDateTime.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelDateTime.createSequentialGroup()
							.addGroup(gl_panelDateTime.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelDateTime.createSequentialGroup()
									.addGap(148)
									.addComponent(lblChooseTime, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblChooseDate, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGap(88))
						.addGroup(gl_panelDateTime.createSequentialGroup()
							.addComponent(datePicker, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(62)
							.addComponent(timeComboBox, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addGap(68))))
		);
		gl_panelDateTime.setVerticalGroup(
			gl_panelDateTime.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDateTime.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelDateTime.createParallelGroup(Alignment.LEADING)
						.addComponent(lblChooseDate, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChooseTime, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDateTime.createParallelGroup(Alignment.LEADING)
						.addComponent(datePicker, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(timeComboBox, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(58))
		);
		panelDateTime.setLayout(gl_panelDateTime);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	public void initPresentation() {
		lblChooseDate.setEnabled(true);
		datePicker.setEnabled(true);
		lblChooseTime.setEnabled(false);
		timeComboBox.setEnabled(false);
		lblNumofPersons.setEnabled(false);
		NumofPersonsComboBox.setEnabled(false);
		lblTableMap.setEnabled(false);
		lblTableMap2.setEnabled(false);
		TableList.setEnabled(false);
		NumofPersonsComboBox.setEnabled(false);
		btnValidate.setEnabled(false);

		System.out.println("InitPresentation done");
	}
	
	public void enableTime() {
		lblChooseTime.setEnabled(true);
		timeComboBox.setEnabled(true);
	}
	
	public void enableNumofPersons() {
		lblNumofPersons.setEnabled(true);
		NumofPersonsComboBox.setEnabled(true);
		
	}
	
	public void enableTableMap() {
		lblTableMap.setEnabled(true);
		lblTableMap2.setEnabled(true);
		TableList.setEnabled(true);
	}
	
	public void enableValidation() {
		btnValidate.setEnabled(true);
	}
	
	public void enableValidationInformation(String date, String time, String numPersons, int numTable) {
		lblChooseDate.setEnabled(false);
		datePicker.setEnabled(false);
		lblChooseTime.setEnabled(false);
		timeComboBox.setEnabled(false);
		lblNumofPersons.setEnabled(false);
		NumofPersonsComboBox.setEnabled(false);
		lblTableMap.setEnabled(false);
		lblTableMap2.setEnabled(false);
		TableList.setEnabled(false);
		NumofPersonsComboBox.setEnabled(false);
		btnValidate.setEnabled(false);
		btnCancel.setEnabled(false);
		
		showMessageDialog(this,"Réservation confirmée le " + date + " à " + time + " pour " + numPersons + " personnes à la table " + numTable + ".", "Confirmation de réservation");
	}
	
	public static int showMessageDialog(Component parentComponent, Object message, String title) {
		return 0;
	}
	
	
//Record reference to Dialogue
	
	public void setDialogue(DialogueReservation dialogReservation) {
		dialogueReservation = dialogReservation;
	}
	
	protected void do_datePicker_dateChanged(DateChangeEvent arg0) {
		dialogueReservation.handleDateSelectedEvent(arg0.getNewDate().toString());
	}
	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		dialogueReservation.handleCancelEvent();
	}
	
	protected void do_datePickerComponentToggleCalendarButton_actionPerformed(ActionEvent e) {
	}
	
	protected void do_timeComboBox_actionPerformed(ActionEvent e) {
		dialogueReservation.handleTimeSelectedEvent(timeComboBox.getSelectedItem().toString());
	}
	protected void do_NumofPersonsComboBox_actionPerformed(ActionEvent e) {
		dialogueReservation.handleNumofPersonsSelectedEvent(NumofPersonsComboBox.getSelectedItem().toString());
	}
	protected void do_TableList_valueChanged(ListSelectionEvent e) {
		dialogueReservation.handleTableSelectedEvent(TableList.getSelectedIndex());
	}
	
	protected void do_btnValidate_actionPerformed(ActionEvent e) {
		dialogueReservation.handleValidateEvent();
	}
}
