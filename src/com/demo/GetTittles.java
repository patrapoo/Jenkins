package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTittles {
	WebDriver driver;
	@Test
	public void seleniumHQ()
	{
		driver =new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		String s=driver.getTitle();
		System.out.println("the name of window is " + s);
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		String s1=driver.getTitle();
		System.out.println("the name of window is " + s1);
		driver.quit();
	}

}
