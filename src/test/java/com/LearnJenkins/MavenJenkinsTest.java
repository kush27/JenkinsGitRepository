package com.LearnJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenJenkinsTest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
	}
	@Test
	public void test()
	{
		System.out.println("Test Method");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.close();
	}

}
