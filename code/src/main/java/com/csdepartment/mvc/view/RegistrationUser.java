package com.csdepartment.mvc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class RegistrationUser extends JFrame{
	
	private JPanel contentPane_rt;
	private JTextField name_rt;
	private JTextField username_rt;
	private JTextField password_rt;
	private JTextField email;
	JButton btnRegister_rt=null;

	public RegistrationUser() {

		setBounds(100, 100, 450, 300);
		contentPane_rt = new JPanel();
		contentPane_rt.setBackground(Color.BLACK);
		contentPane_rt.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_rt);
		contentPane_rt.setLayout(null);

		btnRegister_rt = new JButton("REGISTER");
		
		btnRegister_rt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRegister_rt.setBounds(241, 115, 89, 23);
		contentPane_rt.add(btnRegister_rt);

		JLabel lblName_rt = new JLabel("Name");
		lblName_rt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName_rt.setForeground(Color.WHITE);
		lblName_rt.setBounds(39, 31, 46, 14);
		contentPane_rt.add(lblName_rt);

		name_rt = new JTextField();
		name_rt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		name_rt.setBounds(39, 45, 86, 20);
		contentPane_rt.add(name_rt);
		name_rt.setColumns(10);

		JLabel lblUsername_rt = new JLabel("Username");
		lblUsername_rt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsername_rt.setForeground(Color.WHITE);
		lblUsername_rt.setBounds(39, 76, 86, 14);
		contentPane_rt.add(lblUsername_rt);

		username_rt = new JTextField();
		username_rt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		username_rt.setBounds(39, 90, 86, 20);
		contentPane_rt.add(username_rt);
		username_rt.setColumns(10);

		JLabel lblPassword_rt = new JLabel("Password");
		lblPassword_rt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword_rt.setForeground(Color.WHITE);
		lblPassword_rt.setBounds(39, 121, 86, 14);
		contentPane_rt.add(lblPassword_rt);

		password_rt = new JTextField();
		password_rt.setBounds(39, 136, 86, 20);
		contentPane_rt.add(password_rt);
		password_rt.setColumns(10);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setBounds(39, 166, 86, 14);
		contentPane_rt.add(emailLabel);

		email = new JTextField();
		email.setBounds(39, 180, 86, 20);
		contentPane_rt.add(email);
		email.setColumns(10);
		
	}
	public void addUserRegistrationListener(ActionListener al) {
		btnRegister_rt.addActionListener(al);
	}
	
	
	public String getName() {
		
		return name_rt.getText();
	}
public String getUsername() {
		
		return username_rt.getText();
	}
public String getPassword() {
	
	return password_rt.getText();
}
public String getEmail() {
	
	
	return email.getText();
}

}