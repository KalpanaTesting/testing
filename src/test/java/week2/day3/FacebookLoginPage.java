package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
WebElement createNewAccount=driver.findElement(By.linkText("Create New Account"));
createNewAccount.click();
driver.findElement(By.name("firstname")).sendKeys("aaaaaa");
driver.findElement(By.name("lastname")).sendKeys("bbbb");
driver.findElement(By.name("reg_email__")).sendKeys("aaaa.sadasd.sadas");
driver.findElement(By.name("reg_passwd__")).sendKeys("1q2w3e");
Select dateDropDown=new Select(driver.findElement(By.name("birthday_day")));
dateDropDown.selectByVisibleText("20");
Select monthDropDown=new Select(driver.findElement(By.name("birthday_month")));
monthDropDown.selectByValue("4");
Select yearDropDown=new Select(driver.findElement(By.name("birthday_year")));
yearDropDown.selectByIndex(18);
driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][1]")).click();
	
	}

}
