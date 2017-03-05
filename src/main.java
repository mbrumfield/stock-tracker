	import java.awt.EventQueue;
	import java.awt.Font;
	import java.awt.Image;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import java.awt.CardLayout;
	import java.awt.Color;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JRadioButton;
	import javax.swing.JTextPane;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import view.*;

public class main {
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						LoginView window = new LoginView();
						window.init();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
}