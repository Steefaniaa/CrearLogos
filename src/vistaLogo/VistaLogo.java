package vistaLogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class VistaLogo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	
	public VistaLogo() {
		
		miDiseño();
		
	}
	
	
	public void miDiseño() {
		
		setTitle("Crear Logos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Crear Logos");
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 128, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
	}

}
