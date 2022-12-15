package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver1 = new ChromeDriver();
		EdgeDriver driver2 = new EdgeDriver();
		
		driver2.get("https://login.salesforce.com");
		
		WebElement eleUsername = driver2.findElement(By.id("username"));
		eleUsername.sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement elePassword = driver2.findElement(By.id("password"));
		elePassword.sendKeys("Testleaf$321");
		
		WebElement eleLogin = driver2.findElement(By.id("Login"));
		eleLogin.click();

	}

}
