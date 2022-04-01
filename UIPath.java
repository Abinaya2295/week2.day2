package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver uipath = new ChromeDriver();
		uipath.get("https://acme-test.uipath.com/login");
		uipath.manage().window().maximize();
		uipath.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		uipath.findElement(By.id("password")).sendKeys("leaf@12");
		uipath.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		String title = uipath.getTitle();
		System.out.println(title);
		uipath.findElement(By.linkText("Log Out")).click();
		uipath.close();

	}

}
