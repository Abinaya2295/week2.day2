package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver facebook = new ChromeDriver();
		facebook.get("https://en-gb.facebook.com");
		facebook.manage().window().maximize();
		facebook.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		facebook.findElement(By.linkText("Create New Account")).click();
		facebook.findElement(By.name("firstname")).sendKeys("aaa");
		facebook.findElement(By.name("lastname")).sendKeys("bbb");
		facebook.findElement(By.name("reg_email__")).sendKeys("9876543210");
		facebook.findElement(By.id("password_step_input")).sendKeys("Testleaf2022");
		WebElement Birth_day = facebook.findElement(By.id("day"));
		Select day = new Select(Birth_day);
		day.selectByVisibleText("22");
		WebElement Birth_month = facebook.findElement(By.id("month"));
		Select month = new Select(Birth_month);
		month.selectByIndex(6);
		WebElement Birth_year = facebook.findElement(By.id("year"));
		Select year = new Select(Birth_year);
		year.selectByValue("1995");
		facebook.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
	}

}
