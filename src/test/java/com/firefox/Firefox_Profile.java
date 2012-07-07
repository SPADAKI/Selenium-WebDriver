package com.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ProfilesIni allProfiles = new ProfilesIni ();
	FirefoxProfile profile = allProfiles.getProfile("Sayem"); 
	
	// Firefox Profile Manager
	// Syeds-iMac:~ sayem$ Applications/Firefox.app/Contents/MacOS/firefox-bin -profilemanager
	
	WebDriver driver = new FirefoxDriver(profile);
	
	driver.get("http://www.gmail.com");
	System.out.println("Titile is -- " +driver.getTitle() );
	System.out.println("Current URL --"+ driver.getCurrentUrl() );
	System.out.println("Page Source ----");
	System.out.println(driver.getPageSource() );
	
	driver.quit();
	
	}
}
