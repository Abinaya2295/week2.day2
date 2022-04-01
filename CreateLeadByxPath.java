package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadByxPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password'][@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'company')][@class='inputBox']")).sendKeys("Technology");
		driver.findElement(By.xpath("//input[@name='firstName'][@class='inputBox']")).sendKeys("Mithra");
		driver.findElement(By.xpath("//input[@name='lastName'][@class='inputBox']")).sendKeys("Abi");
		WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select src = new Select(source);
		src.selectByVisibleText("Employee");
		driver.findElement(By.xpath("//input[@name='submitButton'][@class='smallSubmit']")).click();
	
	}

}

//xPath Classroom activity 1. Salesforce

//- //input[@placeholder='First Name']
//- //span[text()='First Name']/parent::label/following-sibling::input
//- //input[contains(@class,'firstName')]
//- (//input[@type='text'])[2]
//- //input[contains(@class,'firstName')][@type='text']
//- //label[@data-aura-class='uiLabel']/following-sibling::input
//- //div/input[contains(@class,'firstName')][@type='text']

//xPath Classroom activity 2.Myntra
// - //label[text()='Flying Machine']/div
// - //div[@class='common-checkboxIndicator']
//- (//span/following-sibling::div[@class='common-checkboxIndicator'])[1]
//- (//span[@class='brand-num']/following-sibling::div[@class='common-checkboxIndicator'])[1]

//xPath Classroom activity 3.get the first lead id
//- (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]
//- (//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]
