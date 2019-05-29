package com.csdepartment;

import javax.inject.Inject;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.csdepartment.mvc.controller.HomePageController;
import com.csdepartment.mvc.model.CarModel;
import com.csdepartment.mvc.model.ComandaModel;
import com.csdepartment.mvc.model.UserModel;
import com.csdepartment.mvc.view.MainView;
import com.csdepartment.mvc.view.ViewProject;
import com.csdepartment.services.ComandaService;
import com.csdepartment.services.PartService;
import com.csdepartment.services.UserService;





@Component
public class Loader implements ApplicationListener<ContextRefreshedEvent>{
	
	
	@Inject
	PartService partService;
	@Inject
	UserService userService;
	@Inject
	ComandaService comandaService;
	@Inject
	MainView homePage;
	@Inject
	CarModel carModel;
	@Inject
	UserModel userModel;
	@Inject
	ComandaModel comandaModel;
	@Inject
	HomePageController homePageController;
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		homePageController.init(homePage, carModel, userModel,comandaModel);

	}

}
