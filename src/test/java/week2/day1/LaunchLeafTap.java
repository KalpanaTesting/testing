package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchLeafTap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ChromeDriver driver1 = new ChromeDriver();
		EdgeDriver driver2 = new EdgeDriver();

		driver2.get("http://leaftaps.com/opentaps");

		WebElement eleUsername = driver2.findElement(By.id("username"));
		eleUsername.sendKeys("demosalesmanager");

		WebElement elePassword = driver2.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");

		WebElement eleLogin = driver2.findElement(By.className("decorativeSubmit"));
		eleLogin.click();

	}
}
