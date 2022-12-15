package week1.day1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("headless");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abuno\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(150);
		driver.manage().window().maximize();
		//Alert al=driver.switchTo().alert();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("samsung mobile");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(500);

	driver.findElement(By.xpath("//div[text()=\"SAMSUNG Galaxy F23 5G (Forest Green, 128 GB)\"]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		String windowHandle = driver.getWindowHandle();
		//driver.findElement(null)
		
		//for(String x:windowHandles) {
			//if(!x.equals(windowHandle)) {
			//	driver.switchTo().window(x);
				//System.out.println(x);	
				//System.out.println(windowHandle);	
				//}
			//}
			Thread.sleep(1000);
			String text = driver.findElement(By.xpath("//div[contains(text(),'16,999')]")).getText();

			//String text = driver.findElement(By.xpath("//div[@class=\"dyC4hf\"]/div/div/div[1]")).getText();
			System.out.println(text);
			//driver.quit();
		}
	}


