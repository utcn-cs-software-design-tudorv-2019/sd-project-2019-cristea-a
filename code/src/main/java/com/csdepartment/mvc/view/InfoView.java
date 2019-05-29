package com.csdepartment.mvc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;

public class InfoView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JButton myOrdersBtn;
	JPanel panel;
	JButton billBtn;

	
	public InfoView() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 myOrdersBtn = new JButton("My Orders");
		myOrdersBtn.setBounds(10, 11, 106, 23);
		contentPane.add(myOrdersBtn);
		
		 panel = new JPanel();
		panel.setBounds(126, 11, 298, 239);
		contentPane.add(panel);
		
		
		table = new JTable();
		panel.add(table);
		
		
		 billBtn = new JButton("Get Bill");
		billBtn.setBounds(10, 39, 106, 23);
		contentPane.add(billBtn);
	}
	public void addOrdersListener(ActionListener al) {
		myOrdersBtn.addActionListener(al);
	}

	public void addBillListener(ActionListener al) {
		billBtn.addActionListener(al);
	}
	public void addTable(JTable table) {
		
		panel.removeAll();
		panel.add(table);
		panel.updateUI();
		}
	
	
}
