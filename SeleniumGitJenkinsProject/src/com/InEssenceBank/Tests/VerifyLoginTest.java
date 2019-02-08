package com.InEssenceBank.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class VerifyLoginTest {
	String url;
	WebDriver driver;
  @Test
  public void f() { 
	  driver.findElement(By.id("ctl00_body_txtUserID")).sendKeys("donhere");
	  driver.findElement(By.id("ctl00_body_txtPassword")).sendKeys("don@123");
	  driver.findElement(By.name("ctl00$body$btnLogin")).click();
	  if (driver.findElement(By.id("ctl00_ctl00_divWelcome")).isDisplayed()) 
		  System.out.println("Login success");
	  else
		  System.out.println("Login failed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  url = "http://10.67.89.86:84/Common/Login.aspx";
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nagesh_boregowda\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.navigate().to(url);
  }
  @AfterMethod
  public void afterMethod() {
	 // driver.close();
  }

}





