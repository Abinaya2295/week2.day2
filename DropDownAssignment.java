package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver dropdownDriver = new ChromeDriver();
		dropdownDriver.get("http://leafground.com/pages/Dropdown.html");
		dropdownDriver.manage().window().maximize();
		dropdownDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropdown1 = dropdownDriver.findElement(By.id("dropdown1"));
		Select d1 = new Select(dropdown1);
		d1.selectByIndex(2);
		WebElement dropdown2 = dropdownDriver.findElement(By.name("dropdown2"));
		Select d2 = new Select(dropdown2);
		d2.selectByVisibleText("Appium");
		WebElement dropdown3 = dropdownDriver.findElement(By.id("dropdown3"));
		Select d3 = new Select(dropdown3);
		d3.selectByValue("3");
		WebElement dropdown4 = dropdownDriver.findElement(By.className("dropdown"));
		Select d4 = new Select(dropdown4);
		List<WebElement> options = d4.getOptions();
		System.out.println(options.size());
		WebElement dropdown5 = dropdownDriver.findElement(By.xpath("//select[@class='dropdown']/following::select"));
		dropdown5.sendKeys("Appium");
		dropdownDriver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option")).click();
		Thread.sleep(2000);
		dropdownDriver.close();
	}

}
