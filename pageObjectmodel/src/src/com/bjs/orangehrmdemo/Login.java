package com.bjs.orangehrmdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	
	
	By un=By.xpath("//input[@name='username']");
	By pwd=By.xpath("//input[@name='password']");
	By sub=By.xpath("//button[@type='submit']");
	
	public Login(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void typeuserName() {
		driver.findElement(un).sendKeys("Admin");
		
	}
	public void typePassword() {
		driver.findElement(pwd).sendKeys("admin123");
	}
	public void submitbutton() {
		driver.findElement(sub).click();
	}
}
