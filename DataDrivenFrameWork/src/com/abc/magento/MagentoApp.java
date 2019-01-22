package com.abc.magento;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoApp 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("F:\\all projects\\DataDrivenFrameWork\\src\\com\\abc\\properties\\data.properties");
		
		Properties p = new Properties();
		p.load(fis);
		String url=p.getProperty("url");		
		String un=p.getProperty("un");
		String pwd=p.getProperty("pwd");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.quit();
	}

}
