package com.csdepartment.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.inject.Inject;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.csdepartment.entities.Car;
import com.csdepartment.entities.Comanda;
import com.csdepartment.entities.Parts;
import com.csdepartment.entities.User;
import com.csdepartment.mvc.model.CarModel;
import com.csdepartment.mvc.model.ComandaModel;
import com.csdepartment.mvc.model.UserModel;
import com.csdepartment.mvc.view.ContactView;
import com.csdepartment.mvc.view.InfoView;
import com.csdepartment.mvc.view.MainView;
import com.csdepartment.mvc.view.RegistrationUser;
import com.csdepartment.mvc.view.ViewAdmin;
import com.csdepartment.mvc.view.ViewProject;
import com.csdepartment.mvc.view.ViewStudent;
import com.csdepartment.services.CarService;
import com.csdepartment.services.ComandaService;
import com.csdepartment.services.PartService;
import com.csdepartment.services.UserService;
import com.csdepartment.validators.StudentValidator;
import com.csdepartment.validators.TeacherValidator;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;




public class HomePageController {
	
	@Inject
	UserService userService;
	@Inject
	PartService partService;
	@Inject
	CarService carService;
	@Inject
	ComandaService comandaService;
	@Inject
	TeacherValidator teacherValidator;
	@Inject
	StudentValidator studentValidator;
	
	private CarModel carModel;
	private UserModel userModel;
	private ComandaModel comandaModel;
	
	private ViewProject viewProject;
	private RegistrationUser registrationUser;
	private ViewAdmin viewAdmin;
	private ViewStudent viewStudent;
	private MainView mainView;
	private InfoView infoView;
	private ContactView contactView;
	private List<Car> cars=new ArrayList<Car>();
	private List<Parts> parts=new ArrayList<Parts>();
	
	public void init(MainView ViewProject, CarModel studentModel, UserModel teacherModel,ComandaModel comandeModel) {
		
		this.mainView = ViewProject;
		this.carModel = studentModel;
		this.userModel = teacherModel;
		this.comandaModel=comandaModel;
		
		this.registrationUser=new RegistrationUser();
		this.carModel=new CarModel();
		this.userModel=new UserModel();
		this.viewAdmin=new ViewAdmin();
		this.viewStudent=new ViewStudent();
		this.viewProject=new ViewProject();
		this.contactView=new ContactView();
		this.infoView=new InfoView();
		registrationUser.addUserRegistrationListener(new RegistrationListener());
		mainView.addRegistrationListener(new RegistListener());
		viewProject.addRegisterUserListener(new LoginRegister());
		mainView.addContactListener(new ContactListener());
		mainView.addMarcaItemListener(new MarcaItem());
		mainView.addModelItemListener(new ModelItem());
		mainView.addPiesaItemListener(new PiesaItem());
		mainView.addSearchListener(new SearchListener());
		mainView.addInfoListener(new InfoListener());
		viewProject.addLoginListener(new LoginListener());
		infoView.addOrdersListener(new OrdersListener());
		infoView.addBillListener(new BillListener());
		mainView.addComandaListener(new ComandaListener());
		
		
		cars=carService.getAllCar();
		parts=partService.getAllParts();
		for(Car x:cars) {
			mainView.addMarca(x.getName());
			
		}
		for(Parts x:parts) {
			
			
			mainView.addPiesa(x.getName());
		}
		
		
	}
	
class MarcaItem implements ItemListener{
	
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		String selected=(String)e.getItem();
		mainView.removeAllModel();
		
		for(Car x:cars) {
			if (x.getName()==selected) {
			
				mainView.addModel(x.getModel());
			}
			}
		}
		
	}

class ModelItem implements ItemListener{
	
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class PiesaItem implements ItemListener{
	
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class SearchListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String[][] data =new String[100][100];
		String []Column= {"id","Pret","Producator"};
		data[0][0]="Id";
		data[0][1]="Pret";
		data[0][2]="Producator";
		int i=1;
		
		for(Parts x:parts) {
			data[i][0]=Integer.toString(x.getPartid());
			data[i][1]=Integer.toString(x.getPret());
			data[i][2]=x.getProducator();
			i++;
			
		}
		mainView.addTable(new JTable(data,Column));
	}
	
	
	
}	
class LoginListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		User user=userService.getByIduser(100);
		userModel.setUser(user);
		
		
	}
	
	
	
	
}
class LoginRegister implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {

			registrationUser.setVisible(true);
		}
		
}

class RegistrationListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		userService.insert(new User(100, registrationUser.getName(),registrationUser.getUsername(),registrationUser.getPassword(),registrationUser.getEmail()));
	}
	
	
	
}
class RegistListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		viewProject.setVisible(true);
		
		
		
	}
}
class ContactListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		contactView.setVisible(true);
		
		
		
	}
}
class InfoListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		infoView.setVisible(true);
		
	}
	
}
class OrdersListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String[][] data =new String[100][100];
		String []Column= {"Piesa","Producator","Pret","Stare"};
		data[0][0]="Piesa";
		data[0][1]="Producator";
		data[0][2]="Pret";
		data[0][3]="Stare";
		int i=1;
		
		List<Comanda> list=comandaService.getAllComanda();
		for(Comanda comanda:list) {
		Parts part=partService.getStudentById(comanda.getIdpiesa());
		 data[i][0]=part.getName();
		 data[i][1]=part.getProducator();
		 data[i][2]=Integer.toString(part.getPret());
		 data[i][3]=comanda.getLivrat();
		 i++;
		}
		infoView.addTable(new JTable(data,Column));
		
	}
	
	
	
}
class BillListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
class ComandaListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		Comanda comanda=new Comanda(50,userModel.getUser().getIduser(),mainView.getIdText(),"Nelivrat");
		comandaService.insert(comanda);
		//try {
		//	JavaMail javaMail=new JavaMail();
		//} catch (AddressException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		//} catch (MessagingException e1) {
			// TODO Auto-generated catch block
		//	e1.printStackTrace();
		//}
		
		Properties emailProperties;
		Session mailSession;
		MimeMessage emailMessage;
		String emailPort = "587";//gmail's smtp port

		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");

		
			String[] toEmails = { "andrei.cr30@gmail.com" };
			String emailSubject = "Java Email";
			String emailBody = "This is an email sent by JavaMail api.";

			mailSession = Session.getDefaultInstance(emailProperties, null);
			emailMessage = new MimeMessage(mailSession);

			for (int i = 0; i < toEmails.length; i++) {
				try {
					emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
				} catch (AddressException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (MessagingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			try {
				emailMessage.setSubject(emailSubject);
			} catch (MessagingException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				emailMessage.setContent(emailBody, "text/html");
			} catch (MessagingException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}//for a html email
			//emailMessage.setText(emailBody);// for a text email
			
			String emailHost = "smtp.gmail.com";
			String fromUser = "cristeaandrei81";//just the id alone without @gmail.com
			String fromUserEmailPassword = "lucieprost";

			Transport transport = null;
			try {
				transport = mailSession.getTransport("smtp");
			} catch (NoSuchProviderException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

			try {
				transport.connect(emailHost, fromUser, fromUserEmailPassword);
			} catch (MessagingException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
			} catch (MessagingException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				transport.close();
			} catch (MessagingException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			System.out.println("Email sent successfully.");
		
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		document.open();
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		Chunk chunk = new Chunk("Hello World", font);
		 
		try {
			document.add(chunk);
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		document.close();
	}
	
}

}

