package com.cempro.pages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.BasePage;
import com.crmpro.utils.CommonAction;

public class HelpPage extends BasePage {
	
	CommonAction commonAction_obj = new CommonAction();
	
	@FindBy(xpath = "//div[@class='noprint']//table[@cellpadding='0']//a[@class='topnavlink'][contains(text(),'Help')]")
	private WebElement helpLink;
	
	private By allLink = By.tagName("a");
	
	public HelpPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHelpLink() {
		helpLink.click();
	}
	
	public void getAllLink() {
		commonAction_obj.check_Link_connection(allLink);
	}
	
	

}
