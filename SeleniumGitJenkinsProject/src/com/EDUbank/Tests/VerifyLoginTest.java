package com.EDUbank.Tests;

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
	  driver.findElement(By.id("tellerId")).sendKeys("T7302");
	  driver.findElement(By.id("password")).sendKeys("T7302*abc");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  if (driver.findElement(By.linkText("Logout")).isDisplayed()) 
		  System.out.println("Login success");
	  else
		  System.out.println("Login failed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  url = "http://vjeemys-19:3333/EDUBank/tellerLogin";
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nagesh_boregowda\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.navigate().to(url);
  }
  @AfterMethod
  public void afterMethod() {
	 driver.close();
  }
}












