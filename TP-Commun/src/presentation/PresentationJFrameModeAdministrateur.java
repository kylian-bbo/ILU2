package presentation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;

public class PresentationJFrameModeAdministrateur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	private JLabel lblClientAjoutes;

	/**
	 * Create the frame.
	 */
	public PresentationJFrameModeAdministrateur() {
		setTitle("Fen\u00EAtre administrateur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblClientAjoutes = new JLabel("Liste des clients ajout\u00E9s:");
		lblClientAjoutes.setFont(new Font("Tahoma", Font.PLAIN, 14));

		textArea = new JTextArea();
		GroupLayout glContentPane = new GroupLayout(contentPane);
		glContentPane.setHorizontalGroup(glContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(glContentPane.createSequentialGroup()
						.addGroup(glContentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
								.addGroup(glContentPane.createSequentialGroup().addContainerGap().addComponent(
										lblClientAjoutes, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		glContentPane.setVerticalGroup(glContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(glContentPane.createSequentialGroup().addGap(9).addComponent(lblClientAjoutes).addGap(17)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)));
		contentPane.setLayout(glContentPane);
	}

	public void presentationClientAjoute(String nom, String prenom, String email) {
		textArea.append("Nom: " + nom + " Prénom: " + prenom + "Adresse email: " + email + "\n");
	}
}
