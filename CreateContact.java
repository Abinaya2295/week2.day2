package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Abi");
		driver.findElement(By.id("lastNameField")).sendKeys("B");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Abi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("B");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description'][@name='description']")).sendKeys("Contact Created");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abinaya@gmail.com");
		WebElement stateprovince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateprovince);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Fill the Important Note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
