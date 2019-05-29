package com.csdepartment.mvc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class ContactView extends JFrame {

	private JPanel contentPane;

	
	public ContactView() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane text = new JTextPane();
		text.setText("Telefoane:\n "
				+ "0377.100.937 - ONLINE\n"
				+"031.130.04.74 - SECTOR 4\n"
				+ "031.130.04.75 - ORADEA\n"
				+ "031.130.04.78 - BRASOV\n"
				+ "Email:\n"
				+ "vanzari@epiesa.ro\n"
				+ "PROGRAM DE LUCRU\n"
				+ "Luni - Vineri:09:00 - 19:00 (comenzi online non-stop)\n"
				+ "Sambata:09:00 - 14:00 (comenzi online non-stop)\n"
				+ "Duminica: INCHIS (comenzi online non-stop) ");
		text.setBounds(10, 11, 414, 239);
		contentPane.add(text);
	}
}
