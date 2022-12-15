package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchLeafTap2Xpath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ChromeDriver driver1 = new ChromeDriver();
		EdgeDriver driver2 = new EdgeDriver();
		
		driver2.manage().window().maximize();

		driver2.get("http://leaftaps.com/opentaps");

		WebElement eleUsername = driver2.findElement(By.id("username"));
		eleUsername.sendKeys("DemoCsr");

		WebElement elePassword = driver2.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");

		WebElement eleLogin = driver2.findElement(By.className("decorativeSubmit"));
		eleLogin.click();

		WebElement crmSFA = driver2.findElement(By.linkText("CRM/SFA"));
		crmSFA.click();
		
		WebElement lead = driver2.findElement(By.linkText("Leads"));
		lead.click();
		
		WebElement createLead = driver2.findElement(By.linkText("Create Lead"));//partial text
		createLead.click();
		
		//driver2.close();
		
		WebElement source = driver2.findElement(By.id("createLeadForm_dataSourceId"));
		WebElement industry = driver2.findElement(By.id("createLeadForm_industryEnumId"));
		WebElement ownership = driver2.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select DropDown1 = new Select(source);
		Select DropDown2 = new Select(industry);
		Select DropDown3 = new Select(ownership);
		
		DropDown1.selectByVisibleText("Conference");
		DropDown2.selectByValue("IND_FINANCE");
		DropDown3.selectByIndex(5);
	

	}
}
