package com.saucelabs;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saucelabs extends TestCase {
    private WebDriver Login;

    public void setUp() throws Exception {
        DesiredCapabilities capabillities = DesiredCapabilities.firefox();
        capabillities.setCapability("version", "6");
        capabillities.setCapability("platform", Platform.XP);
        capabillities.setCapability("name", "Testing Selenium 2 with Java on Sauce");

        this.Login = new RemoteWebDriver(
           new URL("http://sayem:7c4feeb6-40c3-41bf-8bc7-8368915fd56e@ondemand.saucelabs.com:4444/wd/hub"),
           capabillities);
        Login.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void testSauce() throws Exception {
        this.Login.get("http://sayem.org");                        
        Thread.sleep(2000);
		Login.findElement(By.name("email")).sendKeys("syed@hotmail.com");
		Login.findElement(By.name("password")).sendKeys("user123");
		Login.findElement(By.id("login")).click();
		Thread.sleep(3000);		
		Login.navigate().to("sayem.org/billing");
		Thread.sleep(3000);
		
		//For loop start here
		int i;
		for (i=0; i<100; i=i+1) {				
	
			
	   Login.findElement(By.id("new-credit-card")).click();
	   //Thread.sleep(3000);				
	   Login.findElement(By.id("CreditCardCardNumber")).sendKeys("411111111111");
	   //Thread.sleep(3000);
	   Login.findElement(By.id("CreditCardExpMonth")).sendKeys("1");
	   //Thread.sleep(3000);
	   Login.findElement(By.id("CreditCardExpYear")).sendKeys("2012");
	   //Thread.sleep(3000);
	   Login.findElement(By.id("CreditCardCvv")).sendKeys("989");
	   //Thread.sleep(3000);		
	   Login.findElement(By.id("CreditCardStoredAddress")).sendKeys("Enter new billing address");
	   //Thread.sleep(3000);		
	   Login.findElement(By.id("CreditCardFirstName")).sendKeys("Syed");
	   //Thread.sleep(3000);		
	   Login.findElement(By.id("CreditCardLastName")).sendKeys("Sayem");
	   //Thread.sleep(3000);		
	   Login.findElement(By.id("CreditCardAddress")).sendKeys("456 Broadway");
	   //Thread.sleep(3000);		
	   Login.findElement(By.id("CreditCardCity")).sendKeys("Manhattan");
	   //Thread.sleep(3000);
	   Login.findElement(By.id("CreditCardCountry")).sendKeys("United States");
	   //Thread.sleep(3000);
	   Login.findElement(By.xpath("//select[@id='CreditCardState']")).sendKeys("New York");
	   //Thread.sleep(3000);		
	   Login.findElement(By.id("CreditCardZip")).sendKeys("10012");
	   //Thread.sleep(3000);		
	   Login.findElement(By.id("CreditCardPhone")).sendKeys("212258654");
	   //Thread.sleep(3000);
	   Login.findElement(By.id("new-cc-submit")).click();
	   Thread.sleep(2000);
	   Login.findElement(By.xpath("/html/body/div[2]/div/div/p/a")).click();
	   Thread.sleep(2000);
	
			}

		}
    

    public void tearDown() throws Exception {
        this.Login.quit();
    }

}   
