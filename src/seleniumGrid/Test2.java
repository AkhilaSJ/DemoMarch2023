package seleniumGrid;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.beust.jcommander.Parameters;

public class Test2 {
	public WebDriver driver;

	@Parameters({"browser", "ipaddress"})
	@Test
	public void demo(String browserName,int ip) {
	if(browserName.equals("chrome")) {
		driver=new ChromeDriver();
	}
	
	else {
		driver=new FirefoxDriver();
	}
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	
	URL u=new URL("http://192.168.29.132/wd/hub");
	WebDriver driver=new RemoteWebDriver(u, cap);
	
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("email")).sendKeys("admin");
	}
}
