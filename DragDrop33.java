package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop33 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   Actions builder=new Actions(driver);
        WebElement ele=driver.findElement(By.xpath("//li[text()='Item2']"));
        
        
        WebElement dess=driver.findElement(By.xpath("//li[text()='Item6']"));
     builder.clickAndHold(ele).release(dess).perform();
     
     
      builder.dragAndDrop(ele, dess).perform();
     

	
	
	
	
	
	
	
	
	
	
	}}
