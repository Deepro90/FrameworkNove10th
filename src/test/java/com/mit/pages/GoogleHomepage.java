package com.mit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage {

	public WebDriver driver;
	
	public GoogleHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//1.Find/locate the element
	
//	WebElement searchBox;
// searchBox = driver.findElement(By.name("q")); 
	//OR
	//*	WebElement searchBox = driver.findElement(By.name("q"));
	@FindBy(name="q")
	WebElement searchBox;
	
// //2.perform action
//searchbox.sendKeys(string);	
	public void entersearch(String string) {
		searchBox.sendKeys(string);
	}
	//WebElement searchBtn = driver.findElement(By.name("btnK"));
	@FindBy (name="btnK")
	WebElement searchBtn;
	
	
	//searchBtn.click();
	//searchBtn.submit();
	public void clickSearch() {
		searchBtn.submit();	
	}
	
	
	
	
	public void enterSearch() {

	}
}
