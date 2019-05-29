package com.csdepartment.mvc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;



import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class ViewProject extends JFrame{
	
	private JPanel contentPane_t;
	private JTextField name_login;
	private JTextField password_login;
	private JPanel contentPane;
	private JTable table;
	
	JButton btnNewButton=null;
	JButton btnNewButton_1=null;
	JButton btnNewButton_3=null;
	JButton btnNewButton_4=null;


	// login
	private JPanel contentPane_login;
	private JLabel lblUsernameOrPassword;

	private JTable table_1;
	ViewStudent v = null;
	ViewAdmin a = null;
	
	RegistrationUser rt = null;



	public ViewProject() {
		
		
		setBounds(100, 100, 450, 300);
		contentPane_t = new JPanel();
		
		contentPane_t.setForeground(Color.WHITE);
		contentPane_t.setBackground(Color.BLACK);
		contentPane_t.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_t);
		contentPane_t.setLayout(null);
		
		name_login = new JTextField();
		name_login.setBounds(88, 83, 159, 20);
		contentPane_t.add(name_login);
		name_login.setColumns(10);

		password_login = new JTextField();
		password_login.setBounds(88, 144, 159, 20);
		contentPane_t.add(password_login);
		password_login.setColumns(10);

		 btnNewButton = new JButton("Login");
	

		btnNewButton.setBounds(292, 82, 112, 23);
		contentPane_t.add(btnNewButton);

		

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 58, 159, 14);
		contentPane_t.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(88, 119, 159, 14);
		contentPane_t.add(lblNewLabel_1);

	

		 btnNewButton_4 = new JButton("Register");
		
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(267, 187, 137, 23);
		contentPane_t.add(btnNewButton_4);
		

	}

	

	private void login() {

		setBounds(100, 100, 350, 200);
		contentPane_login = new JPanel();
		contentPane_login.setForeground(Color.WHITE);
		contentPane_login.setBackground(Color.BLACK);
		contentPane_login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_login);
		contentPane_login.setLayout(null);

		lblUsernameOrPassword = new JLabel("Username or password is incorrect");
		lblUsernameOrPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsernameOrPassword.setForeground(Color.WHITE);
		lblUsernameOrPassword.setBounds(42, 68, 267, 30);
		contentPane_login.add(lblUsernameOrPassword);
		

	}
	public void addLoginListener(ActionListener al) {
		btnNewButton.addActionListener(al);
	}
	
	
	public void addRegisterUserListener(ActionListener al) {
		btnNewButton_4.addActionListener(al);
	}
	public String getNameLogin() {
		
		return name_login.getText();
	}
public String getPasswordLogin() {
		
		return password_login.getText();
	}



}
