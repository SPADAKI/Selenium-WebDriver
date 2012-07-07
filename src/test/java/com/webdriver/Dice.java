package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Dice {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WebDriver 1");
		WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new HtmlUnitDriver();
		//driver.get("http://www.chasestudentloans.com/");
		driver.navigate().to("http://www.chasestudentloans.com/"); // Navigate can use back forward
		driver.findElement(By.linkText("Budget Calculators")).click(); // Find the link and click on it
		Thread.sleep(2000); // Wait for 2 sec at this step
		driver.findElement(By.xpath("//html/body/form/div/div[3]/div/div/div/div[4]/table/tbody/tr[2]/td[2]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("tuition")).clear();
		driver.findElement(By.name("tuition")).sendKeys("123");
		Thread.sleep(2000); // Wait for 2 sec at this step
		driver.findElement(By.name("job")).clear();
		driver.findElement(By.name("job")).sendKeys("567");
		Thread.sleep(2000); // Wait for 2 sec at this step
		String myText = driver.findElement(By.xpath("//html/body/form/div/div/div[2]/p")).getText();
		System.out.println("Text is " + myText);
		driver.findElement(By.xpath("//input[@type='button' and @value='Calculate']")).click();
		Thread.sleep(4000); // Wait for 2 sec at this step
		//String myBalance = driver.findElement(By.name("balance")).getText();
		String myBalance = driver.findElement(By.name("balance")).getAttribute("value");
		System.out.println("Balance is " + myBalance);
		driver.navigate().back();
		driver.navigate().forward();
		

		driver.navigate().to("http://www.dice.com/");
		// Dice.com app
		driver.findElement(By.name("FREE_TEXT")).sendKeys("selenium");
		driver.findElement(By.name("WHERE")).sendKeys("New York");
		driver.findElement(By.name("searchSubmit")).click();
		Thread.sleep(5000); 
		String mySearch = driver.findElement(By.name("FREE_TEXT")).getAttribute("value");
		System.out.println("My search was " + mySearch);
		String myXP = "//html/body/div[4]/div/div[2]/div/div[3]/form/div/div/h1";
		if ("Search Results".equals(driver.findElement(By.xpath(myXP)).getText())) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Advanced Job Search")).click();
		Thread.sleep(4000);
		
		driver.close();
	}
}
