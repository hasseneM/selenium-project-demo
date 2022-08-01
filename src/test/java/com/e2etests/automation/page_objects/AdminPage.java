package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AdminPage {
	

	public AdminPage() {
		PageFactory.initElements(Setup.driver, this);
		
	}
	
	/* @FindBy WebElement */

	@FindBy(how = How.ID, using = "menu_admin_viewAdminModule")
	public static WebElement adminModule;
	
	@FindBy(how = How.ID, using = "searchSystemUser_userName")
	public static WebElement userName;
	
	@FindBy(how = How.ID, using = "searchBtn")
	public static WebElement searchBtn;
	
	@FindBy(how = How.ID, using = "resultTable")
	public static WebElement resultSearch;
	
	/* Create methode */

	public void fillUsername(String txt_username) {
		userName.sendKeys(txt_username);
					}
	public void clickOnBtnSearch() {
		searchBtn.click();

	}
	public void clickOnModuleAdmin() {
		adminModule.click();

	}

}
