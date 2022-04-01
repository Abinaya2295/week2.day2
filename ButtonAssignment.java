package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver buttonDriver = new ChromeDriver();
		buttonDriver.get("http://leafground.com/pages/Button.html");
		buttonDriver.manage().window().maximize();
		buttonDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		buttonDriver.findElement(By.id("home")).click();
		//lick on the button link
		buttonDriver.findElement(By.xpath("//h5[text()='Button']/following-sibling::img")).click();
		//Get the position of the button
		Point location = buttonDriver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		//get background color of button
		String color = buttonDriver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(color);
		//width and heigth of the button
		Dimension size = buttonDriver.findElement(By.id("size")).getSize();
		System.out.println(size);
		buttonDriver.close();
	}

}
