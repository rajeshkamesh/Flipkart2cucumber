package com.Woolworths.repository;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
public static WebDriver driver;

	public void launch(String url) {
		
		try{
			WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		//driver.get("settings//settings/clearBrowserData");

		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		}
		catch(Exception e){

		}}
	public void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void ScrollDown(WebElement name) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",name);
		
	}
	
	public void windowhandle() {
		
		try{
			
			String wh = driver.getWindowHandle();
		Set<String> wh2 = driver.getWindowHandles();
		//List<String> wh3=new ArrayList<String>(wh2);
		for(String x:wh2) {
			if(!wh.equals(wh2)) {
				driver.switchTo().window(x);
				
			}
		}
		
	}
	catch(Exception e) {
		
	}
	
	
	
	}
	public void Waits (WebElement e) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
	

}
