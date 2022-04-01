package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFieldAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver editDriver = new ChromeDriver();
		editDriver.get("http://leafground.com/pages/Edit.html");
		editDriver.manage().window().maximize();
		//enter email id
		editDriver.findElement(By.id("email")).sendKeys("abinaya@gmail.com");
		//append the text and give tab
		WebElement appendfield = editDriver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input"));
		appendfield.sendKeys("Abi");
		appendfield.sendKeys(Keys.TAB);
		//get the printed value
		String attribute = editDriver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value");
		System.out.println(attribute);
		//clear the text
		editDriver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		//Check the field is disabled or not
		WebElement disabled = editDriver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
		boolean displayed = disabled.isDisplayed();
		if(displayed)
		{
			System.out.println("The field is disabled");
		}else
		{
			System.out.println("The field is not disabled");
		}		
		editDriver.close();
	}

}
