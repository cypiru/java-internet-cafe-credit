package old;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;

public class Project extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField amountfield;
	private JTextField unfield;
	private JTextField balfield;
	String pc;
	int bal;
	String username;
	String emp = "";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Project() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Donyl Cyprus Basio\\Downloads\\download.png"));
		setTitle("INTERNET CAFE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Pcno = new JLabel("PCnumber:");
		Pcno.setForeground(Color.BLACK);
		Pcno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Pcno.setBounds(10, 125, 82, 27);
		contentPane.add(Pcno);
		
		JLabel usern = new JLabel("UserName:");
		usern.setForeground(Color.BLACK);
		usern.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usern.setBounds(10, 163, 82, 27);
		contentPane.add(usern);
		
		JLabel Bal = new JLabel("Balance:");
		Bal.setForeground(Color.BLACK);
		Bal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Bal.setBounds(222, 128, 82, 21);
		contentPane.add(Bal);
		
		JLabel entam = new JLabel("Enter amount:");
		entam.setForeground(Color.BLACK);
		entam.setFont(new Font("Tahoma", Font.PLAIN, 13));
		entam.setBounds(222, 163, 82, 27);
		contentPane.add(entam);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(10, 160, 60, 0);
		contentPane.add(lblNewLabel_5);
		
		JLabel topin = new JLabel("Top in");
		topin.setForeground(Color.BLACK);
		topin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		topin.setBounds(10, 92, 82, 22);
		contentPane.add(topin);
		
///////////////////////////////////////////////////////////////
		//////////////////Fields///////////////
		
		amountfield = new JTextField();
		amountfield.setBounds(314, 167, 110, 20);
		contentPane.add(amountfield);
		amountfield.setColumns(10);

		unfield = new JTextField();
		unfield.setBounds(102, 167, 110, 21);
		contentPane.add(unfield);
		unfield.setColumns(10);
		
		JButton topup = new JButton("TOPUP");
		topup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bal += Integer.parseInt(amountfield.getText());
				balfield.setText(Integer.toString(bal));
				amountfield.setText(emp);
				unfield.setText(emp);
					
			}	
					/*bal += Integer.parseInt(amountfield.getText());
					balfield.setText(Integer.toString(bal));
					amountfield.setText(emp);
					unfield.setText(emp);*/
		});
		topup.setBounds(222, 190, 89, 23);
		contentPane.add(topup);
		
		

        JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PC1", "PC2", "PC3", "PC4", "PC5", "PC6", "PC7", "PC8", "PC9", "PC10", "PC11", "PC12"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				String opt = (String) comboBox.getSelectedItem();
                switch(opt) {

                case "PC1":
                    pc = "available";
                    bal = 0;
                    break;
                case "PC2":
                    pc = "available";
                    bal = 0;
                    break;
                case "PC3":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC4":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC5":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC6":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC7":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC8":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC9":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC10":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC11":
                	pc = "available";
                	bal = 0;
                    break;
                case "PC12":
                	pc = "available";
                	bal = 0;
                    break;
                }
				
                balfield.setText("");
			}
		});
		comboBox.setBounds(102, 128, 110, 22);
		contentPane.add(comboBox);
		
		JButton ent = new JButton("ENTER");
		ent.setBounds(0, 190, 89, 23);
		contentPane.add(ent);
		ent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				balfield.setText(Integer.toString(bal)); 
			}
		});
		
		
		balfield = new JTextField();
		balfield.setBounds(314, 129, 110, 20);
		contentPane.add(balfield);
		balfield.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 0));
		panel.setBounds(0, 0, 470, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INTERNET CAFE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 57));
		lblNewLabel.setBounds(10, 11, 450, 59);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create Here If You Dont Have Account");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 224, 355, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			CreateAcc ac = new CreateAcc();
			Project.this.setVisible(false);
			ac.setVisible(true);
			
				
			}
		});
		btnNewButton.setBounds(3, 254, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 204));
		panel_1.setBounds(0, 81, 465, 242);
		contentPane.add(panel_1);
	}
}
