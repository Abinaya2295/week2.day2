package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver linkDriver = new ChromeDriver();
		linkDriver.get("http://leafground.com/pages/Link.html");
		linkDriver.manage().window().maximize();
		linkDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		linkDriver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		linkDriver.findElement(By.xpath("//h5[text()='HyperLink']/following-sibling::img")).click();
		String attribute = linkDriver.findElement(By.xpath("//div/a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		System.out.println(attribute);
		WebElement Broken = linkDriver.findElement(By.linkText("Verify am I broken?"));
		Broken.click();
		String title = linkDriver.getTitle();
		if(title.contains("404 Not Found"))
		{
			System.out.println("The page is broken");
		}else
		{
			System.out.println("The page is not broken");
		}
		linkDriver.navigate().back();
		Thread.sleep(3000);
		linkDriver.findElement(By.linkText("Go to Home Page")).click();
		linkDriver.findElement(By.xpath("//h5[text()='HyperLink']/following-sibling::img")).click();
		int size = linkDriver.findElements(By.tagName("a")).size();
		System.out.println(size);
		linkDriver.close();
	}

}
