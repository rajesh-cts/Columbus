package com.docker.selenium.columbus;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class LoginFirefox 
{
	@Test
    public void LoginPage() throws MalformedURLException
    {
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setBrowserName("firefox");
    	URL url = new URL("http://localhost:4444/wd/hub");
    	RemoteWebDriver driver = new RemoteWebDriver(url, cap);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.get("https://www.dropbox.com/login");
    	driver.findElement(By.xpath("//input[contains(@id,'login_email')]")).sendKeys("rajeshmscbe@gmail.com");
    	driver.findElement(By.xpath("//input[contains(@id,'login_password')]")).sendKeys("Welcome123");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	driver.quit();
		/*
		 * String result = driver.findElement(By.
		 * xpath("//div[@class='login-info two-factor-uses-email']")).getText(); String
		 * expected =
		 * "We sent a code to rajeshmscbe@gmail.com and any devices you’ve linked to this account. Enter the code to continue."
		 * ; Assert.assertTrue(result.contains(expected));
		 */
    }
}
