package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver imageDriver = new ChromeDriver();
		imageDriver.get("http://leafground.com/pages/Image.html");
		imageDriver.manage().window().maximize();
		imageDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		imageDriver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		Thread.sleep(3000);
		imageDriver.findElement(By.xpath("//h5[text()='Image']/following-sibling::img")).click();
		int height = imageDriver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getSize().getHeight();
		System.out.println(height);
		if(height == 16)
		{
			System.out.println("Image is broken");
		}else
		{
			System.out.println("Image is not broken");
		}
		imageDriver.findElement(By.xpath("//label[contains(text(),'Keyboard or Mouse')]/following-sibling::img")).click();
		imageDriver.close();

	}

}
