package com.Woolworths.step;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Woolworths.repository.CommonActions;
import com.Woolworths.repository.PageMobile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
public class StepDefinition extends CommonActions {
	
	CommonActions c=new CommonActions();
	PageMobile m=new PageMobile();
	
	@Given("login the flipkart")
	public void login_the_flipkart() {
		//c.launch("https://www.flipkart.com/");
		//WebElement f1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		WebElement f1 = m.getClose();
		f1.click();
	    c.waits();
   
	}
String names;
	@When("search mobile by using oneD list")
	public void search_mobile_by_using_oneD_list(DataTable dataTable) {
		List<String> datas = dataTable.asList();
		for(int i=0; i<datas.size();i++) {
		names =datas.get(0);
		}
		WebElement fe = m.getSearchBox();
		//WebElement fe = driver.findElement(By.xpath("//input[@type='text']"));
		fe.sendKeys(names);
		c.waits();
		//WebElement submit = m.getCl();
		//submit.click();
		//WebElement close = m.getCli();
		WebElement close = m.getSubmit();
		//WebElement close = driver.findElement(By.xpath("//button[@type='submit']"));
		close.click();
		//WebElement ele = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		WebElement ele = m.getClick();
		ele.click();
		
	}

	@When("select mobile")
	public void select_mobile() {
		c.windowhandle();
		c.waits();
	}

	@When("add to cart")
	public void add_to_cart() {
		WebElement buy = m.getCl();
		//WebElement buy = m.getBuy();
		buy.click();
		
	}
	@Then("buy the mobile")
	public void buy_the_mobile() {
		WebElement pay = m.getPay();
		pay.click();
		driver.navigate().refresh();
		c.waits();
		
	}
	@When("search mobile {string}")
	public void search_mobile(String string) {
	  names = string;
	  WebElement text = m.getSearchBox();
	  text.sendKeys(names);
	  WebElement close = m.getSubmit();
	  close.click();
	  WebElement ele = m.getClick();
		ele.click();

	  
	}


}
