package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AdminPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {
	
	private AdminPage adminPage;
	public AdminStepDefinition () {
		this.adminPage = new AdminPage();
	}
	
	@When("Je clique sur le module Admin")
	public void jeCliqueSurLeModuleAdmin() {
		
		adminPage.clickOnModuleAdmin();
	   
	}
	@When("Je saisis {string} dans le champ Username")
	public void jeSaisisDansLeChampUsername(String name) {
		adminPage.fillUsername(name);
	  
	}
	@When("Je clique sur le boutton Search")
	public void jeCliqueSurLeBouttonSearch() {
	   adminPage.clickOnBtnSearch();
	}
	@Then("Je verifie la presence d un utilisateur dans le tableau")
	public void jeVerifieLaPresenceDUnUtilisateurDansLeTableau() {
	  
	}




}
