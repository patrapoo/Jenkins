package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo2 {
	
	WebDriver driver;

	@Test
	public void seleniumHQ()
	{
		driver =new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		String s=driver.getTitle();
		System.out.println("the name of window is " + s);
		driver.findElement(By.xpath("//li[@id='menu_documentation']/descendant::a[.='Documentation']")).click();

}
}
