package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver checkboxDriver = new ChromeDriver();
		checkboxDriver.get("http://leafground.com/pages/checkbox.html");
		checkboxDriver.manage().window().maximize();
		checkboxDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		checkboxDriver.findElement(By.xpath("(//div/input[@type=\"checkbox\"])[1]")).click();
		checkboxDriver.findElement(By.xpath("(//div/input[@type=\"checkbox\"])[3]")).click();
		boolean selected = checkboxDriver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
		if(selected)
		{
			System.out.println("Selenium is checked");
		}else
		{
			System.out.println("Selenium is not checked");
		}
		checkboxDriver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following-sibling::input)[2]")).click();
		List<WebElement> selectAll = checkboxDriver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		for (WebElement select : selectAll) {
			if(!select.isSelected())
			{
				select.click();
				Thread.sleep(1000);
			}
			
		}
		checkboxDriver.close();
		
	}

}
