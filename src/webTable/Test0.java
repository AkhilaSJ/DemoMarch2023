package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[26]"));
		for(WebElement b:ele) {
			System.out.println(b.getText());
		}
	driver.close();
	
		}

}
