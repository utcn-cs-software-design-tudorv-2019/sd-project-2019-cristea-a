package com.csdepartment.mvc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MainView extends JFrame {

	private JPanel contentPane;
	private ImageIcon fundalImage;
	JButton contactbtn;
	JButton btninfo;
	JButton btnRegistration;
	JButton btnComenzi;
	JComboBox marcaBox;
	JComboBox modelBox;
	JComboBox piesaBox;
	JButton searchbtn;
	JPanel panel;
	 JTable table;
	private JButton comandaBtn;
	private JTextField idBox;
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    contactbtn = new JButton("Contact");
		contactbtn.setBounds(335, 11, 89, 23);
		contentPane.add(contactbtn);
		
	    btninfo = new JButton("Info");
		btninfo.setBounds(236, 11, 89, 23);
		contentPane.add(btninfo);
		
	    btnRegistration = new JButton("Login");
		btnRegistration.setBounds(123, 11, 103, 23);
		contentPane.add(btnRegistration);
		
	    btnComenzi = new JButton("Comenzi");
		btnComenzi.setBounds(24, 11, 89, 23);
		contentPane.add(btnComenzi);
		
		JLabel lblNewLabel = new JLabel("         Marca");
		lblNewLabel.setBounds(24, 57, 89, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("          Model");
		lblNewLabel_1.setBounds(24, 106, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("           Piesa");
		lblNewLabel_2.setBounds(24, 139, 89, 23);
		contentPane.add(lblNewLabel_2);
		
		 marcaBox = new JComboBox();
		marcaBox.setBounds(24, 75, 89, 20);
		contentPane.add(marcaBox);
		
		 modelBox = new JComboBox();
		modelBox.setBounds(24, 123, 89, 20);
		contentPane.add(modelBox);
		
		 piesaBox = new JComboBox();
		piesaBox.setBounds(24, 154, 89, 20);
		contentPane.add(piesaBox);
		
		 panel = new JPanel();
		panel.setBounds(144, 70, 290, 191);
		contentPane.add(panel);
		
		table = new JTable();
		panel.add(table);
		
		 searchbtn = new JButton("Search");
		searchbtn.setBounds(24, 204, 89, 23);
		contentPane.add(searchbtn);
		
		comandaBtn = new JButton("Comanda");
		comandaBtn.setBounds(24, 227, 89, 23);
		contentPane.add(comandaBtn);
		
		idBox = new JTextField();
		idBox.setBounds(27, 261, 86, 20);
		contentPane.add(idBox);
		idBox.setColumns(10);
		//fundalImage=new ImageIcon(getClass().getResource("image.jpg"));
		
		this.setVisible(true);
		
		
	
		
	}
	public void removeAllMArca() {
		
		marcaBox.removeAllItems();
		contentPane.updateUI();
	}
public void removeAllModel() {
		
		modelBox.removeAllItems();
		contentPane.updateUI();
	}
public void removeAllPiesa() {
	
	piesaBox.removeAllItems();
	contentPane.updateUI();
}
	
	public void addMarca(String marca) {
		
		marcaBox.addItem(marca);
		contentPane.updateUI();
	}
public void addModel(String marca) {
		
		modelBox.addItem(marca);
		contentPane.updateUI();
	}
public void addPiesa(String marca) {
	
	piesaBox.addItem(marca);
	contentPane.updateUI();
}
	
	public void addRegistrationListener(ActionListener al) {
		btnRegistration.addActionListener(al);
	}
	public void addContactListener(ActionListener al) {
		contactbtn.addActionListener(al);
	}
	public void addMarcaItemListener(ItemListener it) {
		marcaBox.addItemListener(it);
	}
	public void addModelItemListener(ItemListener it) {
		modelBox.addItemListener(it);
	}
	public void addPiesaItemListener(ItemListener it) {
		piesaBox.addItemListener(it);
	}
	public void addSearchListener(ActionListener al) {
		searchbtn.addActionListener(al);
	}
	public void addInfoListener(ActionListener al) {
		
		btninfo.addActionListener(al);
	}
	public void addComandaListener(ActionListener al) {
		
		
		comandaBtn.addActionListener(al);
	}
public void addTable(JTable table) {
		
	panel.removeAll();
	panel.add(table);
	panel.updateUI();
	}

	
	public JTable getTable() {
		return table;
	}
	public int getIdText() {
		
		return Integer.parseInt(idBox.getText());
	}
	
}
