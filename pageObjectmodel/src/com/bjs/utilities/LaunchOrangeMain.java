package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.orangehrmdemo.HomePage;
import com.bjs.orangehrmdemo.Login;

public class LaunchOrangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login l = new Login(d);
		l.typeuserName();
		l.typePassword();
		l.submitbutton();
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HomePage h = new HomePage(d);
		h.nextPage();
		System.out.println();
	}

}
