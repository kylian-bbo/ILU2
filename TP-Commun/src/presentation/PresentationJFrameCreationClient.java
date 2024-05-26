package presentation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dialog.DialogAjoutClient;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PresentationJFrameCreationClient extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNom;
	private JTextField textFieldNom;
	private JLabel lblPrenom;
	private JLabel lblEmail;
	private JLabel lblMdp;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;
	private JTextField textFieldPrenom;
	private JButton btnCancel;
	private JButton btnCreate;
	private DialogAjoutClient dialogAjoutClient;
	private JPasswordField passwordFieldConfirmer;
	private JLabel lblMdpConfirmer;
	private JLabel lblNewLabel;
	private JLabel lblPasswordError;
	private JLabel lblPasswordErrorInstructions;

	/**
	 * Create the frame.
	 */
	public PresentationJFrameCreationClient() {
		setTitle("Informations client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblNom = new JLabel("Nom:");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 18));

		textFieldNom = new JTextField();
		textFieldNom.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldNom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldNom.setColumns(10);

		lblPrenom = new JLabel("Pr\u00E9nom");
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 18));

		lblEmail = new JLabel("Adresse email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));

		lblMdp = new JLabel("Mot de passe:");
		lblMdp.setFont(new Font("Tahoma", Font.PLAIN, 18));

		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldEmail.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));

		textFieldPrenom = new JTextField();
		textFieldPrenom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldPrenom.setColumns(10);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnCancelActionPerformed(e);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));

		btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnNewButton1actionPerformed(e);
			}
		});
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 18));

		passwordFieldConfirmer = new JPasswordField();
		passwordFieldConfirmer.setFont(new Font("Tahoma", Font.PLAIN, 18));

		lblMdpConfirmer = new JLabel("Confirmez mot de passe:");
		lblMdpConfirmer.setFont(new Font("Tahoma", Font.PLAIN, 18));

		lblNewLabel = new JLabel("Pour la cr\u00E9ation de votre compte, veuillez saisir les informations suivantes:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);

		lblPasswordError = new JLabel("New label");
		lblPasswordError.setForeground(Color.ORANGE);
		lblPasswordError.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPasswordError.setText("");

		lblPasswordErrorInstructions = new JLabel("");
		lblPasswordErrorInstructions.setForeground(Color.ORANGE);
		lblPasswordErrorInstructions.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout glContentPane = new GroupLayout(contentPane);
		glContentPane.setHorizontalGroup(glContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, glContentPane.createSequentialGroup().addGroup(glContentPane
						.createParallelGroup(Alignment.TRAILING).addGroup(glContentPane.createSequentialGroup()
								.addContainerGap().addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 509,
										Short.MAX_VALUE))
						.addGroup(glContentPane.createSequentialGroup().addContainerGap().addGroup(glContentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(glContentPane.createSequentialGroup()
										.addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 45,
												GroupLayout.PREFERRED_SIZE)
										.addGap(173)
										.addComponent(textFieldNom, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
								.addGroup(glContentPane.createSequentialGroup()
										.addGroup(glContentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblMdpConfirmer, GroupLayout.PREFERRED_SIZE, 218,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMdp, GroupLayout.PREFERRED_SIZE, 125,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblPrenom, GroupLayout.PREFERRED_SIZE, 84,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 133,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(glContentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textFieldEmail, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
												.addComponent(passwordField, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
												.addComponent(passwordFieldConfirmer, GroupLayout.DEFAULT_SIZE, 291,
														Short.MAX_VALUE)
												.addComponent(textFieldPrenom, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))))
						.addGroup(glContentPane.createSequentialGroup().addComponent(btnCreate).addGap(17)
								.addComponent(btnCancel))
						.addGroup(Alignment.LEADING, glContentPane.createSequentialGroup().addContainerGap()
								.addGroup(glContentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPasswordError, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												509, Short.MAX_VALUE)
										.addComponent(lblPasswordErrorInstructions, GroupLayout.DEFAULT_SIZE, 509,
												Short.MAX_VALUE))))
						.addContainerGap()));
		glContentPane.setVerticalGroup(glContentPane.createParallelGroup(Alignment.LEADING).addGroup(glContentPane
				.createSequentialGroup().addContainerGap().addComponent(lblNewLabel).addGap(28)
				.addGroup(glContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNom))
				.addGap(18)
				.addGroup(glContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldPrenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrenom))
				.addGap(18)
				.addGroup(glContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
				.addGap(18)
				.addGroup(glContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMdp))
				.addGap(18)
				.addGroup(glContentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblMdpConfirmer)
						.addComponent(passwordFieldConfirmer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(glContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCreate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(18).addComponent(lblPasswordError, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(lblPasswordErrorInstructions, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
				.addGap(4)));
		contentPane.setLayout(glContentPane);
	}

	public void setDialogue(DialogAjoutClient d) {
		dialogAjoutClient = d;
	}

	protected void doBtnNewButton1actionPerformed(ActionEvent e) {
		dialogAjoutClient.eventCreationClient(textFieldNom.getText(), textFieldPrenom.getText(),
				textFieldEmail.getText(), passwordField.getPassword(), passwordFieldConfirmer.getPassword());
	}

	protected void doBtnCancelActionPerformed(ActionEvent e) {
		dialogAjoutClient.eventCreationClientCancel();
	}

	public void resetPresentation() {
		textFieldNom.setText("");
		textFieldPrenom.setText("");
		textFieldEmail.setText("");
		passwordField.setText("");
		passwordFieldConfirmer.setText("");
		lblPasswordError.setText("");
		lblPasswordErrorInstructions.setText("");
	}

	public void setPresentationPasswordError() {
		lblPasswordError.setText("Vous avez saisi deux mots de passe différents");
		lblPasswordErrorInstructions.setText("Merci de les resaisir");
		passwordField.setText("");
		passwordFieldConfirmer.setText("");
	}
}
