package weeek3.day1.homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {
	
	WebDriver driver = new ChromeDriver();
	
	public void enterCredentials() {
		WebElement ele = driver.findElement(By.xpath("(//form[@id='login']/p)[3]/input"));
		ele.click();
	}
	
	public void navigateToHomePage() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	
	public static void main(String[] args) {
		TestData td = new TestData();		
	}
}


