package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Server {
	     static String username, passwd, main, web1, web2, web3;
	     static String cloud01, cloud02, cloud03, cloud04;    
	     
		public static void main(String[] args) {
				
		WebDriver Server = new FirefoxDriver();
		
	    username = "sayem@org.com";
	    passwd = "encrptd";
	    main = "https://www.sayem.org/";
	    web1 = "https://web1.sayem.org/";
	    web2 = "https://web2.sayem.org//offerings";
	    web3 = "https://web3.sayem.org//sales/4868";
	    cloud01 = "https://cloud01.sayem.org//sales/4868/products/43436";
	    cloud02 = "https://cloud02.sayem.org//sales/4868";
	    cloud03 = "https://cloud03.sayem.org//sales/4868/products/43436";
	    cloud04 = "https://cloud04.sayem.org//offerings";	
	    
	    mainserver(Server);
	    web1(Server);
	    web2(Server);
	    web3(Server);
	    cloud01(Server);
	    cloud02(Server);
	    cloud03(Server);
	    cloud04(Server);
	    quit(Server);
	    
		}
		
		// Main Server 
	    public static void mainserver(WebDriver Server) {
	    Server.navigate().to(main);
	    Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);	  
		boolean houseDisplayed = false;
		try {
			 WebElement mainweb = Server.findElement(By.linkText("ACCOUNT")); 
			 houseDisplayed = mainweb.isDisplayed();
		}
	    catch (NoSuchElementException ex) {}
		if (houseDisplayed) {
			 Server.findElement(By.linkText("ACCOUNT")); 
		}   else  {
		    System.out.println("Main Server Fail");
			Server.findElement(By.name("email")).sendKeys(username);
			Server.findElement(By.name("password")).sendKeys(passwd);
			Server.findElement(By.id("login")).click();
		}				
	}			
	     
	    // Web1
	    public static void web1(WebDriver Server) {
	    	Server.navigate().to(web1);
			Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
			boolean houseDisplayed1 = false;
			try {
			      WebElement webserver1 = Server.findElement(By.linkText("ACCOUNT")); 
			      houseDisplayed1 = webserver1.isDisplayed();
			}
			catch (NoSuchElementException ex) {}
			if (houseDisplayed1) {
			      Server.findElement(By.linkText("ACCOUNT")); 
			}else{
			      System.out.println("Main Server Fail");
			      Server.findElement(By.name("email")).sendKeys(username);
			      Server.findElement(By.name("password")).sendKeys(passwd);
			      Server.findElement(By.id("login")).click();    	
	    	    	
	    }
	 } 
	    
	    // Web2	    
	    public static void web2 (WebDriver Server) {
	    	Server.navigate().to(web2);
			Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
			boolean houseDisplayed11 = false;
			try {
			      WebElement webserver2 = Server.findElement(By.linkText("ACCOUNT")); 
			      houseDisplayed11 = webserver2.isDisplayed();
			}
			catch (NoSuchElementException ex) {}
			if (houseDisplayed11) {
			      Server.findElement(By.linkText("ACCOUNT")); 
			}else{
			      System.out.println("Main Server Fail");
			      Server.findElement(By.name("email")).sendKeys(username);
			      Server.findElement(By.name("password")).sendKeys(passwd);
			      Server.findElement(By.id("login")).click();
			}		
	     }
   
	    // Web3
	    public static void web3 (WebDriver Server) {
	    	Server.navigate().to(web3);		
			Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
			boolean houseDisplayed111 = false;
			try {
			      WebElement webserver3 = Server.findElement(By.linkText("ACCOUNT")); 
			      houseDisplayed111 = webserver3.isDisplayed();
			}
			catch (NoSuchElementException ex) {}
			if (houseDisplayed111) {
			      Server.findElement(By.linkText("ACCOUNT")); 
			}else{
			      System.out.println("Main Server Fail");
			      Server.findElement(By.name("email")).sendKeys(username);
			      Server.findElement(By.name("password")).sendKeys(passwd);
			      Server.findElement(By.id("login")).click();
			}		    	
	    }
	     
	    //Cloud 01
	    public static void cloud01(WebDriver Server) {
	    	
	    	Server.navigate().to(cloud01);		
			Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
			boolean houseDisplayed5 = false;
			try {
			      WebElement cloudserver1= Server.findElement(By.id("house"));
			      houseDisplayed5 = cloudserver1.isDisplayed();
			}
			catch (NoSuchElementException ex) {}
			if (houseDisplayed5) {
			      Server.findElement(By.linkText("ACCOUNT")); 
			}else{
			      System.out.println("Main Server Fail");
			      Server.findElement(By.name("email")).sendKeys(username);
			      Server.findElement(By.name("password")).sendKeys(passwd);
			      Server.findElement(By.id("login")).click();
			}	
	    }

	    // Cloud 02
	    public static void cloud02(WebDriver Server) {
	    	Server.navigate().to(cloud02);		
			Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
			boolean houseDisplayed6 = false;
			try {
			      WebElement cloudserver2 = Server.findElement(By.linkText("ACCOUNT")); 
			      houseDisplayed6 = cloudserver2.isDisplayed();
			}
			catch (NoSuchElementException ex) {}
			if (houseDisplayed6) {
			      Server.findElement(By.linkText("ACCOUNT")); 
			}else{
			      System.out.println("Main Server Fail");
			      Server.findElement(By.name("email")).sendKeys(username);
			      Server.findElement(By.name("password")).sendKeys(passwd);
			      Server.findElement(By.id("login")).click();
			}		
	    	
	    	
	    }
	    
	    // Cloud 03	    
	    public static void cloud03(WebDriver Server) {
	    	Server.navigate().to(cloud03);		
			Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
			boolean houseDisplayed7 = false;
			try {
			      WebElement cloudserver3 = Server.findElement(By.linkText("ACCOUNT")); 
			      houseDisplayed7 = cloudserver3.isDisplayed();
			}
			catch (NoSuchElementException ex) {}
			if (houseDisplayed7) {
			      Server.findElement(By.linkText("ACCOUNT")); 
			}else{
			      System.out.println("Main Server Fail");
			      Server.findElement(By.name("email")).sendKeys(username);
			      Server.findElement(By.name("password")).sendKeys(passwd);
			      Server.findElement(By.id("login")).click();	
	    	
	       }			
	   }
	    // Cloud 04
	    public static void cloud04(WebDriver Server) {
	    	Server.navigate().to(cloud04);		
			Server.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
			boolean houseDisplayed8 = false;
			try {
			      WebElement cloudserver4 = Server.findElement(By.linkText("ACCOUNT")); 
			      houseDisplayed8 = cloudserver4.isDisplayed();
			}
			catch (NoSuchElementException ex) {}
			if (houseDisplayed8) {
			      Server.findElement(By.linkText("ACCOUNT")); 
			}else{
			      System.out.println("Main Server Fail");
			      Server.findElement(By.name("email")).sendKeys(username);
			      Server.findElement(By.name("password")).sendKeys(passwd);
			      Server.findElement(By.id("login")).click();
			}		
	    }
	    public static void quit(WebDriver Server) {
	    	//Server.quit();
	    }
}

