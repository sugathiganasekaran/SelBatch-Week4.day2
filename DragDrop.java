package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.switchTo().frame(0);
WebElement srcc=driver.findElement(By.id("draggable"));
Actions builder=new Actions(driver);
int x=srcc.getLocation().getX();
int y=srcc.getLocation().getY();
builder.dragAndDropBy(srcc, 60, 90).perform();
	
	
	
	
	
	}}
