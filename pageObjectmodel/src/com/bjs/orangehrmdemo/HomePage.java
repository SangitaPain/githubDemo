package com.bjs.orangehrmdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	ChromeDriver driver;
	By press=By.xpath("//a[text()='OrangeHRM, Inc']");
	
	public HomePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void nextPage() {
		driver.findElement(press).click();
	}
}
