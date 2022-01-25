package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().frame(0);
     WebElement item1 = driver.findElement(By.xpath("//li[text()='Item1']"));
     WebElement item2 = driver.findElement(By.xpath("//li[text()='Item2']"));
     WebElement item3 = driver.findElement(By.xpath("//li[text()='Item3']"));	
     WebElement item4 = driver.findElement(By.xpath("//li[text()='Item4']"));		
	Actions builder=new Actions(driver);
           builder.clickAndHold(item2)
            .moveToElement(item4)
               .release(item4).perform();

	
	
	
	
	
	
	
	
	
	}}
