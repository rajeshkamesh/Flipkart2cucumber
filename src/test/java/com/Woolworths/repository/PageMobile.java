package com.Woolworths.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageMobile extends CommonActions{

	public PageMobile() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@type='button']")
	private WebElement cl;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchBox;
	

	public WebElement getCl() {
		return cl;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getClick() {
		return click;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement click;
	
	@FindBy(xpath="//span[contains(text(),'CONTINUE')]")
	private WebElement pay;


	public WebElement getPay() {
		return pay;
	}
}
