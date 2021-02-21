import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
		"C:\\chrome\\new\\sypernew\\New folder\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.spicejet.com/");
 
driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
while(!driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains("May")) {
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
} 
int count = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
for(int i=0; i<count; i++) {
	String text = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
	if(text.equalsIgnoreCase("21")) {
		driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
	}
}
	}
	
 

	}

 
