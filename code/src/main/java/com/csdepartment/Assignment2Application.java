package com.csdepartment;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.csdepartment.mvc.controller.HomePageController;
import com.csdepartment.mvc.model.CarModel;
import com.csdepartment.mvc.model.ComandaModel;
import com.csdepartment.mvc.model.UserModel;
import com.csdepartment.mvc.view.MainView;
import com.csdepartment.mvc.view.ViewProject;
import com.csdepartment.validators.StudentValidator;
import com.csdepartment.validators.TeacherValidator;








@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Assignment2Application.class)
		.headless(false)
		.run(args);
		

}
	
	@Bean
    public MainView homeFrame() {
        return new MainView();
    }
	
	
	@Bean
    public CarModel createCarModel() {
        return new CarModel();
    }
	
	@Bean
    public UserModel createUserModel() {
        return new UserModel();
    }
	@Bean
	public ComandaModel createComandaModel() {
		
		
		return new ComandaModel();
	}
	
	@Bean
    public HomePageController createHomePageController() {
        return new HomePageController();
    }
	@Bean
    public TeacherValidator createTeacherValidator() {
        return new TeacherValidator();
    }
	
	@Bean
    public StudentValidator createStudentValidator() {
        return new StudentValidator();
    }

	
	
}
