package old;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CreateAcc extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String FILE_PATH = null;
	private JPanel contentPane;
	private JTextField un;
	private JTextField pw;
	String username;
	String password;
	String txt = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAcc frame = new CreateAcc();
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
	public CreateAcc() {
		setTitle("INTERNET  CAFE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Donyl Cyprus Basio\\Downloads\\download.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREATE YOUR ACCOUNT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 350, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 105, 90, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 151, 90, 35);
		contentPane.add(lblNewLabel_2);
		
        ////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////FIELD///////////////////////////////////////////////////
		
		un = new JTextField();
		un.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		un.setBounds(98, 110, 112, 29);
		contentPane.add(un);
		un.setColumns(10);
		
		pw = new JTextField();
		pw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				}
		});
		pw.setBounds(98, 156, 112, 29);
		contentPane.add(pw);
		pw.setColumns(10);
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////BUTTON//////////////////////////////////////////////////
		
		JButton crt = new JButton("Create");
		crt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrintWriter infile;
				try {
				infile = new PrintWriter(new FileWriter("account.txt", true));
				infile.println(un.getText()+ ":" + pw.getText() );
				infile.close();
				} catch (IOException e1) {
				e1.printStackTrace();
			}
				un.setText("");
				pw.setText("");
			}
		});
		
		crt.setBounds(10, 197, 89, 23);
		contentPane.add(crt);
		
		JButton btnNewButton_1 = new JButton("GO BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Project proj = new Project();
				CreateAcc.this.setVisible(false);
				proj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 204));
		panel.setBounds(0, 0, 434, 61);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 61, 434, 200);
		contentPane.add(panel_1);
	}

}

