package weeek3.day1.homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		WebElement username = driver.findElement(By.xpath("//input[@class='decorativeSubmit']/preceding::input"));
		username.sendKeys("Demosalesmanager");
	}
	
	public void enterPassword() {
		WebElement username = driver.findElement(By.xpath("(//input[@class='decorativeSubmit']/preceding::input)[2]"));
		username.sendKeys("crmsfa");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData ld = new LoginTestData();
		ld.navigateToHomePage();
		ld.enterUsername();
		ld.enterPassword();
		ld.enterCredentials();
	}

}
