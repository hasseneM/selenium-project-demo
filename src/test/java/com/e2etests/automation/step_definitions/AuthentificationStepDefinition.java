package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthentificationcationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private AuthentificationcationPage authentificationcationPage;

	public AuthentificationStepDefinition() {
		this.authentificationcationPage = new AuthentificationcationPage();
	}

	@Given("Je me connecte à l application OrangeHRM")
	public void jeMeConnecteÀLApplicationOrangeHRM() {
		authentificationcationPage.goToUrl();

	}

	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {

		authentificationcationPage.fillUsername(username);

	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {

		authentificationcationPage.fillPassword(password);

	}

	@When("Je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin() {

		authentificationcationPage.clickOnBtnLogin();

	}

	@Then("Je me redirige vers l application Home {string}")
	public void jeMeRedirigeVersLApplicationHome(String msg) {
		String message = AuthentificationcationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));

	}

}
