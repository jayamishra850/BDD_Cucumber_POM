package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	/*public void title_of_login_page_is_Free_CRM() 
	{
	   String title= driver.getTitle();
	   System.out.println(title);
	   org.testng.Assert.assertEquals("Facebook – log in or sign up", title);
	}*/
 public String verifyHomePageTitle()
 {
	 return driver.getTitle();
	 }
}
