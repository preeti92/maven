package com.pages.Actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Actitime.Autoconstant;
import com.generics.Actitime.ExcelLibrary;

public class POMActitimeLoginPage implements Autoconstant
{
	@FindBy(id="username")
	private WebElement usernametextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordtextfield;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginmethod() throws IOException 
	{
		usernametextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
		passwordtextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
		loginbutton.click();
	}
	

}
