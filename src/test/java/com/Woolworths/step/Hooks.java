package com.Woolworths.step;

import com.Woolworths.repository.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions{
	
	CommonActions c = new CommonActions();
	@Before
	public void BeforeScenario() {
		c.launch("https://www.flipkart.com/");
		
	}
	@After
	public void AfterScenario() {
		driver.quit();
		
	}
}
